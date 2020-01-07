package com.spring.context.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ZSetOperations;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;
import java.util.concurrent.TimeUnit;

/**
 * @Auther chenhao
 * @Date 2019/11/25
 */
@RestController
public class RedisController {


    @Autowired
    private StringRedisTemplate stringRedisTemplate;


    @GetMapping("/getList")
    public  List<Map<String,Object>> getList(){
        for(int i=0;i<100;i++){
            stringRedisTemplate.opsForZSet().add("key","key-"+i,new Random().nextInt(1000));
        }
        //redis的倒序排序
        Set<ZSetOperations.TypedTuple<String>> sort =stringRedisTemplate.opsForZSet().reverseRangeWithScores("key",0,-1);
        List<Map<String,Object>> list=new ArrayList<>();
        Iterator<ZSetOperations.TypedTuple<String>> iterator = sort.iterator();
        while (iterator.hasNext()){
            ZSetOperations.TypedTuple<String> next=iterator.next();
            Map<String,Object> map=new HashMap<>();
            map.put(next.getValue(),next.getScore());
            list.add(map);
        }
        stringRedisTemplate.expire("key",30, TimeUnit.SECONDS);
        return list;
    }
}
