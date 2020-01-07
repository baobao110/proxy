package com.spring.context.struct;/**
 * @description:
 * @author: Lenovo
 * @date: 2019-11-25 14:44
 */

/**
 * @Auther chenhao
 * @Date 2019/11/25
 */
public class Stack {

    private int size;

    private int top;

    private int[] array;

    public Stack(int size){
        array=new int[size];
        top=-1;
        this.size=size;
    }
    //入栈
    public void push(int elem){
        array[++top]=elem;
    }

    //出栈
    public int pop(){
        return array[top--];
    }

    //查看栈顶元素
    public int peek(){
        return array[top];
    }

    //判空
    public boolean isEmpty(){
        return (top==-1);
    }

    //判栈满
    public boolean isFull(){
        return (top==size-1);
    }

}
