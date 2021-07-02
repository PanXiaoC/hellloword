package com.example.hellloword.services.servicesimpl;

import com.example.hellloword.bean.userinfo;
import com.example.hellloword.dao.userdao;
import com.example.hellloword.services.userservies;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@Transactional
@Service
public class userservice implements userservies {
    @Resource
    private userdao udao;
    @Override
    public Map<String,String> login(userinfo user){
        String s=udao.getuser(user);
        Map<String,String> map= new HashMap<>();
        if(s.equals(user.getPwd())){
            s="登录成功";
            map.put("login",s);
            return map;
        }
        s="登录失败";
        map.put("login",s);
        return map;
    }
}
