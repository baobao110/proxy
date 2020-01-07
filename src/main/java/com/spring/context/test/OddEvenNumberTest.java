package com.spring.context.test;/**
 * @description:
 * @author: Lenovo
 * @date: 2019-11-11 11:05
 */

import com.spring.context.demo.OddEvenNumber;

/**
 * @Auther chenhao
 * @Date 2019/11/11
 */
public class OddEvenNumberTest {

    public static void main(String[] args) {
        int [] array={1,33,44,78,99,777,222,666};
       array=OddEvenNumber.OddEven(array);
       for(int i:array){
           System.out.println(i);
       }
    }
}
