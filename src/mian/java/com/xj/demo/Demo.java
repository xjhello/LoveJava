package src.mian.java.com.xj.demo;

public class Demo<T> {
    public Demo(){
        System.out.println(11111);
        this.age = 10;

    }
    public Demo(int age){
        System.out.println(2222);
        this.age = age;

    }
//    public Demo(int a){
//        System.out.println(111111);
//    }
    private T name;
    private int age;

    public T getName() {
        return name;
    }

    public void setName(T name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void pt(){
        System.out.println(111);
    }

}
