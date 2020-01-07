package com.spring.context.cglib;

import org.springframework.cglib.proxy.Enhancer;

/**
 * @Auther chenhao
 * @Date 2020/1/7
 */
public class Client {

    public static void main(String[] args) {
        Enhancer enhancer=new Enhancer();
        enhancer.setSuperclass(HelloService.class);
        enhancer.setCallback(new MyMethodInterceptor());
        HelloService helloService=(HelloService) enhancer.create();
        helloService.sayHello();
    }
}
