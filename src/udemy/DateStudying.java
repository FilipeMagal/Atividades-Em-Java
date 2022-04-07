package udemy;

import java.time.Instant;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DateStudying {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date x = Date.from(Instant.parse("2022-04-01T23:31:05Z"));

        System.out.println(sdf.format(x));

        Calendar cal = Calendar.getInstance();
        cal.setTime(x);
        int minutes = cal.get(Calendar.MINUTE);
        int month = 1+cal.get(Calendar.MONTH);
        cal.add(Calendar.DAY_OF_MONTH, 5);
        x = cal.getTime();
        System.out.println("Minutes: " +minutes);
        System.out.println("Month: " +month);



    }
}
