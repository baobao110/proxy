package com.spring.context.test;/**
 * @description:
 * @author: Lenovo
 * @date: 2019-11-11 10:08
 */

import com.spring.context.demo.ReplaceBlank;

/**
 * @Auther chenhao
 * @Date 2019/11/11
 */
public class BlankTest {

    public static void main(String[] args) {
        String beforeStr = " ab g gt r ";
        System.out.println(ReplaceBlank.replace(beforeStr));

    }
}
