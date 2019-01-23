package cn.joinhealth.util;

import org.apache.commons.lang.StringUtils;

import java.util.regex.Pattern;

/**
 * RegexUtil
 *
 * @author jlin
 * @date 2018/12/20 19:41
 * @Description
 */
public class RegexUtil {
	private static final String REGEX_EMAIL = "^[a-z\\d]+(\\.[a-z\\d]+)*@([\\da-z](-[\\da-z])?)+(\\.{1,2}[a-z]+)+$";

	public static boolean checkEmail(String str) {
		if (StringUtils.isBlank(str)){
			return false;
		}
		return Pattern.compile(REGEX_EMAIL).matcher(str).matches();
	}

	public static void main(String[] args) {
		System.out.println(checkEmail(null));
		System.out.println(checkEmail("linjian"));
		System.out.println(checkEmail("linjian19881026@163.com"));
	}

}
