package com.spring.context.template;/**
 * @description:
 * @author: Lenovo
 * @date: 2019-11-21 10:55
 */

/**
 * @Auther chenhao
 * @Date 2019/11/21
 */
public class Audi extends CarTemplate {

    public Audi(String name) {
        super(name);
    }

    @Override
    public void buildWheel() {
        System.out.println(name + "越野车轮");
    }

    @Override
    public void buildEngine() {
        System.out.println(name + "柴油发动机");
    }

    @Override
    public void buildCarbody() {
        System.out.println(name + "SUV越野车型");
    }

    @Override
    public void buildCarlight() {
        System.out.println(name + "普通车灯");
    }
}
