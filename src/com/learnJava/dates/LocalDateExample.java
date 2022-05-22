package com.learnJava.dates;

import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

public class LocalDateExample {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println("localDate : " + localDate);

        LocalDate customDate = LocalDate.of(2018, 07, 17);
        System.out.println("customDate : " + customDate);

        LocalDate customDate1 = LocalDate.ofYearDay(2021, 321);
        System.out.println("customDate1 : " + customDate1);

        /**
         * Get values from LocalDate
         */
        System.out.println("getMonth : " + localDate.getMonth());
        System.out.println("getMonthValue : " + localDate.getMonthValue());
        System.out.println("getDayOfWeek : " + localDate.getDayOfWeek());
        System.out.println("getDayOfYear : " + localDate.getDayOfYear());
        System.out.println("Day of the Month using get : " + localDate.get(ChronoField.DAY_OF_MONTH));

        /**
         * Modifying Local Date
         */
        System.out.println("plusDays : " + localDate.plusDays(2));
        System.out.println("plusMonths : " + localDate.plusMonths(2));
        System.out.println("minusDays : " + localDate.minusDays(2));
        System.out.println("withYear : " + localDate.withYear(2019));
        System.out.println("with ChronoField : " + localDate.with(ChronoField.YEAR, 2020));
        System.out.println("with TemporalAdjusters : " + localDate.with(TemporalAdjusters.firstDayOfNextMonth()));
        System.out.println("ChronoUnit minus : " + localDate.minus(1, ChronoUnit.YEARS));

        /**
         * Unsupported
         */
        //System.out.println("ChronoUnit minus : " + localDate.minus(1, ChronoUnit.MINUTES));
        System.out.println("isSupported : " + localDate.isSupported(ChronoUnit.MINUTES));
        System.out.println("isSupported : " + localDate.isSupported(ChronoUnit.YEARS));

        /**
         * Additional support methods
         */
        System.out.println("leapyear " + LocalDate.ofYearDay(2020, 1).isLeapYear());
        System.out.println("isEqual " + localDate.isEqual(customDate));
        System.out.println("isBefore " + localDate.isBefore(customDate));
        System.out.println("isAfter " + localDate.isAfter(customDate));
    }
}
