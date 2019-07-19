package com.tre.service;

import com.tre.entity.Manager;
import org.apache.ibatis.annotations.Param;

public interface LoginService {

    Manager selectByMid(@Param("manager_name") String manager_name);

}
