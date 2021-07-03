package com.example.hellloword.dao;

import com.example.hellloword.bean.userinfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface userdao {
    @Select("select pwd from userinfo where username=#{username}")
    public String getPwd(userinfo user);
    @Select("select * from userinfo where username=#{username")
    public String getAll(userinfo user);


}
