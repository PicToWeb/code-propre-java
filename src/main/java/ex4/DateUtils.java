package ex4;

import java.text.SimpleDateFormat;
import java.util.Date;

/** Class who proposes any methods to transform date on String 
 * 
 */
public class DateUtils {

	/** DEFAULT_FORMAT */
	private static final String DEFAULT_FORMAT = "dd/MM/yyyy HH:mm:ss";

	/** Transform a date on String on keeping display format
	 * @param pattern display format
	 * @param date date to format
	 * @return
	 */
	public static String format(String pattern, Date date) {

		SimpleDateFormat formateur = new SimpleDateFormat(pattern);
		return formateur.format(date);
	}

	/** Transform a date on String using default display format
	 * @param date date to format
	 * @return
	 */
	public static String formatDefaut(Date date) {

		return format(DEFAULT_FORMAT, date);
	}
}
