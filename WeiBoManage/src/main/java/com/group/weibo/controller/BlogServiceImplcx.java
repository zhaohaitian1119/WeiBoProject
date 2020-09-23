package com.group.weibo.controller;

import com.group.weibo.pojo.Blog;
import com.group.weibo.service.BlogServicecx;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.Date;

@Controller
public class BlogServiceImplcx {
    @Resource
    BlogServicecx blogServicecx;

    @RequestMapping("/addBlogcx")
    public String addBlogcx(Blog blog, String content){
        //用户id
        blog.setUserid(1);
        //微博内容
        blog.setContent(content);
        //发布时间
        blog.setPublicshtime(new Date());
        int i=blogServicecx.addBlog(blog);
        if(i>0){
            //添加成功跳转
            return "addSuccessTestcx";
        }
        return "addBlogcx";
    }


}
