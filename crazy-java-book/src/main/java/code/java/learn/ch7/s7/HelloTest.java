package code.java.learn.ch7.s7;

import java.util.Locale;
import java.util.ResourceBundle;

public class HelloTest {
    public static void main(String[] args) {
        // 获取系统默认的Locale(国家和语言环境)
        Locale myLocale = Locale.getDefault(Locale.Category.FORMAT);
        // 根据locale加载资源文件
        ResourceBundle bundle = ResourceBundle.getBundle("mess", myLocale);
        System.out.println(bundle.getString("hello"));
    }
}
