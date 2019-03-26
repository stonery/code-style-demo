package com.arvin.cloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope //开启更新功能
public class CloudConfigController {


    @Value("${mysql.url}") // git配置文件里的key
    String myww;

    @RequestMapping(value = "/hi")
    public String hi(){
        return myww;
    }
}
