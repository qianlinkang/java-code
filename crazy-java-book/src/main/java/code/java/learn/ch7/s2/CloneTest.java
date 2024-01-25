package code.java.learn.ch7.s2;

class Address {
    String detail;

    public Address(String detail) {
        this.detail = detail;
    }
}

// 实现Cloneable
class User implements Cloneable {
    int age;
    Address address;

    public User(int age) {
        this.age = age;
    }

    // 调用父类提供的clone方法
    public User clone() throws CloneNotSupportedException {
        return (User) super.clone();
    }
}

public class CloneTest {

    public static void main(String[] args) throws CloneNotSupportedException {
        User u1 = new User(29);
        User u2 = u1.clone();
        System.out.println(u1 == u2);  // false,存在两个不同的User对象

        System.out.println(u1.address == u2.address);  // tre,浅克隆,引用类型成员不进行克隆
    }
}
