package com.uwjx.docker.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping(value = "test")
public class TestController {

    @GetMapping(value = "index")
    public String index(){
        log.warn("test index log");
        return "test index";
    }
}
