package src.mian.java.com.xj.demo;

public class Demo<T> {
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
