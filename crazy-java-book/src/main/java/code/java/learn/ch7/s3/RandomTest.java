package code.java.learn.ch7.s3;

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class RandomTest {
    public static void main(String[] args) {
        Random rand = new Random();
        System.out.println(rand.nextBoolean());

        // 生成16个字节(范围2的7次方-1到-2的7次方)的数组
        byte[] buffer = new byte[16];
        rand.nextBytes(buffer);
        System.out.println(Arrays.toString(buffer));

        // 生成0.0到1.0的double和float
        System.out.println(rand.nextDouble());
        System.out.println(rand.nextFloat());

        // 生成标准正态分布数N(0,1)
        System.out.println(rand.nextGaussian());

        // 生成伪随机整数,范围为int范围
        System.out.println(rand.nextInt());
        // 生成指定范围的伪随机整数(0到26)
        System.out.println(rand.nextInt(26));

        // 生成伪随机long整数,范围为long范围
        System.out.println(rand.nextLong());

        // ===
        // 两个Random对象种子相同时,会产生相同的子序列
        System.out.println("===");
        Random rand1 = new Random(50);
        Random rand2 = new Random(50);
        Random rand3 = new Random(100);

        System.out.println(rand1.nextBoolean());
        System.out.println(rand1.nextInt());
        System.out.println(rand1.nextDouble());
        System.out.println(rand2.nextBoolean());
        System.out.println(rand2.nextInt());
        System.out.println(rand2.nextDouble());

        // 相同种子,但是调用顺序不同
        System.out.println(rand2.nextInt());
        System.out.println(rand2.nextDouble());
        System.out.println(rand2.nextBoolean());

        System.out.println(rand3.nextBoolean());
        System.out.println(rand3.nextInt());
        System.out.println(rand3.nextDouble());

        // 推荐当前时间作为种子,避免产生相同的数字序列
        System.out.println("===");
        Random random = new Random(System.nanoTime());
        System.out.println(random.nextDouble());
        Random random1 = new Random(System.nanoTime());
        Random random2 = new Random(System.currentTimeMillis());
        System.out.println(random1.nextDouble());
        System.out.println(random2.nextDouble());

        //
        System.out.println("===");
        ThreadLocalRandom tlRand = ThreadLocalRandom.current();
        System.out.println(tlRand.nextInt(2, 24));
    }
}
