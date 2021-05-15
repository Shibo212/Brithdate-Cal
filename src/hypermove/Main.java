package hypermove;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner my_year = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter year of birth");
        Long year = my_year.nextLong();

        LocalDateTime fromDateTime = LocalDateTime.of(Math.toIntExact(year), 12, 2, 12, 12, 12);
        LocalDateTime toDateTime = LocalDateTime.now();
        LocalDateTime birthAge = LocalDateTime.from( fromDateTime );

        long Months = ChronoUnit.MONTHS.between(birthAge , toDateTime);
        long Days = ChronoUnit.DAYS.between(birthAge , toDateTime);
        long Hours = ChronoUnit.HOURS .between(birthAge , toDateTime);
        long Minutes = ChronoUnit.MINUTES.between(birthAge , toDateTime);
        long Seconds = ChronoUnit.SECONDS.between(birthAge , toDateTime);

        long years = birthAge.until( toDateTime, ChronoUnit.YEARS );
        birthAge = birthAge.plusYears( years );

        long months = birthAge.until( toDateTime, ChronoUnit.MONTHS );
        birthAge = birthAge.plusMonths( months );

        long days = birthAge.until( toDateTime, ChronoUnit.DAYS );
        birthAge = birthAge.plusDays( days );


        long hours = birthAge.until( toDateTime, ChronoUnit.HOURS );
        birthAge = birthAge.plusHours( hours );

        long minutes = birthAge.until( toDateTime, ChronoUnit.MINUTES );
        birthAge = birthAge.plusMinutes( minutes );

        long seconds = birthAge.until( toDateTime, ChronoUnit.SECONDS );

        System.out.println("how many Months have i lived ? = " + Months);
        System.out.println("how many Days have i lived ? = " + Days);
        System.out.println("how many Hours have i lived ? = " + Hours);     
        System.out.println("how many Minutes have i lived ? = " + Minutes);
        System.out.println("how many Seconds have i lived ? = " + Seconds);
        System.out.print("My age is = ");
        System.out.println( years + " years " +
                 months + " months " +
                days + " days " +
                hours + " hours " +
                minutes + " minutes " +
                seconds + "seconds");
        System.out.println("Made by Shehab via Git UI in Intellij");

    }
}
