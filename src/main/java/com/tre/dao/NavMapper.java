package com.tre.dao;

import com.tre.entity.Nav;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface NavMapper {

    List<Nav> selectAllNav();

    Nav selectNavByName(String nav_name);

    Integer insertNav(Nav nav);

    Integer updateNav(Nav nav);

    Integer deleteNav(String nav_name);

    Nav selectNavById(String nav_id);
}
