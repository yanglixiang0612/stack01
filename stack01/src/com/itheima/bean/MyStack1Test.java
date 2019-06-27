package com.itheima.bean;

public class MyStack1Test {
    public static void main(String[] args) {
        MyStack1 s = new MyStack1();
        s.push(9);
        s.push(6);
        s.push(8);
        s.push(3);
        System.out.println(s.min());
    }
}
