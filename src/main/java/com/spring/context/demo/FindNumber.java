package com.spring.context.demo;/**
 * @description:
 * @author: Lenovo
 * @date: 2019-11-11 9:56
 */

/**
 * @Auther chenhao
 * @Date 2019/11/11
 */
public class FindNumber {

    public static boolean find(int[][] array,int target){
       if(null==array||array.length==0){
           return false;
       }
       int row=0;
       int colum=array[0].length-1;
       while(row<array.length&&colum>=0){
           if(array[row][colum]==target){
               return true;
           }
           if(array[row][colum]>target){
               colum--;
           }
           else{
               row++;
           }
       }
       return false;
    }
}
