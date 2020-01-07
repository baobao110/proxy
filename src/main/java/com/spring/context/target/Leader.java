package com.spring.context.target;/**
 * @description:
 * @author: Lenovo
 * @date: 2019-11-21 10:40
 */

import java.util.HashMap;
import java.util.Map;

/**
 * @Auther chenhao
 * @Date 2019/11/21
 */
public class Leader implements Target {

    public Map<String,Target> map = new HashMap<>();

    public Leader() {
        map.put("打印",new ATarget());
        map.put("测试",new BTarget());
    }

    @Override
    public void dosomething(String command) {
        map.get(command).dosomething(command);
    }
}
