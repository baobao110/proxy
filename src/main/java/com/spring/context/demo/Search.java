package com.spring.context.demo;/**
 * @description:
 * @author: Lenovo
 * @date: 2019-11-11 10:26
 */

/**
 * @Auther chenhao
 * @Date 2019/11/11
 */
public class Search {

  public static int find(int[] array,int target){
      if(array.length==0){
          return -1;
      }

      int left=0;

      int right=array.length-1;

      while(left<=right){
          int mid=(left+right)/2;
          if(array[mid]==target){
              return mid;
          }
          if(array[mid]>target){
              right=mid-1;
          }
          else{
              left=mid+1;
          }
      }
      return -1;
  }
}
