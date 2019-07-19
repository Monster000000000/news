package com.tre.controller;

import com.tre.entity.Manager;
import com.tre.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    //查询全部用户信息
    @GetMapping(value = "/allUser")
    public ResponseEntity getStudent() {
        List<Manager> managerList=userService.selectAll();
        return ResponseEntity.ok(managerList);
    }

    //添加用户
    @PostMapping(value = "/userCreate")
    public ResponseEntity createUser(@RequestBody Manager manager) {
        Manager manager1 = userService.selectUserBySid(manager.getManager_id());
        if (manager1 != null) {
            return ResponseEntity.ok().body("False");
        } else {
            userService.createUser(manager);
            return ResponseEntity.ok().body("Success");
        }

    }

    //修改用户
    @PostMapping(value = "/userUpdate")
    public ResponseEntity updateUser(@RequestBody Manager manager) {
        userService.updateUser(manager);
        return ResponseEntity.ok(manager);
    }

    //删除用户
    @PostMapping(value = "/userDelete/{manager_id}")
    public ResponseEntity deleteUser(@PathVariable("manager_id") String manager_id) {
        userService.deleteUser(manager_id);
        return ResponseEntity.ok(manager_id);
    }
}
