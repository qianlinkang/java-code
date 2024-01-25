package code.java.learn.ch7.s5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchesResetTest {
    public static void main(String[] args) {
        // 一个matcher多次使用(邮箱匹配)
        String[] mails = {
                "kongyeeku@163.com",
                "kongyeeku@gmail.com",
                "kongyeeku@crazyit.org",
                "wawa@abc.xx"
        };

        String regex = "\\w{3,20}@\\w+\\.(com|org|net|gov)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = null;  // 定义一个null
        for (String mail : mails) {
            if (matcher == null) {
                matcher = pattern.matcher(mail);  // 给match赋值
            } else {
                matcher.reset(mail);  // reset,重复使用
            }

            System.out.println(mail + (matcher.matches() ? "是" : "不是") + "一个有效邮箱!");
        }

    }
}
