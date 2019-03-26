package com.arvin.cloud.master.persistence.mapper;


import com.arvin.cloud.master.persistence.MyMapper;
import com.arvin.cloud.master.persistence.domain.User;

/**
 * @Author: arvin
 * @Date: 2019/3/26
 * @Version 1.0
 */
public interface UserMapper extends MyMapper<User> {

	/**
	 * 随机查询一条数据
	 * 
	 * @return
	 */
	public User randOne();
}
