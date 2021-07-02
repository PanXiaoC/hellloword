package com.example.hellloword.controller;

import com.example.hellloword.bean.userinfo;
import com.example.hellloword.services.servicesimpl.userservice;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@RestController
@CrossOrigin
public class login {
    @Resource
    private userservice users;

    @RequestMapping("/login")
    public Map<String,String>  login (userinfo userb){
        Map<String,String> map=new HashMap<>();
       map= users.login(userb);
        System.out.println("======");
       return map;
    }
}
