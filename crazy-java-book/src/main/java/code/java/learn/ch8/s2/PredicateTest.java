package code.java.learn.ch8.s2;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.function.Predicate;

public class PredicateTest {
    public static void main(String[] args) {
        // removeIf
        var books = new HashSet<String>();
        books.add("轻量级 Java EE 企业应用实战");
        books.add("疯狂 Java 讲义");
        books.add("疯狂 iOS 讲义");
        books.add("疯狂 Ajax 讲义");
        books.add("疯狂 Android 讲义");
        // removeIf 过滤所有长度小于10的元素
        books.removeIf(e -> e.length() < 10);
        System.out.println(books);

        // 使用Predicate过滤元素
        // 统计书名包含"疯狂"子串的图书数量
        System.out.println(calAll(books, e -> e.contains("疯狂")));
        // 统计书名包含"Java"子串的图书数量
        System.out.println(calAll(books, e -> e.contains("Java")));
        // 统计书名长度大于10的图书数量
        System.out.println(calAll(books, e -> e.length() > 10));

        // 函数式接口
        System.out.println("===");
        CalAll<String> calAllInstance = (list, str) -> {
            int total = 0;
            Predicate<String> p = e -> e.contains(str);
            for (String o : list) {
                if (p.test(o))
                    total++;
            }
            return total;
        };
        System.out.println(calAllInstance.calAll(books,  "疯狂"));


    }

    public static int calAll(Collection<String> collection, Predicate<String> predicate) {
        int total = 0;
        for (String o : collection) {
            if (predicate.test(o))
                total++;
        }
        return total;
    }


}
