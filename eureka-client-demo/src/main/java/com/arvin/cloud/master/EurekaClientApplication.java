package com.arvin.cloud.master;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.scheduling.annotation.EnableScheduling;
import tk.mybatis.spring.annotation.MapperScan;
/**
 * @Author: arvin
 * @Date: 2019/3/26
 * @Version 1.0
 */
@EnableEurekaClient
@SpringBootApplication
@EnableScheduling
@MapperScan({"com.arvin.cloud.master.persistence.mapper"})
public class EurekaClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClientApplication.class, args);
    }
}
