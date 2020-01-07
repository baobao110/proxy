package com.spring.context.join;/**
 * @description:
 * @author: Lenovo
 * @date: 2019-11-13 13:57
 */

/**
 * @Auther chenhao
 * @Date 2019/11/13
 */
public class Testt {

    public static void main(String[] args)throws Exception {
       T3 t3=new T3();
       t3.start();
       t3.join();

       T2 t2=new T2();
       t2.start();
       t2.join();

       T1 t1=new T1();
       t1.start();
       t1.join();

    }
}
