package com.spring.context.demo;/**
 * @description:
 * @author: Lenovo
 * @date: 2019-11-11 9:46
 */

import com.spring.context.Dog;

/**
 * @Auther chenhao
 * @Date 2019/11/11
 */
public class Singleton {

    private static Dog dog;

    public static Dog getInstance(){
        if(null==dog){
            synchronized (Singleton.class){
                if(null==dog){
                    dog=new Dog();
                }
            }

        }
        return dog;
    }

}
