package com.tre.dao;

import com.tre.entity.Manager;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface UserMapper {

    List<Manager> selectAllUser();

    Manager selectUserBySid(String manager_id);

    Integer insertUser(Manager manager);

    Integer updateUser(Manager manager);

    Integer deleteUser(String manager_id);
}
