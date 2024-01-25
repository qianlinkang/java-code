package code.java.learn.ch7.s2;

public class StringsTest {
    public static void main(String[] args) {
        String s1 = "abcdefghijklmn";
        String s2 = "abcdefghij";
        String s3 = "abcdefghijalmn";

        System.out.println(s1.compareTo(s2));  // 返回s1.len-s2.len
        System.out.println(s1.compareTo(s3));  // 返回字符'k'-'a'的差
        System.out.println('k' - 'a');
    }
}
