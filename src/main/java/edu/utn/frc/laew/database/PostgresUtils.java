package edu.utn.frc.laew.database;

import edu.utn.frc.iaew.misc.Utils;
import org.joda.time.DateTime;

/**
 *
 * @author patri_000
 */
public final class PostgresUtils {
    
    public static String datetimeToDate(DateTime date) {
        return "to_date('" + Utils.getDateTimeAsString(date) + "', 'mm/dd/yyyy')";
    }
    
    public static String dateToChar(String columnName) {
        return "to_char(" + columnName + ", 'mm/dd/yyyy')";
    }
}
