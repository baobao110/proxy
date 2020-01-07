package com.spring.context.test;/**
 * @description:
 * @author: Lenovo
 * @date: 2019-10-21 9:55
 */

/**
 * @Auther chenhao
 * @Date 2019/10/21
 */
public class Parent {

    static Child child =new Child();

    static {
        System.out.println("====print==1=======");
    }

    {
        System.out.println("=====print==2=====");
    }

    public Parent() {

        System.out.println("=======print==3=====");
    }
}
