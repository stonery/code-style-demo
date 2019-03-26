package com.arvin.cloud.master.persistence.domain;

/**
 * 用户
 * @Author: arvin
 * @Date: 2019/3/26
 * @Version 1.0
 */
public class User extends BaseDomain{
    /**
     * 用户名
     */
    private String userName;
    /**
     * 用户状态
     */
    private Integer state;
    /**
     * 年龄
     */
    private Integer age;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
