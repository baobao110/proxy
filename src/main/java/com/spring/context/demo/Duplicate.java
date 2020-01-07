package com.spring.context.demo;

import java.util.HashSet;

/**
 * @Auther chenhao
 * @Date 2019/11/11
 */
public class Duplicate {

    public static Integer dup(int [] array){
        if(array.length==0){
            return null;
        }
        else {
            HashSet<Integer> set=new HashSet<>();
            for(int i=0;i<array.length;i++){
                if(!set.add(array[i])){
                    return array[i];
                }
            }
        }
        return null;
    }
}
