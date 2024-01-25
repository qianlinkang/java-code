package code.java.learn.ch7.s2;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Map;
import java.util.Properties;

public class SystemTest {

    public static void main(String[] args) throws Exception {
        // 获取所有环境变量
        Map<String, String> env = System.getenv();
        System.out.println(env.get("JAVA_HOME"));
        // 获取系统属性
        Properties props = System.getProperties();
        // 保存系统属性到props.txt文件中
        props.store(new FileOutputStream("props.txt"), "System Properties");
        // 输出特定系统属性
        System.out.println(System.getProperty("os.name"));

        // 当前时间与UTC1970年1月1日午夜的时间差
        System.out.println(System.currentTimeMillis());
        System.out.println(System.nanoTime());

        // identityHashCode() 返回对象精确的hashCode值
        String s1 = new String("hello");
        String s2 = new String("hello");
        System.out.println(System.identityHashCode(s1) + "==" + System.identityHashCode(s2));  // 不相同
        String s3 = "hello";
        String s4= "hello";
        System.out.println(System.identityHashCode(s3) + "==" + System.identityHashCode(s4));  // 相同
    }
}
