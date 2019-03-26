package com.arvin.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@RestController
public class CloudConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudConfigApplication.class, args);
    }

//    @Value("${mysql.url}") // git配置文件里的key
//    String myww;
//
//    @RequestMapping(value = "/hi")
//    public String hi(){
//        return myww;
//    }
}
