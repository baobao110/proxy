package com.spring.context;/**
 * @description:
 * @author: Lenovo
 * @date: 2019-10-16 11:07
 */

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Auther chenhao
 * @Date 2019/10/16
 */
public class Pro  implements InvocationHandler {

    private Pet pet;

    public Pro (Pet pet){
        this.pet=pet;
    }

    public Object newInstance(){
        return Proxy.newProxyInstance(this.pet.getClass().getClassLoader(),this.pet.getClass().getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object str=null;
        System.out.println("==========cat=============");
        if(method.getName().equals("eat")){
                str= (String)method.invoke(pet,args);
        }
        if(method.getName().equals("sleep")){
            str=(String)method.invoke(pet,args);
        }
        return str;
    }
}
