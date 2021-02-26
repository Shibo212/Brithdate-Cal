package hypermove;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Main {

    public static void main(String[] args) {


        LocalDate today = LocalDate.now();
        LocalDate birthDate = LocalDate.of(1994, 12, 02);
        int years = Period.between(birthDate, today).getYears();
        long Months = ChronoUnit.MONTHS.between(birthDate , today);
        long Days = ChronoUnit.DAYS.between(birthDate , today);


        System.out.println("Date of Today = " + today);
        System.out.println("My Brith Date = " + birthDate);
        System.out.println("I'm " + years +" Years Old");
        System.out.println(" How many MONTH have i lived = " + Days);
        System.out.println(" How many DAYS have i lived = " + Months);
    }

}


