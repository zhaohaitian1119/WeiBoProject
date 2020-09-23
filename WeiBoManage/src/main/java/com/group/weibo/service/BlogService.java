package com.group.weibo.service;

import com.group.weibo.pojo.Blog;

import java.util.List;

public interface BlogService {
    List<Blog> selectAllBlog();
    void del(int id);

    void add(Blog blog);
}
