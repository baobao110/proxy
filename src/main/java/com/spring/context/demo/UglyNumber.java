package com.spring.context.demo;/**
 * @description:
 * @author: Lenovo
 * @date: 2019-11-11 13:44
 */

/**
 * @Auther chenhao
 * @Date 2019/11/11
 */
public class UglyNumber {

    public static int getUglyNumber(int n){
        int[] array=new int[n];
        array[0]=1;
        int multiply2=0;
        int multiply3=0;
        int multiply5=0;
        for(int i=1;i<n;i++){
            int min=Math.min(array[multiply2]*2,Math.min(array[multiply3]*3,array[multiply5]*5));
            array[i]=min;
            if(array[multiply2]*2==min){
                multiply2++;
            }
            if(array[multiply3]*3==min){
                multiply3++;
            }
            if(array[multiply5]*5==min){
                multiply5++;
            }
        }
        return array[n-1];
    }
}
