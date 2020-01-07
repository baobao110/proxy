package com.spring.context.template;/**
 * @description:
 * @author: Lenovo
 * @date: 2019-11-21 10:56
 */

/**
 * @Auther chenhao
 * @Date 2019/11/21
 */
public class Test {

    public static void main(String[] args) {
        CarTemplate car1=new LandRover("路虎");
        CarTemplate car2=new Audi("奥迪");
        car1.buildCar();
        car2.buildCar();
    }
}
