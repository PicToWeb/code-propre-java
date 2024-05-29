package ex4;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Class who proposes any methods to transform date into String
 * 
 */
public class DateUtils {

	/** DEFAULT_FORMAT */
	private static final String DEFAULT_FORMAT = "dd/MM/yyyy HH:mm:ss";

	/**
	 * Transform a date into String while keeping a display format
	 * 
	 * @param pattern display format
	 * @param date    date to format
	 * @return
	 */
	public static String format(String pattern, Date date) {

		SimpleDateFormat formateur = new SimpleDateFormat(pattern);
		return formateur.format(date);
	}

	/**
	 * Transform a date into String while keeping a default display format
	 * 
	 * @param date date to format
	 * @return
	 */
	public static String formatDefaut(Date date) {

		return format(DEFAULT_FORMAT, date);
	}
}
