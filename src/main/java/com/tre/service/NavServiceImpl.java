package com.tre.service;

import com.tre.dao.NavMapper;
import com.tre.entity.Nav;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class NavServiceImpl implements NavService {

    @Resource
    private NavMapper navMapper;

    @Override
    public List<Nav> selectAll() {
        return navMapper.selectAllNav();
    }

    @Override
    public Nav selectNavByName(String nav_name) {
        return navMapper.selectNavByName(nav_name);
    }

    @Override
    public Integer createNav(Nav nav) {
        Integer nav2 = navMapper.insertNav(nav);
        return nav2;
    }

    @Override
    public Integer updateNav(Nav nav) {
        return navMapper.updateNav(nav);
    }

    @Override
    public Integer deleteNav(String nav_name) {
        return navMapper.deleteNav(nav_name);
    }

    @Override
    public Nav selectNavById(String nav_id) {
        return navMapper.selectNavById(nav_id);
    }
}
