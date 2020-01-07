package com.spring.context.clone;/**
 * @description:
 * @author: Lenovo
 * @date: 2019-11-21 10:26
 */

/**
 * @Auther chenhao
 * @Date 2019/11/21
 */
public class Person implements  Cloneable {

    private int age;

    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    protected Object clone() {
       Person person= null;

       try{
           person=(Person)super.clone();
       }catch (Exception e){
           e.printStackTrace();
       }

       return person;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
