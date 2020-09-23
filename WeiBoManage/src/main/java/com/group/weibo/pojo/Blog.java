package com.group.weibo.pojo;

import java.util.Date;

public class Blog {
    private Integer id;

    private String content;

    private Date publicshtime;

    private Integer userid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Date getPublicshtime() {
        return publicshtime;
    }

    public void setPublicshtime(Date publicshtime) {
        this.publicshtime = publicshtime;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }
}