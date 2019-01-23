package cn.joinhealth.util;

import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

/**
 * JodaTime
 *
 * @author jlin
 * @date 2019/1/23 10:21
 * @Description
 */
public class JodaTime {

	public static void main(String[] args) {
		//construct();
		//converse();
		//query();
		//accessField();
		//changingTimeZone();
		//changingChronology();
		//customFormat();
		dateTimeMethods();
	}

	private static void construct() {
		System.out.println("construct start");
		DateTime dt = new DateTime();
		System.out.println(dt);
		DateTime dt1 = new DateTime("2004-12-13T21:39:45.618-08:00");
		System.out.println(dt1);
		System.out.println("construct end\n");
	}

	private static void converse() {
		System.out.println("converse JDK Date start");
		// JDK Date
		// from Joda to JDK
		System.out.print("from Joda to JDK: ");
		DateTime dt = new DateTime();
		Date jdkDate = dt.toDate();
		System.out.println(jdkDate);
		// from JDK to Joda
		System.out.print("from JDK to Joda: ");
		dt = new DateTime(jdkDate);
		System.out.println(dt);
		System.out.println("converse JDK Date end\n");

		// JDK Calendar
		// from Joda to JDK
		System.out.println("converse JDK Calendar start");
		System.out.print("from Joda to JDK: ");
		DateTime dt1 = new DateTime();
		Calendar jdkCal = dt1.toCalendar(Locale.CHINESE);
		System.out.println(jdkCal);
		// from JDK to Joda
		System.out.print("from JDK to Joda: ");
		dt1 = new DateTime(jdkCal);
		System.out.println(dt1);
		System.out.println("converse JDK Calendar end\n");

		// JDK GregorianCalendar
		// from Joda to JDK
		System.out.println("converse JDK GregorianCalendar start");
		System.out.print("from Joda to JDK: ");
		DateTime dt2 = new DateTime();
		GregorianCalendar jdkGCal = dt2.toGregorianCalendar();
		System.out.println(jdkGCal);
		// from JDK to Joda
		System.out.print("from JDK to Joda: ");
		dt2 = new DateTime(jdkGCal);
		System.out.println(dt2);
		System.out.println("converse JDK GregorianCalendar end\n");
	}

	private static void query() {
		System.out.println("query start");
		DateTime dt = new DateTime();
		System.out.println("year: " + dt.getYear());
		System.out.println("month: " + dt.getMonthOfYear());
		System.out.println("day: " + dt.getDayOfMonth());
		System.out.println("hour: " + dt.getHourOfDay());
		System.out.println("minute: " + dt.getMinuteOfHour());
		System.out.println("second: " + dt.getSecondOfMinute());
		System.out.println("query end\n");
	}

	private static void accessField() {
		System.out.println("accessField start");
		DateTime dt = new DateTime();
		DateTime.Property pDoW = dt.dayOfWeek();
		System.out.println(pDoW.get());
		System.out.println(pDoW.getAsText());
		System.out.println(pDoW.getAsText(Locale.ENGLISH));
		System.out.println(pDoW.getAsShortText(Locale.ENGLISH));
		System.out.println("accessField end\n");
	}

	private static void changingTimeZone() {
		System.out.println("changingTimeZone start");
		// get current moment in default time zone
		DateTime dt = new DateTime();
		System.out.println(dt);
		// translate to London local time
		DateTime dtLondon = dt.withZone(DateTimeZone.forID("Europe/London"));
		System.out.println(dtLondon);
		System.out.println("changingTimeZone end\n");
	}

	private static void changingChronology() {
		System.out.println("changingChronology start");
		// get current moment in default time zone
		DateTime dt = new DateTime();
		System.out.println(dt.getYear());
		// change to Buddhist chronology
		DateTime dtBuddhist = dt.withChronology(BuddhistChronology.getInstance());
		System.out.println(dtBuddhist.getYear());
		System.out.println("changingChronology end\n");
	}

	private static void customFormat() {
		System.out.println("customFormat start");
		DateTime dt = new DateTime();
		DateTimeFormatter fmt = DateTimeFormat.forPattern("yyyy-MM-dd");
		DateTimeFormatter fmt1 = DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss");
		System.out.println(fmt.print(dt));
		System.out.println(fmt1.print(dt));
		System.out.println("customFormat end\n");
	}

	private static void dateTimeMethods() {
		System.out.println("dateTimeMethods start");
		DateTime dt = new DateTime();
		System.out.println("dateTime: " + dt);
		System.out.println("month max value: " + dt.dayOfMonth().withMaximumValue());
		System.out.println("month min value: " + dt.dayOfMonth().withMinimumValue());
		System.out.println("plus 3 day" + dt.plusDays(3));
		System.out.println("minus 3 day" + dt.minusDays(3));
		System.out.println("plus 1 month" + dt.plusMonths(1));
		System.out.println("minus 1 month" + dt.minusMonths(1));
		System.out.println("dateTimeMethods end\n");
	}
}
