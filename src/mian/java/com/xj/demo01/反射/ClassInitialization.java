package src.mian.java.com.xj.demo01.反射;

import java.util.*;

/***
 * https://blog.csdn.net/javazejian/article/details/70768369
 *
 * 编译期间常量:是指被 static final 同时修饰的成员变量  不需要创建初始化对应的class对象即可 取到对应的值 不然为啥叫编译期常量
 *
 */
class Initable {
    //编译期静态常量 不会触发初始化
    static final int staticFinal = 47;
    //非编期静态常量
    static final int staticFinal2 = ClassInitialization.rand.nextInt(1000);
    static {
        System.out.println("Initializing Initable");
    }
}

class Initable2 {
    //静态成员变量
    static int staticNonFinal = 147;
    static {
        System.out.println("Initializing Initable2");
    }
}

class Initable3 {
    //静态成员变量
    static int staticNonFinal = 74;
    static {
        System.out.println("Initializing Initable3");
    }
}

public class ClassInitialization {
    public static Random rand = new Random(47);
    public static void main(String[] args) throws Exception {
        //字面常量获取方式获取Class对象
        Class initable = Initable.class;
        System.out.println("After creating Initable ref");
        //不触发类初始化
        System.out.println("1  " + Initable.staticFinal);
        //会触发类初始化
        System.out.println("2  " + Initable.staticFinal2);
        //会触发类初始化
        System.out.println("3  " + Initable2.staticNonFinal);
        //forName方法获取Class对象
        Class initable3 = Class.forName("src.mian.java.com.xj.demo01.反射.Initable3");
        System.out.println("After creating Initable3 ref");
        System.out.println(Initable3.staticNonFinal);
    }
}