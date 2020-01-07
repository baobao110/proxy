package com.spring.context.test;/**
 * @description:
 * @author: Lenovo
 * @date: 2019-11-11 10:01
 */

import com.spring.context.demo.FindNumber;

/**
 * @Auther chenhao
 * @Date 2019/11/11
 */
public class NumberTest {

    public static void main(String[] args) {
        int [][]array={{0,44,2,1},{77,111,222,98},{1004,4002,3007,3005},{0,66,33,44}};
        System.out.println(FindNumber.find(array,1004));
    }
}
