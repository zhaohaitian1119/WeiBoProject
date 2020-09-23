package com.group.weibo.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.group.weibo.pojo.Users;
import com.group.weibo.pojo.UsersExample;
import com.group.weibo.service.JUsersService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/sjl")
public class UserAdminController {
    @Resource
    JUsersService jUsersService;
    @RequestMapping("/toAdmin")
    public String admin(Model model, HttpServletRequest request){
        int Num=1;
        String pageNum=request.getParameter("pageNum");
        if(pageNum!=null){
            Num=Integer.parseInt(pageNum);
        }
        int pageSize=3;
        PageHelper.orderBy("id asc");
        PageHelper.startPage(Num,pageSize);


        UsersExample usersExample=new UsersExample();
        UsersExample.Criteria criteria = usersExample.createCriteria();
        List<Users> users=jUsersService.UserAll(Num,pageSize);

        PageInfo<Users> pageInfo=new PageInfo<>(users);
        model.addAttribute("pageInfo",pageInfo);
        return "admin";
    }

    @RequestMapping("/del")
    public String delBlog(int id){
        jUsersService.del(id);
        return "redirect:/sjl/toAdmin";
    }

    @RequestMapping("/upd")
    public String upd(Users users) {
        jUsersService.update(users);
        return "updateuser";
    }
}
