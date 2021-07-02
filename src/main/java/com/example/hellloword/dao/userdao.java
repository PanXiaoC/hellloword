package com.example.hellloword.dao;

import com.example.hellloword.bean.userinfo;
import org.apache.ibatis.annotations.Select;


public interface userdao {
    @Select("select pwd from userinfo where username=#{username}")
    String getuser(userinfo user);
}
