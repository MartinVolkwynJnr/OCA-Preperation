package Chapter_3;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class DatesAndTimes {
    /*
        - Creating Dates and Times
        - Manipulating Dates and Times
        - Working with Periods
        - Formatting Dates and Times
        - Parsing Dates and Times
     */

    private static String dateTimeString = "2022-01-31T20:20:00";
    private static String dateString = "2022-01-15";
    private static String TimeString = "12:30:00";

    public static void printLocalDates(){
        LocalDate localDate = LocalDate.now();
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalTime localTime = LocalTime.now();

        System.out.println(localDate.format(DateTimeFormatter.ISO_DATE));
        System.out.println(localDateTime.format(DateTimeFormatter.ISO_DATE_TIME));
        System.out.println(localTime.format(DateTimeFormatter.ISO_TIME));
    }

    public static void printStringDates(){
        LocalDate localDate = LocalDate.now();
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalTime localTime = LocalTime.now();

        System.out.println(LocalDate.parse(dateString).format(DateTimeFormatter.ISO_DATE));
        System.out.println(LocalDateTime.parse(dateTimeString).format(DateTimeFormatter.ISO_DATE_TIME));
        System.out.println(LocalTime.parse(TimeString).format(DateTimeFormatter.ISO_TIME));
    }

    public static void printCustomDates(){
        LocalDate loganBday = LocalDate.of(2020, Month.SEPTEMBER,14);
        LocalDateTime randomTimeOnLoganBday = LocalDateTime.of(2020, Month.SEPTEMBER,14,6,40);
        LocalTime randomTime = LocalTime.of(4,40,30,23);

        System.out.println(loganBday.format(DateTimeFormatter.ISO_DATE));
        System.out.println(randomTimeOnLoganBday.format(DateTimeFormatter.ISO_DATE_TIME));
        System.out.println(randomTime.format(DateTimeFormatter.ISO_TIME));
    }
}
