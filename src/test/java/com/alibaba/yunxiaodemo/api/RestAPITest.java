package com.alibaba.yunxiaodemo.api;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class RestAPITest {

    RestAPI restAPI = new RestAPI();

    @Test
    void should_return_hello_kent() {
        String hello = restAPI.sayHello("Kent");

        assertThat(hello, is("Hello, Kent"));
    }
}