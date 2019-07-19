package com.tre.service;

import com.tre.entity.Nav;

import java.util.List;

public interface NavService {

    List<Nav> selectAll();

    Nav selectNavByName(String nav_name);

    Integer createNav(Nav nav);

    Integer updateNav(Nav nav);

    Integer deleteNav(String nav_name);

    Nav selectNavById(String nav_id);
}
