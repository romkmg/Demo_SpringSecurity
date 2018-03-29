package com.example.security.demo.domain;

import java.util.Date;

/**
 * 实体基础类
 * @author Mao.Zeng@MG
 * @date 2018/3/22 12:00
 */
public class BasicsEntity {

    private Date creatDate;
    private Date updateDate;

    public Date getCreatDate() {
        return creatDate;
    }

    public void setCreatDate(Date creatDate) {
        this.creatDate = creatDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }
}
