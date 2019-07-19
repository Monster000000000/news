package com.tre.service;

import com.tre.dao.UserMapper;
import com.tre.entity.Manager;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public List<Manager> selectAll() {
        return userMapper.selectAllUser();
    }

    @Override
    public Manager selectUserBySid(String manager_id) {
        return userMapper.selectUserBySid(manager_id);
    }

    @Override
    public Integer createUser(Manager manager) {
        Integer manager2 = userMapper.insertUser(manager);
        return manager2;
    }

    @Override
    public Integer updateUser(Manager manager) {
        return userMapper.updateUser(manager);
    }

    @Override
    public Integer deleteUser(String manager_id) {
        return userMapper.deleteUser(manager_id);
    }
}
