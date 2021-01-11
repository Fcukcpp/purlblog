package com.github.fuckcpp.purlblog.Controller.Admin.index;/*
作者Crying711
日期:2021/1/11
时间:21:03
*/


import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class IndexController
{


    @GetMapping("/index")
    public  String index()
    {
        return  "admin/index/index";
    }

    @GetMapping("/welcome")
    public  String welcome()
    {
        return  "admin/index/welcome";
    }




}
