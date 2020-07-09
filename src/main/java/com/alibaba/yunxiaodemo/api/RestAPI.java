package com.alibaba.yunxiaodemo.api;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class RestAPI {

    @RequestMapping(value = "/hello")
    public String sayHello(@RequestParam(name = "name") String name) {
        return "Hello, " + name;
    }

    @RequestMapping(value = "/products", method = RequestMethod.POST)
    public ResponseEntity<Product> createProduct(@RequestBody Product product) {
        ResponseEntity<Product> productResponseEntity = new ResponseEntity<Product>(product, HttpStatus.CREATED);

        return productResponseEntity;
    }
}
