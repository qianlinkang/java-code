package code.java.learn.ch7.s4;

import static java.util.Calendar.*;
import static java.util.Calendar.getInstance;

import java.util.Calendar;
import java.util.Date;

public class CalendarTest {
    public static void main(String[] args) {
        // Calendar是抽象类,需要创建一个默认的对象,getInstance
        Calendar calendar = Calendar.getInstance();
        // 从calendar中取出一个Date对象
        Date date = calendar.getTime();
        System.out.println(date);

        // Calendar没有构造函数可以接受Date对象
        // 需要先拿到Calendar实例,再通过setTime创建
        Calendar calendar1 = Calendar.getInstance();
        System.out.println(calendar1);
        calendar1.setTime(date);
        System.out.println(calendar1);

        //
        System.out.println("===");
        System.out.println(calendar1.get(YEAR));
        System.out.println(calendar1.get(MONTH));
        System.out.println(calendar1.get(DATE));

        // 设置年月日时分秒
        calendar1.set(2003, NOVEMBER, 23, 12, 32, 23);
        // 往前推一年
        calendar1.add(YEAR, -1);
        System.out.println(calendar1.getTime());
        // 往前推8个月
        calendar1.roll(MONTH, -8);
        System.out.println(calendar1.getTime());

        // add和roll
        System.out.println("===");
        // add 超出进位
        Calendar instance = getInstance();
        instance.set(2003, 7, 28, 0, 0, 0); // 2003-08-28
        instance.add(MONTH, 6);  // 2003-08-23->2004-02-23
        System.out.println(instance.getTime());
        // add 如果下一级也需要改变,则最小化改变
        instance.set(2003, 7, 30, 0, 0, 0); // 2003-08-30
        instance.add(MONTH, 6);  // 2003-08-30->2004-02-29
        System.out.println(instance.getTime());

        System.out.println("===");
        // roll 超出上一级不进位
        Calendar instance1 = getInstance();
        instance1.set(2003, 7, 31, 0, 0, 0);  // 2003-8-31
        instance1.roll(MONTH, 6);  // 2003-02-28 (2003年2月份只有28天)
        System.out.println(instance1.getTime());


        // 容错性
        System.out.println("===");
        Calendar cal = getInstance();
        cal.set(MONTH, JUNE);
        cal.set(MONTH, 13); // YEAR+1,MONTH=1(不是加1)
        System.out.println(cal.getTime());
        // 关闭容错性
        cal.setLenient(false);
        cal.set(MONTH,13);  // 运行时异常
        System.out.println(cal.getTime());


    }
}
