package com.spring.context.demo;/**
 * @description:
 * @author: Lenovo
 * @date: 2019-11-11 10:50
 */

/**
 * @Auther chenhao
 * @Date 2019/11/11
 */
public class NumberOfBin {

    public static int getBin(int n){
        int count=0;
        while (n!=0){
            count++;
            n=(n-1)&n;
        }
        return count;
    }
}
