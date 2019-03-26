package com.arvin.cloud.master.persistence.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * @Author: arvin
 * @Date: 2019/3/26
 * @Version 1.0
 */
public class BaseDomain implements Serializable {

    private Long id;

    private Boolean isDelete;

    private Date gmtCreate;

    private Boolean mgtUpdate;

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Boolean getMgtUpdate() {
        return mgtUpdate;
    }

    public void setMgtUpdate(Boolean mgtUpdate) {
        this.mgtUpdate = mgtUpdate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Boolean getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Boolean delete) {
        isDelete = delete;
    }
}
