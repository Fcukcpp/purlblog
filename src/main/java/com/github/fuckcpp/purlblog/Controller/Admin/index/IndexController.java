package com.github.fuckcpp.purlblog.Controller.Admin.index;/*
作者Crying711
日期:2021/1/11
时间:21:03
*/


import com.github.fuckcpp.purlblog.pojo.Admin.Index;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class IndexController
{


    @Autowired
    Index index;


    @GetMapping("/index")
    public  String index(Model model)
    {

        return  "admin/index/index";
    }

    @GetMapping("/welcome")
    public  String welcome(Model model)
    {


        model.addAttribute("arch",index);
        return "admin/index/welcome";
    }




}
