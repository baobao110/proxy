package com.spring.context.finall;/**
 * @description:
 * @author: Lenovo
 * @date: 2020-01-08 13:51
 */

/**
 * @Auther chenhao
 * @Date 2020/1/8
 */
public class FinallTest {


    public static void main(String[] args) {
        int m=finall();
        System.out.println(m);
        byte a=127;
        byte b=127;
        a+=b;
        System.out.println(a);
    }


    private static int finall(){
        try{
           return 0;
        }catch (Exception e){
            e.printStackTrace();
            return 2;
        }finally {
            return 1;
        }
    }
}
