package com.spring.context.domain;

import org.springframework.data.annotation.Id;

/**
 * @Auther chenhao
 * @Date 2019/10/22
 */
public class User {

    @Id
    private String id;

    private Integer age;

    private String username;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", age=" + age +
                ", username='" + username + '\'' +
                '}';
    }
}
