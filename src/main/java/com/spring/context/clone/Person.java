package com.spring.context.clone;
/**
 * @Auther chenhao
 * @Date 2019/11/21
 * @Descp:浅拷贝  注意 unCloneA 指向同一个内存空间
 */

public class Person implements  Cloneable {

    public UnCloneA unCloneA=new UnCloneA(11);

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
