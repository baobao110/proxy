package com.spring.context.test;/**
 * @description:
 * @author: Lenovo
 * @date: 2019-10-21 9:58
 */

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.BitSet;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Auther chenhao
 * @Date 2019/10/21
 */
public class Test {

    private Lock lock=new ReentrantLock();

    private void method(Thread thread){
        if(lock.tryLock()){
            try{
                System.out.println("线程名:"+thread.getName()+"获得锁");
            }catch (Exception e){
                e.printStackTrace();
            }
            finally {
                System.out.println("线程名:"+thread.getName()+"释放锁");
                lock.unlock();
            }
        }
        else{
            System.out.println("我是"+thread.getName()+"有人占用中");
        }



    }

    public static void main(String[] args) {
       /* Test test=new Test();
        for(int i=0;i<100;i++){
            new Thread(new Runnable() {
                @Override
                public void run() {
                    test.method(Thread.currentThread());
                }
            },"Thread"+i).start();
        }*/

      /*  Parent son=new Child();
        Parent child=new Child();
        System.out.println( Thread.currentThread().getContextClassLoader().getResource("").getPath());*/

        System.out.println(56^56);

    }
}
