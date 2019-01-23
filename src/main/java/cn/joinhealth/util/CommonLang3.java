package cn.joinhealth.util;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.SystemUtils;

/**
 * CommonLang3
 *
 * @author jlin
 * @date 2018/12/4 21:38
 */
public class CommonLang3 {
	public static void main(String[] args) {
		//StringUtils
		println(String.valueOf(StringUtils.isNotBlank(" ")));
		println(String.valueOf(StringUtils.isNotEmpty(" ")));
		println("-----------------------------------------------------------");

		//abbreviate(String str, int maxWidth) 回一个指定长度加省略号的字符串，maxWidth必须大于3
		println(StringUtils.abbreviate(null, 1));
		println(StringUtils.abbreviate("", 4));
		println(StringUtils.abbreviate("abcdefg", 4));
		println(StringUtils.abbreviate("abcdefg", 6));
		println(StringUtils.abbreviate("abcdefg", 7));
		println(StringUtils.abbreviate("abcdefg", 8));
		println("-----------------------------------------------------------");

		//center(String str, int size) 用空格字符填充使字符串str位于长度为size的大字符串中间
		println(StringUtils.center(null, 1));
		println(StringUtils.center("", 4));
		println(StringUtils.center("ab", -1));
		println(StringUtils.center("ab", 4));
		println(StringUtils.center("abcd", 2));
		println(StringUtils.center("a", 4));
		println("-----------------------------------------------------------");

		println((SystemUtils.IS_OS_MAC));
		println(SystemUtils.JAVA_HOME);
	}

	private static void println(Object object) {
		System.out.println(object);
	}
}
