package cn.joinhealth.controller;

import lombok.extern.java.Log;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * FileUploadController
 *
 * @author jlin
 * @date 2018/11/8 20:36
 */
@Controller
@RequestMapping(value = "/file")
@Log
public class FileUploadController {
	private static final String FILE_PATH = "/Users/linjian/Documents";

	/**
	 * 获取file.html页面
	 *
	 * @return
	 */
	@RequestMapping("toFile")
	public String file() {
		return "file";
	}

	/**
	 * 获取multiFile.html页面
	 *
	 * @return
	 */
	@RequestMapping("toMultiFile")
	public String multifile() {
		return "multiFile";
	}

	/**
	 * 实现文件上传
	 *
	 * @return
	 */
	@RequestMapping(value = "fileUpload")
	@ResponseBody
	public String fileUpload(@RequestParam("fileName") MultipartFile file) {
		if (file.isEmpty()) {
			return "false";
		}
		String fileName = file.getOriginalFilename();
		int size = (int) file.getSize();
		log.info(fileName + "-->" + size);

		File dest = new File(FILE_PATH + "/" + fileName);
		//判断文件父目录是否存在
		if (!dest.getParentFile().exists()) {
			dest.getParentFile().mkdir();
		}
		try {
			//保存文件
			file.transferTo(dest);
			return "true";
		} catch (IllegalStateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "false";
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "false";
		}
	}

	/**
	 * 实现多文件上传
	 *
	 * @return
	 */
	@RequestMapping(value = "multiFileUpload")
	@ResponseBody
	public String multiFileUpload(HttpServletRequest request) throws Exception {
		List<MultipartFile> files = ((MultipartHttpServletRequest) request).getFiles("fileName");
		if (files.isEmpty()) {
			return "false";
		}
		for (MultipartFile file : files) {
			String fileName = file.getOriginalFilename();
			int size = (int) file.getSize();
			log.info(fileName + "-->" + size);

			if (file.isEmpty()) {
				return "false";
			} else {
				File dest = new File(FILE_PATH + "/" + fileName);
				//判断文件父目录是否存在
				if (!dest.getParentFile().exists()) {
					dest.getParentFile().mkdir();
				}
				try {
					file.transferTo(dest);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					return "false";
				}
			}
		}
		return "true";
		//MultipartHttpServletRequest multipartHttpServletRequest = (MultipartHttpServletRequest) request;
		//Map<String, MultipartFile> fileMap = multipartHttpServletRequest.getFileMap();
		//if (!CollectionUtils.isEmpty(fileMap)) {
		//	for (Iterator<Map.Entry<String, MultipartFile>> it = fileMap.entrySet().iterator(); it.hasNext(); ) {
		//		Map.Entry<String, MultipartFile> entry = it.next();
		//		MultipartFile file = entry.getValue();
		//		//获取文件名
		//		String fileName = file.getOriginalFilename();
		//		//获取文件大小
		//		long fileSize = file.getSize();
		//		//获取文件内容
		//		byte[] fileBytes = file.getBytes();
		//		//获取文件类型名字
		//		String fileType = file.getContentType().substring(0, file.getContentType().lastIndexOf(";"));
		//	}
		//}
	}
}
