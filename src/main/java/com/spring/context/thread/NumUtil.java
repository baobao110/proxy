package com.spring.context.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * @Auther chenhao
 * @Date 2019/12/26
 */
public class NumUtil {

    public static ThreadLocal<Integer> threadLocal=new ThreadLocal<>();

    public static int add10(int num) {
        threadLocal.set(num);
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return threadLocal.get() + 10;
    }

    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(20);

        for(int i=0;i<20;i++){
            int num=i;
            service.execute(()->{
                System.out.println(num+" "+NumUtil.add10(num));
            });
        }
    }
}
