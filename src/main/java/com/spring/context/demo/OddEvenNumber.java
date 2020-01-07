package com.spring.context.demo;/**
 * @description:
 * @author: Lenovo
 * @date: 2019-11-11 11:01
 */

/**
 * @Auther chenhao
 * @Date 2019/11/11
 */
public class OddEvenNumber {

    public static int[] OddEven(int[] array){
        int[] len=new int[array.length];
        int Odd=0;
        int Even=len.length-1;
        for(int i=0;i<array.length;i++){
            if(array[i]%2==0){
                len[Even]=array[i];
                Even--;
            }
            else{
                len[Odd]=array[i];
                Odd++;
            }
        }
        return len;
    }
}
