package utilities;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.regex.Pattern;

/**
 * Provides different kind of Utilities for the project
 * @author augusticor
 */
public class Utilities {

	/**
	 * Converts Calendar class to string format
	 * @param calendar the calendar type to transform
	 * @return the string representing the calendar with output format "hour:minutes:seconds"
	 */
	public static String calendarToStringWithFormat(Calendar calendar) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
		Date dateToFormat = calendar.getTime();
		return dateFormat.format(dateToFormat);
	}
	
	/**
	 * Splits the information from the file, which it's data is separated by the , character
	 * @return a regular expression to divide the file data
	 */
	public static String splitLabyrinthFileInfo() {
		Pattern pattern = Pattern.compile(",{1,6}");
		return pattern.toString();
	}
}