package Chapter_3;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class DatesAndTimes {
    /*
    DATES ARE IMMUTABLE needs reassigning to update variable
        - Creating Dates and Times
        - Manipulating Dates and Times
        - Working with Periods
        - Formatting Dates and Times
        - Parsing Dates and Times
     */

    private static String dateTimeString = "2022-01-31T20:20:00";
    private static String dateString = "2022-01-15";
    private static String TimeString = "12:30:00";

    public void manipulatingDates(){
        LocalDate date = LocalDate.of(2014, Month.MAY, 4);
        System.out.println(date);
        date = date.plusDays(3);
        System.out.println(date);
        date = date.plusWeeks(2);
        System.out.println(date);
        date = date.plusMonths(1);
        System.out.println(date);
        date = date.plusYears(6);
        System.out.println(date);
        date = date.minusDays(3);
        System.out.println(date);
        date = date.minusWeeks(2);
        System.out.println(date);
        date = date.minusMonths(1);
        System.out.println(date);
        date = date.minusYears(6);
        System.out.println(date);

        LocalTime time = LocalTime.of(8,30);
        System.out.println(time);
        time = time.minusMinutes(10);
        System.out.println(time);
        time = time.minusHours(10);
        System.out.println(time);
        time = time.plusMinutes(10);
        System.out.println(time);
        time = time.plusHours(10);
        System.out.println(time);
        time = time.minusSeconds(10);
        System.out.println(time);

        LocalDateTime datetime = LocalDateTime.of(2022,Month.JUNE, 7,9,5);
        System.out.println(datetime);
        datetime = datetime.plusDays(2).minusMinutes(20).plusHours(2).minusDays(2);
        System.out.println(datetime);

        /*
                                            Can call on LocalDate?  Can call on LocalTime?      Can call on LocalDateTime?
                plusYears/minusYears        Yes                     No                          Yes
                plusMonths/minusMonths      Yes                     No                          Yes
                plusWeeks/minusWeeks        Yes                     No                          Yes
                plusDays/minusDays          Yes                     No                          Yes
                plusHours/minusHours        No                      Yes                         Yes
                plusMinutes/minusMinutes    No                      Yes                         Yes
                plusSeconds/minusSeconds    No                      Yes                         Yes
                plusNanos/minusNanos        No                      Yes                         Yes
         */
    }

    public void workingWithPeriods(){
        LocalDate start = LocalDate.of(2015, Month.JANUARY, 1);
        LocalDate end = LocalDate.of(2015,Month.MARCH,30);
        //this works but can't be reused
        while(start.isBefore(end)){
            System.out.println("Give new toy: " + start);
            start = start.plusMonths(1);
        }
        ///////////////////////
        start = LocalDate.of(2015, Month.JANUARY, 1);
        end = LocalDate.of(2015,Month.MARCH,30);
        Period p = Period.ofMonths(1);
        //this works for more reusable
        while(start.isBefore(end)){
            System.out.println("Give new toy: " + start);
            start = start.plus(p);
        }
        // Period can't be chained. only last method will be used all methods are static

    }

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

        DateTimeFormatter f1 = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        DateTimeFormatter f2 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
        DateTimeFormatter f3 = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);

        DateTimeFormatter f4 = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
        DateTimeFormatter f5 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
        DateTimeFormatter f6 = DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM);

        System.out.println(f1.format(loganBday));               // Legal
        System.out.println(f2.format(loganBday));               // throws RuntimeException
        System.out.println(f3.format(loganBday));               // throws RuntimeException
        System.out.println(f4.format(loganBday));               // Legal
        System.out.println(f5.format(loganBday));               // throws RuntimeException
        System.out.println(f6.format(loganBday));               // throws RuntimeException

        System.out.println(f1.format(randomTimeOnLoganBday));   // Legal
        System.out.println(f2.format(randomTimeOnLoganBday));   // Legal
        System.out.println(f3.format(randomTimeOnLoganBday));   // Legal
        System.out.println(f4.format(randomTimeOnLoganBday));   // Legal
        System.out.println(f5.format(randomTimeOnLoganBday));   // Legal
        System.out.println(f6.format(randomTimeOnLoganBday));   // Legal

        System.out.println(f1.format(randomTime));               // throws RuntimeException
        System.out.println(f2.format(randomTime));               // throws RuntimeException
        System.out.println(f3.format(randomTime));               // Legal
        System.out.println(f4.format(randomTime));               // throws RuntimeException
        System.out.println(f5.format(randomTime));               // throws RuntimeException
        System.out.println(f6.format(randomTime));               // Legal


        /*
                DateTime format patterns
                (MM-dd-yyy)
                MMMM -> month - M - 1, MM - 01, MMM - Jan and MMMM - January

                dd -> day

                yyyy -> year

                hh -> hour
                mm -> minutes
                : -> colon print
         */
    }
}
