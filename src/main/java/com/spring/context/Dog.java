package com.spring.context;/**
 * @description:
 * @author: Lenovo
 * @date: 2019-10-16 11:06
 */

/**
 * @Auther chenhao
 * @Date 2019/10/16
 */
public class Dog  implements Pet {

    @Override
    public String eat() {
        System.out.println("Dog=====eat");
        return "Dog====eat";
    }

    @Override
    public String sleep() {
        System.out.println("Dog====sleep");
        return "Dog=====sleep";
    }
}
