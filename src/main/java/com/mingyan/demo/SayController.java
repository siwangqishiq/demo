package com.mingyan.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/say")
public class SayController {

    @RequestMapping("/user")
    public User sayUser(){
        User user = new User();
        user.setId(100);
        user.setDesc("我老婆是gakki");
        user.setName("毛利兰");
        user.setSex("f");
        return user;
    }

    @RequestMapping("/userlist")
    public List<User> getList(){
        List<User> uList = new ArrayList<User>();
        for(int i = 0 ;i <100;i++){
            User user = new User();
            user.setId(i+1000);
            user.setDesc("我老婆是gakki");
            user.setName("毛利兰");
            user.setSex("f");
            uList.add(user);
        }//end for i
        return uList;
    }

}// end class
