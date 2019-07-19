package com.tre.controller;

import com.tre.entity.Manager;
import com.tre.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class LoginController {

    @Autowired
    private LoginService loginService;

    //管理员登录
    @PostMapping(value = "/login")
    public ResponseEntity LoginUser(@RequestBody Manager manager, HttpServletRequest request) {
        Manager manager1 = loginService.selectByMid(manager.getManager_name());
        if (manager1 == null) {
            return ResponseEntity.ok().body("FalseNull");
        }else if (manager1.getManager_name().equals(manager.getManager_name()) && manager1.getManager_pwd().equals(manager.getManager_pwd())) {
            //登录成功，写入Session
            request.getSession(true).setAttribute("manager", manager1);
            return ResponseEntity.ok().body("Success");
        }else {
            return ResponseEntity.ok().body("False");
        }
    }
}
