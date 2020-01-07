package com.spring.context;/**
 * @description:
 * @author: Lenovo
 * @date: 2019-10-16 11:04
 */

/**
 * @Auther chenhao
 * @Date 2019/10/16
 */
public class Cat implements Pet {

    @Override
    public String eat() {
        System.out.println("cat====eat");
        return "Cat===eat";
    }

    @Override
    public String sleep() {
        System.out.println("cat=====sleep");
        return "Cat===sleep";
    }
}
