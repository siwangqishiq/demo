package com.mingyan.demo.service;

import com.mingyan.demo.dao.ModelDao;
import com.mingyan.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ModelService {
    @Autowired
    private ModelDao modelDao;

    public User getNameById(long id){
        return modelDao.getNameById(id);
    }


    public int insert(String name , String password , String info){
        User user = new User();
        user.setName(name);
        user.setInfo(info);
        user.setPassword(password);
        return modelDao.insert(user);
    }

    public List<User> findAllUser(){
        return modelDao.findUserList();
    }
}
