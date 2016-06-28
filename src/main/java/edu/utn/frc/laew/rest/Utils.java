/*
 * *********COPYRIGHT BY JOHN N. DEMOS 2016. ALL RIGHTS RESERVED.********
 */
package edu.utn.frc.laew.rest;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;

/**
 *
 * @author patri_000
 */
public final class Utils {
    
    public static String getDateTimeAsString(DateTime date) {        
        return DateTimeFormat.forPattern("MM/dd/yyyy").print(date);        
    }
    
    public static DateTime getStringAsDateTime(String strdate) {        
        return DateTimeFormat.forPattern("MM/dd/yyyy").parseDateTime(strdate);        
    }
    
    public static boolean areEqualDates(DateTime date1, DateTime date2) {
        if(date1.getDayOfMonth() == date2.getDayOfMonth() 
           && date1.getMonthOfYear() == date2.getMonthOfYear()
           && date1.getYear() == date2.getYear())
            return true;
        return false;
    }
}
