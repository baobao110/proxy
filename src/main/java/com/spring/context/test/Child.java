package com.spring.context.test;/**
 * @description:
 * @author: Lenovo
 * @date: 2019-10-21 9:56
 */

/**
 * @Auther chenhao
 * @Date 2019/10/21
 */
public class Child extends Parent{

    static{
        System.out.println("=======print==4=====");
    }

    {
        System.out.println("=======print==5=====");
    }

    public Child() {

        System.out.println("=======print==6=====");
    }

    public static void main(String[] args) {
        Child child =new Child();
    }
}
