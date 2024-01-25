package code.java.learn.ch7.s3;

import java.math.BigDecimal;

public class BigDecimalTest {
    public static void main(String[] args) {
        // 浮点类型运算会出现进度丢失的问题
        System.out.println(0.05 + 0.01);

        // 使用BigDecimal
        BigDecimal f1 = new BigDecimal("0.05");
        BigDecimal f2 = BigDecimal.valueOf(0.01);
        BigDecimal f3 = new BigDecimal(0.05);  // 不要直接使用double浮点数作为BigDecimal构造器的参数
        System.out.println(f1.add(f2));
        System.out.println(f3.add(f2));  // 同样会丢失精度,避免这样使用

        //
        System.out.println("===");
        System.out.println(Arith.add(0.05, 0.01));
    }
}
