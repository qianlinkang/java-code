package code.java.learn.ch7.s6;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.VarHandle;
import java.util.Arrays;

class User {
    String name;
    static int MAX_AGE;
}

/**
 * 动态操作数组的元素或对象的成员变量
 */
public class VarHandleTest {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        String[] sa = {"java", "kotlin", "go"};
        // 获取数组元素的VarHandle对象 MethodHandles.arrayElementVarHandle
        VarHandle avh = MethodHandles.arrayElementVarHandle(String[].class);
        // cas, 比较并设置 如果sa的下标2元素位go,就设置位lua
        boolean b = avh.compareAndSet(sa, 2, "go", "Lua");
        System.out.println(b);
        System.out.println(Arrays.toString(sa));

        System.out.println("===");
        // 获取类中的名为name,类型为String的实例变量 findVarHandle
        VarHandle vh = MethodHandles.lookup().findVarHandle(User.class, "name", String.class);
        User user = new User();
        System.out.println(vh.get(user));
        vh.set(user, "孙悟空");
        System.out.println(user.name);

        // 获取类中的名为MAX_AGE,类型为String的实例变量 findVarHandle
        VarHandle vh2 = MethodHandles.lookup().findStaticVarHandle(User.class, "MAX_AGE", int.class);
        System.out.println(vh2.get());
        vh2.set(100);
        System.out.println(User.MAX_AGE);

    }
}
