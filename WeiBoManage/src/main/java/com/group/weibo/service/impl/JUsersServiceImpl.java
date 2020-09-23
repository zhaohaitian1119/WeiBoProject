package com.group.weibo.service.impl;

import com.group.weibo.mapper.UsersMapper;
import com.group.weibo.pojo.Users;
import com.group.weibo.service.JUsersService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class JUsersServiceImpl implements JUsersService {
    @Resource
    UsersMapper usersMapper;

    @Override
    public void UsersAdd(Users users) {
        usersMapper.insert(users);
    }
}
