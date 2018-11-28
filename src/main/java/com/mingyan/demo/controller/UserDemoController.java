package com.mingyan.demo.controller;

import com.mingyan.demo.model.User;
import com.mingyan.demo.service.ModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class UserDemoController {
    @Autowired
    private ModelService modelService;

    static int i = 0;

    @RequestMapping("/adduser")
    public Map<String,String> addUser(){
        Map<String,String> result = new HashMap<String,String>();
        i++;
        int v = modelService.insert("毛利兰"+i , i+"","毛利兰"+i+"_info");
        result.put("id" , String.valueOf(i));
        return result;
    }

    @RequestMapping("/finduser")
    public User findUser(){
        User user = modelService.getNameById(1);
        return user;
    }

    @RequestMapping("/findall")
    public List<User> findAllUser(){
        return modelService.findAllUser();
    }
}//end class
