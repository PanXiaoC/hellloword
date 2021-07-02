package com.example.hellloword.services;

import com.example.hellloword.bean.userinfo;

import java.util.Map;

public interface userservies {
    Map<String,String> login(userinfo user);
}
