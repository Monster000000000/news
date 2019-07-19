package com.tre.controller;

import com.tre.entity.Nav;
import com.tre.service.NavService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class NavController {

    @Autowired
    private NavService navService;

    //查询全部类别信息
    @GetMapping(value = "/allNav")
    public ResponseEntity getNav() {
        List<Nav> navList=navService.selectAll();
        return ResponseEntity.ok(navList);
    }

    //添加类别
    @PostMapping(value = "/navCreate")
    public ResponseEntity createNav(@RequestBody Nav nav) {
        Nav nav1 = navService.selectNavByName(nav.getNav_name());
        if (nav1 != null) {
            return ResponseEntity.ok().body("False");
        } else {
            navService.createNav(nav);
            return ResponseEntity.ok().body("Success");
        }

    }

    //修改类别
    @PostMapping(value = "/navUpdate")
    public ResponseEntity updateNav(@RequestBody Nav nav) {
        navService.updateNav(nav);
        return ResponseEntity.ok(nav);
    }

    //删除类别
    @PostMapping(value = "/navDelete/{nav_name}")
    public ResponseEntity deleteNav(@PathVariable("nav_name") String nav_name) {
        navService.deleteNav(nav_name);
        return ResponseEntity.ok(nav_name);
    }
}
