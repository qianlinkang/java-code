package code.java.learn.ch7.s3;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * 浮点数精度计算
 */
public class Arith {
    // 默认除法运算精度
    private static final int DEF_DIV_SCALE = 10;
    // 私有化构造器
    private Arith(){}

    // 精度加法运算
    public static double add(double v1, double v2) {
        BigDecimal b1 = BigDecimal.valueOf(v1);
        BigDecimal b2 = BigDecimal.valueOf(v2);
        return b1.add(b2).doubleValue();
    }

    // 精度减法
    public static double sub(double v1, double v2) {
        BigDecimal b1 = BigDecimal.valueOf(v1);
        BigDecimal b2 = BigDecimal.valueOf(v2);
        return b1.subtract(b2).doubleValue();
    }

    // 精度乘法
    public static double mul(double v1, double v2) {
        BigDecimal b1 = BigDecimal.valueOf(v1);
        BigDecimal b2 = BigDecimal.valueOf(v2);
        return b1.multiply(b2).doubleValue();
    }

    // 精度除法
    // 相对精度,除不尽时,精确到小数点以后十位的数字四舍五入
    public static double div(double v1, double v2) {
        BigDecimal b1 = BigDecimal.valueOf(v1);
        BigDecimal b2 = BigDecimal.valueOf(v2);
        return b1.divide(b2, DEF_DIV_SCALE, RoundingMode.HALF_UP).doubleValue();
    }
}
