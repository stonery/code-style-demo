package com.arvin.cloud.master.redis.exception;

/**
 * @Author: arvin
 * @Date: 2019/3/26
 * @Version 1.0
 */
public class RedisConfigException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8959451096006473819L;

	public RedisConfigException() {
		super();
	}

	public RedisConfigException(String message, Throwable cause) {
		super(message, cause);
	}

	public RedisConfigException(String message) {
		super(message);
	}

	public RedisConfigException(Throwable cause) {
		super(cause);
	}

}
