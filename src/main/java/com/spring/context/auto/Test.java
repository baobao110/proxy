package com.spring.context.auto;/**
 * @description:
 * @author: Lenovo
 * @date: 2019-11-28 17:07
 */

import sun.plugin2.message.Serializer;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Auther chenhao
 * @Date 2019/11/28
 */
public class Test implements Serializable {


    private static AtomicInteger integer=new AtomicInteger(0);


    public static void main(String[] args) {
       for(int i=0;i<500;i++){
           new Thread(){
               @Override
               public void run(){
                   for(int i=0;i<50000;i++){
                       integer.getAndIncrement();
                   }
               }
           }.start();

        }

        try{
            Thread.sleep(10000);
        }catch (Exception e){
            e.printStackTrace();
        }

        System.out.println(integer.intValue());

    }

}
