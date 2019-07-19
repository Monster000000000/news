package com.tre.service;

import com.tre.dao.LoginMapper;
import com.tre.entity.Manager;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class LoginServiceImpl implements LoginService {

    @Resource
    private LoginMapper loginMapper;

    @Override
    public Manager selectByMid(@Param("manager_name") String manager_name) {
        return loginMapper.selectByMid(manager_name);
    }
}
