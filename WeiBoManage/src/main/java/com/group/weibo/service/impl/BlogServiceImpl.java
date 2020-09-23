package com.group.weibo.service.impl;


import com.group.weibo.mapper.BlogMapper;
import com.group.weibo.pojo.Blog;
import com.group.weibo.pojo.BlogExample;
import com.group.weibo.service.BlogService;
import com.group.weibo.service.UsersService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service("blogService")
public class BlogServiceImpl implements BlogService {
    @Resource
    BlogMapper blogMapper;

    @Resource
    UsersService usersService;

    @Override
    public List<Blog> selectAllBlog() {
        List<Blog> blogs = blogMapper.selectByExample(null);
        for (Blog blog : blogs) {
            String s = usersService.touXiang(blog.getUserid());
            blog.setPicpath(s);
        }
        return blogs;
    }

    @Override
    public void del(int id) {
        blogMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void add(Blog blog) {
        blogMapper.insertSelective(blog);
    }

}
