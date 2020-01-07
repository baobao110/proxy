package com.spring.context.Interface;


import java.lang.annotation.*;

@Target({ElementType.METHOD,ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface EnableAuth {
    String name() default "自定义注解";
}
