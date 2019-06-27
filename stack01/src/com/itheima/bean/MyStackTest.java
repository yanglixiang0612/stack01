package com.itheima.bean;

public class MyStackTest {
    public static void main(String[] args) {
        MyStack<Integer> s = new MyStack<>();
        s.push(1);
        s.push(2);
        System.out.println("栈中元素个数：" + s.size());
        System.out.println("栈顶元素为：" + s.pop());
        System.out.println("栈顶元素为：" + s.pop());
    }
}
