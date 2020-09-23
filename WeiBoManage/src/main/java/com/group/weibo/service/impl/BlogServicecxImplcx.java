package com.group.weibo.service.impl;

import com.group.weibo.mapper.BlogMapper;
import com.group.weibo.pojo.Blog;
import com.group.weibo.service.BlogServicecx;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("blogServicecx")
public class BlogServicecxImplcx implements BlogServicecx {
    @Resource
    BlogMapper blogMapper;

    //实现微博内容添加
    @Override
    public int addBlog(Blog blog) {
        return blogMapper.insert(blog);
    }
}
