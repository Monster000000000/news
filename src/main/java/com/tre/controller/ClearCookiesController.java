package com.tre.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
public class ClearCookiesController {
    @PostMapping("/clearCookies")
    public ResponseEntity clear(HttpServletRequest request, HttpServletResponse response){
        Cookie cookie = new Cookie("JSESSIONID",null);
        cookie.setMaxAge(0);
        cookie.setPath(request.getContextPath());
        response.addCookie(cookie);
        return ResponseEntity.ok().body("true");
    }
}
