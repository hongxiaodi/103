package com.mr.dzh.entity;

import cn.afterturn.easypoi.excel.annotation.Excel;

import java.util.Date;

public class DemoEntity {
    private Integer id;

    @Excel(name = "姓名", orderNum = "0", width = 15)
    private String name;
    @Excel(name = "性别", orderNum = "1", width = 15)
    private Integer sex;
    @Excel(name = "爱好", orderNum = "2", width = 15)
    private String hobby;
    @Excel(name = "生日", orderNum = "3", width = 15,format = "yyyy-MM-dd")
    private Date birthday;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby == null ? null : hobby.trim();
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}