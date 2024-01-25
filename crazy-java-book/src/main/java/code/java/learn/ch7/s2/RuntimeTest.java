package code.java.learn.ch7.s2;

import java.io.IOException;

public class RuntimeTest {

    public static void main(String[] args) throws IOException {
        Runtime rt = Runtime.getRuntime();
        // 访问JVM属性
        System.out.println(rt.availableProcessors());
        System.out.println(rt.freeMemory());
        System.out.println(rt.totalMemory());
        System.out.println(rt.maxMemory());

        // 单独启动进程来运行操作相同命令(打开记事本)
        rt.exec("notepad.exe");
    }
}
