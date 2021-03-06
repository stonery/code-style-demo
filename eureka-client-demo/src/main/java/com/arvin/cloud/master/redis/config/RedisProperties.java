package com.arvin.cloud.master.redis.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author: arvin
 * @Date: 2019/3/26
 * @Version 1.0
 */
@Component("redisProperties")
@ConditionalOnProperty(prefix = "spring.redis.cluster", name = "type", havingValue = "cluster")
@ConfigurationProperties(prefix = "spring.redis.cluster")
public class RedisProperties {

	public List<String> nodes = new ArrayList<>();

	public List<String> getNodes() {
		return nodes;
	}

	public void setNodes(List<String> nodes) {
		this.nodes = nodes;
	}

	@PostConstruct
	public void initMethod() {
		if (nodes == null || nodes.isEmpty()) {
			throw new RuntimeException("spring.redis.cluster.nodes is required.");
		}
	}
}