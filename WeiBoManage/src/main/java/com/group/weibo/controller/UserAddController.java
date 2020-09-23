package com.group.weibo.controller;

import com.group.weibo.pojo.Users;
import com.group.weibo.service.JUsersService;
import org.apache.commons.io.FilenameUtils;
import org.apache.commons.lang.math.RandomUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;

@Controller
@RequestMapping("/jjs")
public class UserAddController {
    @Resource
    JUsersService jUsersService;

    /*
     *跳转添加页面的控制器
     * */
    @RequestMapping("/toadd")
    public String add() {
        return "UsersAdd";
    }

    /*
     *添加User的控制器
     * */
    @RequestMapping("/doadd")
    public String doadd(Users users, MultipartFile picpathFile, HttpSession session, Model model) {
        if (picpathFile != null && picpathFile.isEmpty() == false) {
            //上传图片
            String realPath = session.getServletContext().getRealPath("/static/uploadfiles/");
            //源文件名
            String originalFilename = picpathFile.getOriginalFilename();
            //扩展名
            String extension = FilenameUtils.getExtension(originalFilename);
            String newFilName = System.currentTimeMillis() + RandomUtils.nextInt(100000) + "_." + extension;
            File file = new File(realPath, newFilName);
            try {
                picpathFile.transferTo(file);
                users.setPicpath("/static/uploadfiles/" + newFilName);
                users.setSupper(0);
                jUsersService.UsersAdd(users);
            } catch (IOException e) {
                e.printStackTrace();
                model.addAttribute("error", "添加失败");
            }
        } else {
            model.addAttribute("error", "请选择头像");
        }
        return "redirect:/sjl/toAdmin";
    }

}
