package com.arvin.cloud.master.task;

import com.arvin.cloud.master.persistence.domain.User;
import com.arvin.cloud.master.persistence.manager.UserManager;
import com.arvin.cloud.master.redis.manager.RedisManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.ListOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.SetOperations;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;
/**
 * @Author: arvin
 * @Date: 2019/3/26
 * @Version 1.0
 */
@Component
public class Task {

    private static final Logger LOGGER = LoggerFactory.getLogger(Task.class);

    @Autowired
    private RedisManager redisManager;
    @Autowired
    RedisTemplate<String,String> redisTemplate;

    @Autowired
    private UserManager userManager;

    @Scheduled(cron = "* * * * * ?")
    public void cronJob() {

        User user = userManager.randOne();
        LOGGER.info("用户日志"+ user);

        System.out.println(new Date().toLocaleString());
        ValueOperations<String, String> opsForValue = redisTemplate.opsForValue();
        SetOperations<String, String> opsForSet = redisTemplate.opsForSet();
        ListOperations<String, String> opsForList = redisTemplate.opsForList();

        opsForList.range("rediscunt",1,2);
        opsForValue.set("rediscountset","12345");
        System.out.println(opsForSet.pop("rediscunt"));
        System.out.println(opsForValue.get("rediscountset"));
    }
}
