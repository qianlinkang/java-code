package code.java.learn.ch7.s7;

import java.text.MessageFormat;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * 国际化配置文件占位符
 * MessageFormat格式化信息
 */
public class HelloArg {
    public static void main(String[] args) {
        //
        Locale myLocale = null;
        // 运行时指定两个参数,对应两个占位符
        if (args.length == 2) {
            myLocale = new Locale(args[0], args[1]);
        } else {
            // 拿默认的locale
            myLocale = Locale.getDefault(Locale.Category.FORMAT);
        }

        // 加载bundle
        ResourceBundle bundle = ResourceBundle.getBundle("mess", myLocale);
        String msg = bundle.getString("msg");
        System.out.println(MessageFormat.format(msg, "你好安", new Date()));

    }
}
