package com.arvin.cloud.master.persistence.manager.impl;

import com.arvin.cloud.master.persistence.domain.User;
import com.arvin.cloud.master.persistence.manager.UserManager;
import com.arvin.cloud.master.persistence.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * UserInfoManager
 *
 * @author zhaofeng
 * @since 2018-05-11 18:01
 */
@Component("userManager")
public class UserManagerImpl implements UserManager {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User randOne() {
        return userMapper.randOne();
    }
}
