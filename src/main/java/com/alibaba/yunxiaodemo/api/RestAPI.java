package com.alibaba.yunxiaodemo.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

public class RestAPI {

    @RequestMapping(value = "/hello")
    public String sayHello(@RequestParam(name = "name") String name) {
        return "Hello, " + name;
    }
}
