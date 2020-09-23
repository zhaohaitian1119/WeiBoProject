package com.group.weibo.service.impl;

import com.group.weibo.mapper.UsersMapper;
import com.group.weibo.pojo.Users;
import com.group.weibo.pojo.UsersExample;
import com.group.weibo.service.UsersService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class UsersServiceImpl implements UsersService {

    @Resource
    UsersMapper usersMapper;



    @Override
    public String touXiang(int userId) {
        String tx=null;
        UsersExample example=new UsersExample();
        UsersExample.Criteria criteria = example.createCriteria();
        criteria.andIdEqualTo(userId);
        List<Users> users = usersMapper.selectByExample(example);
        if(users!=null&&users.size()>0){
            tx=users.get(0).getPicpath();
        }
        return tx;
    }


}
