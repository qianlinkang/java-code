package code.java.learn.ch7.s7;

import java.util.Locale;

public class LocaleListTest {
    public static void main(String[] args) {
        // 返回java所支持的国家和语言
        Locale[] ll = Locale.getAvailableLocales();
        for (Locale locale : ll) {
            System.out.println(locale.getDisplayCountry() + "=" + locale.getCountry() +
                    "=" + locale.getDisplayLanguage() + "=" + locale.getLanguage());
        }
    }
}
