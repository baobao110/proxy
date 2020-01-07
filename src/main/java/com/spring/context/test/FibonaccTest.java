package com.spring.context.test;/**
 * @description:
 * @author: Lenovo
 * @date: 2019-11-11 10:44
 */

import com.spring.context.demo.Fibonacc;

/**
 * @Auther chenhao
 * @Date 2019/11/11
 */
public class FibonaccTest {

    public static void main(String[] args) {
        int []array= Fibonacc.getFibonacc(10);
        for(int i:array){
            System.out.println(i);
        }
    }
}
