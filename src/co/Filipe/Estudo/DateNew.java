package co.Filipe.Estudo;

import java.util.Date;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class DateNew {
    public static void main(String[] args)throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date y = new Date();

        System.out.println(sdf.format(y));
        

    }
}
