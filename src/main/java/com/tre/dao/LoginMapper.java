package com.tre.dao;

import com.tre.entity.Manager;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface LoginMapper {

    Manager selectByMid(@Param("manager_name") String manager_name);

}
