package com.javakc.springboot.Controller;

import com.javakc.springboot.entity.User;
import com.javakc.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
   private UserService userService;
    @GetMapping
    public List<User> query(){


        return userService.queryAll();
    }

    /*@GetMapping("{userId}")
    public User load(@PathVariable int userId){


        return userService.load(userId);//qqqq
    }*/
   @PostMapping
    public void insert(@PathVariable User user){


       System.out.println("用户添加："+user);
    }
    @PutMapping
    public void update(@PathVariable User user){


        System.out.println("用户修改："+user);
    }

    @DeleteMapping("{userId}")
    public void delete(@PathVariable int userId){


        System.out.println("用户删除："+userId);
    }

}
