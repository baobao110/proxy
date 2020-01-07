package com.spring.context.demo;/**
 * @description:
 * @author: Lenovo
 * @date: 2019-11-11 10:15
 */

import java.util.Stack;

/**
 * @Auther chenhao
 * @Date 2019/11/11
 */
public class DoubleSQueue {

    private Stack<Integer>stack1=new Stack<>();
    private Stack<Integer>stack2=new Stack<>();

    public void add(Integer item){
        stack1.push(item);
    }

    public int get() throws Exception{
        if(stack1.isEmpty()&&stack2.isEmpty()){
            throw new Exception("异常");
        }
        if(stack2.isEmpty()){
            while(!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }
}
