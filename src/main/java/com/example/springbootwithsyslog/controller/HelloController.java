package com.example.springbootwithsyslog.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/hello")
public class HelloController {

    Logger logger = LoggerFactory.getLogger(HelloController.class);

    @GetMapping
    public ResponseEntity<String> sayHello() {
        logger.info("Hello World, Hi syslog");
        return ResponseEntity.ok("hello world");
    }
}
