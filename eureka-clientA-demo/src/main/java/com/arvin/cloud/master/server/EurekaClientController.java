package com.arvin.cloud.master.server;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class EurekaClientController {

    @RequestMapping("/hello")
    public String home() {
        return "hello world from port ";
    }


    @Autowired
    RestTemplate restTemplate;

    @RequestMapping("/hi")
    public String hi(@RequestParam String id){
        return restTemplate.getForObject("http://eureka-client/hello?id="+id, String.class);
    }
}
