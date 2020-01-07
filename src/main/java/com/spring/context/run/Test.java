package com.spring.context.run;

/**
 * @Auther chenhao
 * @Date 2019/12/2
 */
public class Test {

    public static void main(String[] args) {
        PrintThread printThread=new PrintThread(100);
        printThread.run();
    }
}
