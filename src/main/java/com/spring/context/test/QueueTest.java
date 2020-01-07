package com.spring.context.test;/**
 * @description:
 * @author: Lenovo
 * @date: 2019-11-11 10:20
 */

import com.spring.context.demo.DoubleSQueue;

/**
 * @Auther chenhao
 * @Date 2019/11/11
 */
public class QueueTest {


    public static void main(String[] args)throws Exception{
        DoubleSQueue queue =new DoubleSQueue();
        queue.add(11);
        queue.add(444);
        queue.add(66);
        queue.add(77);
        System.out.println("出队列:"+queue.get());
    }
}
