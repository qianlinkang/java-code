package code.java.learn.ch7.s4;

import java.util.Date;

public class DateTest {
    public static void main(String[] args) {
        Date d1 = new Date();  // 底层调用System.currentTimeMillis()
        Date d2 = new Date(System.currentTimeMillis() + 100);
        System.out.println(d1.compareTo(d2));
        System.out.println(d1.before(d2));
        System.out.println(d1.getTime());
    }
}
