package com.spring.context.test;/**
 * @description:
 * @author: Lenovo
 * @date: 2019-11-11 9:49
 */

import com.spring.context.Dog;
import com.spring.context.demo.Singleton;

/**
 * @Auther chenhao
 * @Date 2019/11/11
 */
public class SingleTest {

    public static void main(String[] args) {
        Dog dog1= Singleton.getInstance();
        Dog dog2=Singleton.getInstance();
        System.out.println(dog1.equals(dog2));
    }
}
