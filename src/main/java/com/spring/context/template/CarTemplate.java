package com.spring.context.template;/**
 * @description:
 * @author: Lenovo
 * @date: 2019-11-21 10:49
 */

/**
 * @Auther chenhao
 * @Date 2019/11/21
 */
public abstract class CarTemplate {

    public String name;

    public CarTemplate(String name) {
        this.name = name;
    }

    public abstract void buildWheel();

    public abstract void buildEngine();

    public abstract void buildCarbody();

    public abstract void buildCarlight();

    public void buildCar(){
        buildWheel();
        buildEngine();
        buildCarbody();
        buildCarlight();
    }


}
