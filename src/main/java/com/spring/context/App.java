package com.spring.context;

import com.spring.context.service.MessageService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.HashMap;
import java.util.HashSet;


/**
 * @Auther chenhao
 * @Date 2019/10/15
 */
public class App {
    public static void main(String[] args) {
        //ApplicationContext context=new ClassPathXmlApplicationContext("classpath:application.xml");
        //System.out.println("context启动成功");
        //MessageService messageService=(MessageService)context.getBean("messageService");
        //System.out.println(messageService.getMessage());
          Pro pro=new Pro(new Dog());
          //Pet pet=(Pet)Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(),new Class[]{Pet.class},pro);
          Pet pet=(Pet)pro.newInstance();
          pet.eat();


    }
}
