package BasicQns;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class DateTimeFormat {
    public static void main(String[] args) {
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat ("yyyy/mm/dd HH:MM:SS z");


        Date current_date=new Date (  );

        simpleDateFormat.setTimeZone (TimeZone.getTimeZone ("IST"));

        System.out.println (simpleDateFormat.format (current_date));
    }
}
