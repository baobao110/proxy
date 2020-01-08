package com.spring.context.clone;/**
 * @description:
 * @author: Lenovo
 * @date: 2020-01-08 16:50
 * @Descp:深拷贝  注意 unCloneA 为两个不同变量，独立存在
 */

import java.io.*;

/**
 * @Auther chenhao
 * @Date 2020/1/8
 */
public class Child implements Serializable {


    private static final long serialVersionUID = 6143928938156325900L;


    public UnCloneA unCloneA=new UnCloneA(11);


    private int age;

    private String name;

    public Child(int age, String name) {
        this.age = age;
        this.name = name;
    }

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
    public String toString() {
        return "Child{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public Object deepClone() throws Exception{
        ByteArrayOutputStream bos=new ByteArrayOutputStream();
        ObjectOutputStream oos=new ObjectOutputStream(bos);
        oos.writeObject(this);
        ByteArrayInputStream bis=new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois=new ObjectInputStream(bis);
        return ois.readObject();
    }






}
