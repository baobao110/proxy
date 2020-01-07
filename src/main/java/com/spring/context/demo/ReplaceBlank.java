package com.spring.context.demo;/**
 * @description:
 * @author: Lenovo
 * @date: 2019-11-11 10:05
 */

/**
 * @Auther chenhao
 * @Date 2019/11/11
 */
public class ReplaceBlank {


    public static StringBuffer replace(String input){
        if(null==input){
            return null;
        }
        StringBuffer buffer=new StringBuffer();
        for(int i=0;i<input.length();i++){
            if(input.charAt(i)==' '){
                buffer.append("%20");
            }
            else{
                buffer.append(input.charAt(i));
            }
        }
        return buffer;
    }
}
