package com.tkn.springbootjenkinsdemo.controller;

import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @description:
 * @author: lz
 * @time: 2022/9/5 15:51
 */
@RestController
public class HelloWord {
   @GetMapping("/hello")
    public Map hello(){
       HashMap<Object, Object> hashMap = Maps.newHashMap();
       hashMap.put("HelloWord","HelloWord");
       hashMap.put("status","success");
       return hashMap;
   }

}
