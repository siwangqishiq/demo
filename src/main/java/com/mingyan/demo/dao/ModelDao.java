package com.mingyan.demo.dao;

import com.mingyan.demo.model.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface ModelDao {

    @Select("select * from test_user where id=#{id}")
    public User getNameById(@Param("id") long id);

    @Insert("insert into test_user(name,info,password) values(#{name},#{info},#{password})")
    @SelectKey(statement = "SELECT seq id FROM sqlite_sequence WHERE (name = 'test_user')", before = false, keyProperty = "id", resultType = int.class)
    public int insert(User user);

    @Select("select * from test_user")
    public List<User> findUserList();
}
