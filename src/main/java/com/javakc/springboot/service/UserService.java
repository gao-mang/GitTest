package com.javakc.springboot.service;

import com.javakc.springboot.entity.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService{

    public List<User> queryAll(){
        List<User> list=new ArrayList<>();
        for (int i = 0; i <=10 ; i++) {
            User user=new User();
            user.setUserid(i);
            user.setUsername("张三"+i);
            user.setGender(i%2==0?1:2);
            user.setAddress("海淀区");
            list.add(user);
        }
        return list;
    }

    public User load(){

            User user=new User();
            //user.setUserid(userId);
            user.setUsername("李四");
            user.setGender(1);
            user.setAddress("朝阳区");
            return user;
    }

}
