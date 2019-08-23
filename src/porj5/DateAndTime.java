package porj5;

import java.util.*;
public class DateAndTime {
    public static void main (String args[])
    {
        int day, month, yera;
        int secode, minute, hour;
        GregorianCalendar date = new GregorianCalendar();
        day = date.get(Calendar.DAY_OF_MONTH);
        month = date.get(Calendar.MONTH);
        yera = date.get(Calendar.YEAR);
        secode = date.get(Calendar.SECOND);
        minute = date.get(Calendar.MINUTE);
        hour = date.get(Calendar.HOUR);

        System.out.println("Date is " + day + "/" + (month+1) + "/" + yera);
        System.out.println("Time is " + hour + ":" + minute + ":" + secode);
    }
}
