package code.java.learn.ch7.s8;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class DateTimeFormatterTest {
    public static void main(String[] args) {
        var formatters = new DateTimeFormatter[] {
                // 使用内置静态产量创建DateTimeFormatter实例
                DateTimeFormatter.ISO_LOCAL_DATE,
                DateTimeFormatter.ISO_LOCAL_TIME,
                DateTimeFormatter.ISO_LOCAL_DATE_TIME,
                // 使用本地化创建
                DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL, FormatStyle.MEDIUM),
                DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG),
                // 根据模板字符串来创建DateTimeFormatter实例
                DateTimeFormatter.ofPattern("Gyyyy%%MMM%%dd HH:mm:ss")
        };

        //
        LocalDateTime now = LocalDateTime.now();
        for (DateTimeFormatter formatter : formatters) {
            System.out.println(now.format(formatter));
            System.out.println(formatter.format(now));
        }

        // 解析
        String str1 = "2024年1月24日 06:30:33";
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy年M月dd日 HH:mm:ss");
        //  LocalDateTime.parse 借助解析器处理str1, 返回LocalDateTime
        LocalDateTime ans = LocalDateTime.parse(str1, dateTimeFormatter);
        System.out.println(ans);
    }
}
