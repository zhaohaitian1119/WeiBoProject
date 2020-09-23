package com.group.weibo.service.impl;

import com.group.weibo.mapper.UsersMapper;
import com.group.weibo.pojo.Users;
import com.group.weibo.service.JUsersService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class JUsersServiceImpl implements JUsersService {
    @Resource
    UsersMapper usersMapper;

    @Override
    public void UsersAdd(Users users) {
        usersMapper.insert(users);
    }


    @Override
    public List<Users> UserAll(int num, int pageSize) {
        List<Users> users=usersMapper.selectByExample(null);
        return users;

    }

    @Override
    public int del(int id) {
        return usersMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void update(Users users) {
        usersMapper.updateByPrimaryKey(users);
    }

}
