package com.spring.context.service.impl;/**
 * @description:
 * @author: Lenovo
 * @date: 2019-10-15 14:14
 */

import com.spring.context.service.MessageService;

/**
 * @Auther chenhao
 * @Date 2019/10/15
 */
public class MessageServiceImpl  implements MessageService{
    @Override
    public String getMessage() {
        return "Hello";
    }
}
