package com.github.fuckcpp.purlblog.Controller.Admin.category;/*
作者Crying711
日期:2021/1/11
时间:21:31
*/

import com.github.fuckcpp.purlblog.Service.CategoryService;
import com.github.fuckcpp.purlblog.bean.admin.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/admin/category")
public class CategoryController {


    @Autowired
    CategoryService service;


    @GetMapping("/index")
    public String index(Model model) {


        List<Category> Categorylist = service.list();
        model.addAttribute("Category",Categorylist);
        return "admin/category/index";
    }

    @GetMapping("/edit")
    public String edit() {
        return "admin/category/edit";
    }

}
