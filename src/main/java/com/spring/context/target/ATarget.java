package com.spring.context.target;/**
 * @description:
 * @author: Lenovo
 * @date: 2019-11-21 10:37
 */

/**
 * @Auther chenhao
 * @Date 2019/11/21
 */
public class ATarget  implements Target {

    @Override
    public void dosomething(String command) {
        System.out.println("A员工具体做:"+command);
    }
}
