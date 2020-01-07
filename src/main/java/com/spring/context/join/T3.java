package com.spring.context.join;/**
 * @description:
 * @author: Lenovo
 * @date: 2019-11-13 14:06
 */

/**
 * @Auther chenhao
 * @Date 2019/11/13
 */
public class T3 extends Thread {

    @Override
    public void run() {
        System.out.println("T3线程执行");
        for(int i=0;i<10000;i++){
            System.out.println("T3线程:"+Thread.currentThread().getName());
        }
    }
}
