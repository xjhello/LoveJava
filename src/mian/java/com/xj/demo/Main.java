package src.mian.java.com.xj.demo;

import java.util.ArrayList;
import java.util.List;

public class Main extends Object{
    public static void main(String[] args) {
//        List<E> aaa= new ArrayList<E>();
        Demo1 d = new Demo1("1");
        System.out.println(d.getAge());
        ArrayList<String> mylist = new ArrayList<String>();
        mylist.add("asd");
        mylist.add("122");
        mylist.add("adsad");
        mylist.add("mdjd");
        for (String s:mylist){
            System.out.println(s);
        }

    }
}
