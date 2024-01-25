package code.java.learn.ch8.s2;

import java.util.List;

public class CollectionTest {
    public static void main(String[] args) {
        // java11 新增
        // toArray(InterfaceFunction)

        List<String> col = List.of("java", "kotlin", "swift", "python");
        Object[] objArr = col.toArray();
        // 构造器引用表示函数式接口,可以创建指定类型的数组
        String[] strArr = col.toArray(String[]::new);
    }
}
