package com.arvin.cloud.master.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * @Author: arvin
 * @Date: 2019/3/26
 * @Version 1.0
 */
@RestController
public class EurekaClientController {
    private static final Logger LOGGER = LoggerFactory.getLogger(EurekaClientController.class);
    @RequestMapping("/hello")
    public String home(String id) {
        LOGGER.info("controller日志{}",id);
        LOGGER.error("error_controller日志{}",id);
        return "hello world from port "+id;
    }
}
