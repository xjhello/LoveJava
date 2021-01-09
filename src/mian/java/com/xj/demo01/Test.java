package src.mian.java.com.xj.demo01;

public class Test{
    public static void func(A a)
    {
        a.print();
    }
    public static void main(String args[])
    {
        A a = new B();          //通过子类去实例化父类
        a.printa();
        //当我们需要多个同父的对象调用某个方法时,通过向上转换后,则可以确定参数的统一.方便程序设计
        func(new B());  //等价于 A a =new B();
        func(new C());  //等价于 C c =new C();

        A a1 = new B();                 //向上转型 (B类是A的子类)
    }
}
class A {
    public void print() {
        System.out.println("A:print");
    }

    public void printa() {
        System.out.println("A:printa");
    }
}

class B extends A {
    public void print() {
        System.out.println("B:print");
    }
}

class C extends B {
    public void print() {
        System.out.println("C:print");
    }
}
