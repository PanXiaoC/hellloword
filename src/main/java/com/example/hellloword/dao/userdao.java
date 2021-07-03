package com.example.hellloword.dao;

import com.example.hellloword.bean.userinfo;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface userdao {
    @Select("select pwd from userinfo where username=#{username}")
    public String getPwd(userinfo user);
    @Select("select * from userinfo where username=#{username}")
    public String getAll(userinfo user);
    @Update("update userinfo set pwd=#{pwd} where username=#{username}")
    public int updatePwd(userinfo record);


}
