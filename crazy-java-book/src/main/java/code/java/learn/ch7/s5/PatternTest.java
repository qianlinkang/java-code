package code.java.learn.ch7.s5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternTest {
    public static void main(String[] args) {
        // pattern可以多次使用
        Pattern pattern = Pattern.compile("a*b");
        Matcher matcher = pattern.matcher("aaab");
        System.out.println(matcher.matches());

        // 只需要比较一次的情况
        boolean flag = Pattern.matches("a*b", "aaaab");
        System.out.println("flag = " + flag);
    }
}
