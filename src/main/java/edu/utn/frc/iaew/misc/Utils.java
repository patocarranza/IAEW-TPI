/*
 * *********COPYRIGHT BY JOHN N. DEMOS 2016. ALL RIGHTS RESERVED.********
 */
package edu.utn.frc.iaew.misc;

import edu.utn.frc.iaew.ORM.Util.HibernateUtil;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import org.apache.log4j.Logger;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;

/**
 *
 * @author patri_000
 */
public final class Utils {
    
    private static final Logger LOG = Logger.getLogger(HibernateUtil.class);
    
    public static String getDateTimeAsString(DateTime date) {        
        return DateTimeFormat.forPattern("dd/MM/yyyy").print(date);        
    }
    
    public static DateTime getStringAsDateTime(String strdate) {        
        return DateTimeFormat.forPattern("dd/MM/yyyy").parseDateTime(strdate);        
    }
    
    public static boolean areEqualDates(DateTime date1, DateTime date2) {
        if(date1.getDayOfMonth() == date2.getDayOfMonth() 
           && date1.getMonthOfYear() == date2.getMonthOfYear()
           && date1.getYear() == date2.getYear())
            return true;
        return false;
    }
    
    /*
     * Converts java.util.Date to javax.xml.datatype.XMLGregorianCalendar
     */
    public static XMLGregorianCalendar toXMLGregorianCalendar(Date date){
        GregorianCalendar gCalendar = new GregorianCalendar();
        gCalendar.setTime(date);
        XMLGregorianCalendar xmlCalendar = null;
        try {
            xmlCalendar = DatatypeFactory.newInstance().newXMLGregorianCalendar(gCalendar);
        } catch (DatatypeConfigurationException ex) {
            LOG.error("Error en la transformacion de date a XMLGregorianCalendar ", ex);
        }
        return xmlCalendar;
    }
  
    /*
     * Converts XMLGregorianCalendar to java.util.Date in Java
     */
    public static Date toDate(XMLGregorianCalendar calendar){
        if(calendar == null) {
            return null;
        }
        return calendar.toGregorianCalendar().getTime();
    }

}
