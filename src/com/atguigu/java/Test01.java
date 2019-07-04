package com.atguigu.java;

import java.util.ArrayList;

/**
 * @author KaiKai
 * @create 2019-07-04 13:19
 */
public class Test01 {
    private static final int NUM = 10;

    /**
     *编号
     */
    private int id = 0;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    /**
     *姓名
     */
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Test01() {
    }

    public Test01(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Test01{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Test01 test01 = new Test01();
        test01.setId(1);
        test01.setName("xiaoming");
        System.out.println(test01.toString());

        System.out.println(Test01.NUM);
        int[] nums ={1,2,3,4,5,6,7};
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
        System.out.println("---------------------");
        for (int i : nums) {
            System.out.println(i);
        }
        System.out.println("---------------------");
        for (int i = 0; i < nums.length; i++) {
            int num1 = nums[i];
            System.out.println(num1);
        }
        System.out.println("----------list-----------");
        //模板四：list.for
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(456);
        list.add(789);
        for (Object o : list) {
            System.out.println(o);
        }
        System.out.println("-----------");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("倒序遍历");
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.println(list.get(i));
        }
        //ifn
        if (list == null) {
            
        }
        //inn
        if (list != null) {
            
        }
        //xxx.nn / xxx.null
        if (list != null) {

        }
        if (list == null) {

        }

        String s = new String();

    }
}
