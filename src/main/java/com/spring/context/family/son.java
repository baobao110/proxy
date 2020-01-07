package com.spring.context.family;/**
 * @description:
 * @author: Lenovo
 * @date: 2019-12-16 10:44
 */

/**
 * @Auther chenhao
 * @Date 2019/12/16
 */
public class son extends father {

    {
        System.out.println("son ===  构造代码块");
    }

    static{
        System.out.println("son ===  静态代码块");
    }

    public son() {
        System.out.println("son ===  构造方法");
    }

    public static void main(String[] args) {
        father f=new son();
    }
}
