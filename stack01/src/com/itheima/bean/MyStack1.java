package com.itheima.bean;

public class MyStack1 {
    MyStack<Integer> elem;
    MyStack<Integer> min;
    public MyStack1(){
        elem = new MyStack<>();
        min = new MyStack<>();
    }

    public void push(int data){
        elem.push(data);
        if(min.isEmpty()){
            min.push(data);
        }else{
            if(data < min.peek()){
                min.push(data);
            }
        }
    }

    public int pop(){
        int topData = elem.peek();
        elem.pop();
        if(topData == this.min()){
            min.pop();
        }
        return topData;
    }

    public int min(){
        if(min.isEmpty()){
            return Integer.MAX_VALUE;
        }else{
            return min.peek();
        }
    }

}
