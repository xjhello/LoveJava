package src.mian.java.com.xj.demo01;

public class Son01 extends  Father{
    Son01(){
        System.out.println(1);
    }
    public static void main(String[] args) {
        //向上转型 : 通过子类对象(小范围)实例化父类对象(大范围),这种属于自动转换
        Father obj01 = new Son01();
        Son02 son02 = new Son02();
    }
}
