package code.java.learn.ch7.s4;

import java.time.*;
import java.util.Arrays;
import java.util.Date;

/**
 * 日期,时间包
 */
public class NewDatePackageTest {
    public static void main(String[] args) {
        // Clock
        Clock clock = Clock.systemUTC();
        System.out.println(clock.instant());
        System.out.println(clock.millis());  // 等价于System.currentTimeMills
        System.out.println(System.currentTimeMillis());

        // Duration
        System.out.println("===");
        Duration duration = Duration.ofSeconds(6000);  // 6000秒
        System.out.println(duration.toMinutes());
        System.out.println(duration.toDays());
        // 在clock的基础上加上duration
        Clock offset = Clock.offset(clock, duration);
        System.out.println(offset.instant());

        // Instance
        System.out.println("===");
        Instant instant = Instant.now();
        System.out.println(new Date());
        System.out.println(instant);
        System.out.println(instant.plusSeconds(6000));
        // instant基础上加上指定Duration
        System.out.println(instant.plus(Duration.ofHours(5).plusMinutes(4)));

        // LocalDate
        System.out.println("===");
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
        // 获得2014年的地146天
        System.out.println(LocalDate.ofYearDay(2014, 146));
        // 设置为2014年5月21里
        System.out.println(LocalDate.of(2014, Month.MAY, 21));

        // LocalTime
        System.out.println("===");
        System.out.println(LocalTime.now());

        // LocalDateTime
        System.out.println("===");
        System.out.println(LocalDateTime.now());

        // Year,YearMonth,MonthDay
        System.out.println("===");
        System.out.println(Year.now());
        System.out.println(Year.now().atMonth(10));
        System.out.println(MonthDay.now());

        // DayOfWeek
        System.out.println(DayOfWeek.valueOf("MONDAY"));
        System.out.println(DayOfWeek.of(2));
        System.out.println(DayOfWeek.MONDAY.getValue());  // 1

    }
}
