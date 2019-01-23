package cn.joinhealth.util;

import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.codec.binary.Hex;
import org.apache.commons.codec.digest.DigestUtils;

import java.io.UnsupportedEncodingException;

/**
 * CommonsCodec
 *
 * @author jlin
 * @date 2018/12/4 22:07
 */
public class CommonsCodec {

	public static void main(String[] args) throws UnsupportedEncodingException, DecoderException {
		System.out.println("Base64 ---------------------------------------------");
		Base64 base64 = new Base64();
		String str = "AAaaa我";
		//编码
		String result = base64.encodeToString(str.getBytes("UTF-8"));
		System.out.println(result);
		//解码
		byte[] decode = base64.decode(result.getBytes());
		System.out.println(new String(decode) );
		System.out.println();

		System.out.println("Hex ---------------------------------------------");
		str = "test";
		/**编码*/
		//直接一步到位
		String hexString = Hex.encodeHexString(str.getBytes("UTF-8"));
		System.out.println(hexString);
		//先转换成char数组，第二个参数意思是是否全部转换成小写
		char[] encodeHex = Hex.encodeHex(str.getBytes(), true);
		System.out.println(new String(encodeHex));
		/**解码*/
		//char数组型的
		byte[] decodeHex = Hex.decodeHex(encodeHex);
		System.out.println(new String(decodeHex));
		//字符串类型的，该方法要求传入的是char[]
		byte[] decodeHex2 = Hex.decodeHex(hexString.toCharArray());
		System.out.println(new String(decodeHex2));
		System.out.println();

		System.out.println("MD5 ---------------------------------------------");
		str = "test";
		String md5 = DigestUtils.md5Hex(str.getBytes("UTF-8"));
		System.out.println(md5);
		System.out.println();

		System.out.println("SHA ---------------------------------------------");
		str = "test中国";
		String sha1Hex = DigestUtils.sha1Hex(str.getBytes("UTF-8"));
		System.out.println(sha1Hex);
		System.out.println();
	}

}
