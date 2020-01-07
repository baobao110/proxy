package com.spring.context.demo;/**
 * @description:
 * @author: Lenovo
 * @date: 2019-11-11 10:38
 */

/**
 * @Auther chenhao
 * @Date 2019/11/11
 */
public class Fibonacc {

    public static int[] getFibonacc(int n){
        int []array=new int[n];
        if(n==1){
            array[0]=1;
        }
        if(n==2){
            array[0]=1;
            array[1]=1;
        }
        if(n>2){
            array[0]=1;
            array[1]=1;
            for(int i=2;i<n;i++){
                array[i]=array[i-1]+array[i-2];
            }
        }
        return array;
    }
}
