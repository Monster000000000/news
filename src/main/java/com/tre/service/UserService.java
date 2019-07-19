package com.tre.service;

import com.tre.entity.Manager;

import java.util.List;

public interface UserService {

    List<Manager> selectAll();

    Manager selectUserBySid(String manager_id);

    Integer createUser(Manager manager);

    Integer updateUser(Manager manager);

    Integer deleteUser(String manager_id);
}
