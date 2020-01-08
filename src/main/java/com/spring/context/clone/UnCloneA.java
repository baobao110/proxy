package com.spring.context.clone;/**
 * @description:
 * @author: Lenovo
 * @date: 2020-01-08 17:13
 */

import java.io.Serializable;

/**
 * @Auther chenhao
 * @Date 2020/1/8
 */
public class UnCloneA implements Serializable {

    private static final long serialVersionUID = -5386184660490567606L;

    private int i;

    public UnCloneA(int ii) {
        i = ii;
    }

    public void doublevalue() {
        i *= 2;
    }

    public String toString() {
        return Integer.toString(i);
    }
}
