package com.atguigu.java;

import org.junit.Test;

import java.util.ArrayList;


public class MainTest {

    @Test
    public void test01(){


        ArrayList list = new ArrayList();
        list.add("123");
        list.add("321");
        list.add("456");
        for (Object li: list) {
            System.out.println(li);
        }
    }

    public void method(){
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(123);
    }
}
