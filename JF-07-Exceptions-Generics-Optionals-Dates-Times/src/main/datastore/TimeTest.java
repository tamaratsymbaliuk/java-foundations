package main.datastore;

import java.time.*;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class TimeTest {
    public static void main(String[] args) {
        System.out.println(LocalDate.now());

        LocalDate newYears = LocalDate.of(2025, 1, 1);
        LocalDate newYears1 = LocalDate.of(2024, 1, 1);
        System.out.println(newYears.getDayOfWeek());
        LocalDate.now().datesUntil(newYears, Period.ofMonths(1))
                .forEach(System.out::println);

        System.out.println(LocalTime.now());

        LocalDateTime ldt = LocalDateTime.of(2000, 12, 3, 12, 36, 0);

        System.out.println(Period.between(newYears, newYears1));
        //System.out.println(Duration.between(newYears, newYears1));
        System.out.println(ZonedDateTime.of(ldt, ZoneId.systemDefault()));

        LocalDateTime xmas = LocalDateTime.of(2021, 12, 25, 12, 00);
        // California - GMT -08
        ZonedDateTime zxmas = ZonedDateTime.of(xmas, ZoneId.of("-8"));
        System.out.println(zxmas.withZoneSameInstant(ZoneId.of("+0")));

        System.out.println(xmas.with(TemporalAdjusters.next(DayOfWeek.TUESDAY)));;
    }
}
