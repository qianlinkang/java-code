package code.java.learn.ch7.s5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindGroupTest {
    public static void main(String[] args) {
        // 匹配符合的子串(如电话号码)
        String str = "13500006666我想求购一本《疯狂java讲义》,尽快联系我13500006666" +
                "交个朋友,电话号码是13611125565" +
                "出售二手电脑,联系方式15899903312";
        // 匹配出13或15开头的,后续数字8位的电话号码
        Matcher matcher = Pattern.compile("1[3456789][0-9]{9}").matcher(str);
        System.out.println(matcher.matches());  // 整个目标字符串是否匹配
        System.out.println(matcher.lookingAt());  // 开头的部分是否匹配
        // 匹配的电话号码输出
        while (matcher.find()) {
            System.out.println(matcher.group() + "=start(开始于):" + matcher.start() +
                    "=end(结束于):" + matcher.end());

        }
    }
}
