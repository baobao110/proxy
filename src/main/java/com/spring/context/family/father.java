package com.spring.context.family;/**
 * @description:
 * @author: Lenovo
 * @date: 2019-12-16 10:40
 */

/**
 * @Auther chenhao
 * @Date 2019/12/16
 */
public class father {

    {
        System.out.println("father ===  构造代码块");
    }

    static{
        System.out.println("father ===  静态代码块");
    }

    public father() {
        System.out.println("father ===  构造方法");
    }
}
