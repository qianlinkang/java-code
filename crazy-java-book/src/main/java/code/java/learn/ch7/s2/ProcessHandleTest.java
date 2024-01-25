package code.java.learn.ch7.s2;

import java.io.IOException;
import java.util.concurrent.CompletableFuture;

public class ProcessHandleTest {
    public static void main(String[] args) throws IOException, InterruptedException {
        Runtime rt = Runtime.getRuntime();
        // 创建一个相同进程
        Process p = rt.exec("notepad.exe");
        // 使用ProcessHandle获取相关信息
        ProcessHandle ph = p.toHandle();
        System.out.println(ph.isAlive());
        System.out.println(ph.pid());
        System.out.println(ph.parent());
        // 使用ProcessHandle.Info获取进程信息(内部接口)
        ProcessHandle.Info info = ph.info();
        System.out.println(info.command());
        System.out.println(info.arguments());
        System.out.println(info.startInstant());  // 进程启动时间
        System.out.println(info.totalCpuDuration()); // 累计运行时间

        // 通过CompletableFuture在进程结束时运行某个任务
        CompletableFuture<ProcessHandle> cf = ph.onExit();
        cf.thenRunAsync(() -> System.out.println("程序退出"));
        Thread.sleep(5000);
    }
}
