package com.group.weibo.service;

import com.group.weibo.pojo.Users;

import java.util.List;

public interface JUsersService {
    void UsersAdd(Users users);

    List<Users> UserAll(int num, int pageSize);
    int del(int id);
    void  update(Users users);

}
