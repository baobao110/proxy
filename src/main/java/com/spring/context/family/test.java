package com.spring.context.family;/**
 * @description:
 * @author: Lenovo
 * @date: 2019-12-16 10:46
 */

/**
 * @Auther chenhao
 * @Date 2019/12/16
 */
public class test {

    public static void main(String[] args) throws Exception{
        ClassLoader classLoader=test.class.getClassLoader();

        classLoader.loadClass("com.spring.context.family.son");
        System.out.println("======================");
        Class.forName("com.spring.context.family.son",true,classLoader);
    }
}
