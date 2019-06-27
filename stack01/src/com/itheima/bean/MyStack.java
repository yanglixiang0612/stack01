package com.itheima.bean;

import java.util.Arrays;

public class MyStack<E> {
    private Object[] stack;
    private int size;
    public MyStack(){
        stack = new Object[10];
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public E peek(){
        if(isEmpty()){
            return null;
        }
        return(E)stack[size - 1];
    }

    public E pop(){
        E e = peek();
        stack[size - 1] = null;
        size--;
        return e;
    }

    public E push(E item){
        ensureCapacity(size + 1);
        stack[size++] = item;
        return item;
    }

    private void ensureCapacity(int i) {
        int len = stack.length;
        if(size > len){
            int newLen = 10;
            stack = Arrays.copyOf(stack, newLen);
        }
    }

    public int size(){
        return size;
    }
}
