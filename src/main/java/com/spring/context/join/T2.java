package com.spring.context.join;/**
 * @description:
 * @author: Lenovo
 * @date: 2019-11-13 14:05
 */

/**
 * @Auther chenhao
 * @Date 2019/11/13
 */
public class T2 extends Thread {

    @Override
    public void run() {
        System.out.println("T2线程执行");
        for(int i=0;i<10000;i++){
            System.out.println("T2线程:"+Thread.currentThread().getName());
        }
    }
}
