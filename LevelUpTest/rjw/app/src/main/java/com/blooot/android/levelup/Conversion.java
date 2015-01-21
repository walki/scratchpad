package com.blooot.android.levelup;

import org.apache.http.impl.cookie.DateParseException;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Created by rjw on 1/21/2015.
 */
public final  class Conversion {

    public static double milesToMeters(String miles){
        double mi = 0.0;
        try{
            mi = Double.parseDouble(miles);
        }
        catch (NumberFormatException ex){
            // Nada
        }
        return milesToMeters(mi);
    }

    public static double milesToMeters(double miles){
        return miles * 1609.344; // international mile
                                 // apparently there is a survey mile which is still used in land surveying, 1609.347219m, 1/8 inch longer than the int'l mile.
    }

    // This is limited in many ways, including a 24 hour limit!
    // TODO: Look at Joda-Time (until Java * is available)
    public static long TimeToMilliSeconds(String hhmmss)
    {
        long ms = 0;
        DateFormat format = new SimpleDateFormat("HH:mm:ss");
        try {
            Date date = (Date) format.parse(hhmmss);
            ms  = DateToMilliseconds(date);
        }
        catch (ParseException ex){
            // Nada
        }
        return ms;
    }

    public static long DateToMilliseconds(Date d)
    {
        Calendar cal = GregorianCalendar.getInstance();
        cal.setTime(d);
        long h =  cal.get(Calendar.HOUR_OF_DAY);
        long m =  cal.get(Calendar.MINUTE);
        long s =  cal.get(Calendar.SECOND);
        return h * 60 * 60 * 1000 + m * 60*1000 + s * 1000;
    }

}
