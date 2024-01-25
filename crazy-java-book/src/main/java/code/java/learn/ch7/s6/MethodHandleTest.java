package code.java.learn.ch7.s6;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;

public class MethodHandleTest {
    // private类方法
    private static void hello() {
        System.out.println("hello world");
    }

    // private实例方法
    private String hello(String name) {
        System.out.println("执行带参数,hello" + name);
        return name + "你好";
    }

    public static void main(String[] args) throws Throwable {
        // 定义一个返回值为void,不带参数的方法类型
        MethodType type = MethodType.methodType(void.class);
        // MethodHandles.lookup()的findStatic 用来获取某个类的静态方法(指定方法名和返回类型)
        MethodHandle mtd = MethodHandles.lookup()
                .findStatic(MethodHandleTest.class, "hello", type);
        // 方法执行
        mtd.invoke();

        // 获取实例方法 MethodHandles.lookup().findVirtual
        // 指定返回类型和形参类型 MethodType.methodType
        MethodHandle mtd2 = MethodHandles.lookup().findVirtual(MethodHandleTest.class, "hello",
                MethodType.methodType(String.class, String.class));
        System.out.println(mtd2.invoke(new MethodHandleTest(), "孙悟空"));


    }
}
