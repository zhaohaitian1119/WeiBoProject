package com.group.weibo.controller;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.group.weibo.pojo.Blog;
import com.group.weibo.pojo.Users;
import com.group.weibo.service.BlogService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.Date;

import java.util.List;


@Controller
public class BlogServiceController {
    @Resource
    BlogService blogService;

    @RequestMapping("/")
    public String toLogin(){
        return "blogInfo";
    }

    @RequestMapping("/toblog")
    public String toblog(Model model, @RequestParam(value="pageNum",required=false) String pageNumStr){
        int pageNum=1;
        if(pageNumStr!=null&&pageNumStr!=""){
            pageNum=Integer.parseInt(pageNumStr);
        }
        int pageSize=1;
        PageHelper.startPage(pageNum,pageSize);
        List<Blog> blogs = blogService.selectAllBlog();
        PageInfo<Blog> pageInfo=new PageInfo<>(blogs);
        model.addAttribute("pageInfo",pageInfo);
        return "blogInfo";
    }

    @RequestMapping("/delBlog")
    public String delBlog(int id){
        blogService.del(id);
        return "redirect:/toblog";
    }

    @RequestMapping("/fabu")
    public String fabu(){
        return "blogAdd";
    }

    @RequestMapping("/doBlogAdd")
    public String doBlogAdd(HttpSession session,String content){
        Users user =(Users) session.getAttribute("user");
        Blog blog=new Blog();
        blog.setUserid(user.getId());
        blog.setContent(content);
        blog.setPublicshtime(new Date());
        blogService.add(blog);
        return "redirect:/toblog";
    }
}
