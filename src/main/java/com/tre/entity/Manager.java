package com.tre.entity;

public class Manager {
    private String manager_id;// varchar(10) primary key comment '管理员ID',
    private String manager_name;// varchar(20) not null comment '管理员ID',
    private String manager_pwd;// varchar(50) not null comment '管理员ID'

    public String getManager_id() {
        return manager_id;
    }

    public void setManager_id(String manager_id) {
        this.manager_id = manager_id;
    }

    public String getManager_name() {
        return manager_name;
    }

    public void setManager_name(String manager_name) {
        this.manager_name = manager_name;
    }

    public String getManager_pwd() {
        return manager_pwd;
    }

    public void setManager_pwd(String manager_pwd) {
        this.manager_pwd = manager_pwd;
    }
}
