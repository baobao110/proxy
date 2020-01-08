package com.spring.context.clone;/**
 * @description:
 * @author: Lenovo
 * @date: 2019-11-21 10:28
 */

/**
 * @Auther chenhao
 * @Date 2019/11/21
 */
public class Test {


    public static void main(String[] args) {
      /* Person person = new Person();

        person.setAge(11);

        person.setName("12121");

        Person p=(Person) person.clone();
        p.setAge(22);

        System.out.println("=====person============");

        System.out.println(person.toString());

        System.out.println("===============p======================");

        System.out.println(p.toString());

        System.out.print("person:p=");
        System.out.println(person==p);


        System.out.print("class=");
        System.out.println(person.getClass()==p.getClass());


        System.out.println("====UnCloneA=======change======");

        person.unCloneA.doublevalue();

        System.out.println(person.unCloneA);

        System.out.println(p.unCloneA);*/

     Child child=new Child(11,"11");
      Child ch=null;
      try{
          ch=(Child)child.deepClone();
      }catch (Exception e){
          e.printStackTrace();
      }
      System.out.println(child.unCloneA);
      System.out.println(ch.unCloneA);
      System.out.println("====UnCloneA=======change======");
      child.unCloneA.doublevalue();
      System.out.println(child.unCloneA);
      System.out.println(ch.unCloneA);

    }

}
