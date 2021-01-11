package com.github.fuckcpp.purlblog.Controller.Admin.category;/*
作者Crying711
日期:2021/1/12
时间:0:33
*/

import com.github.fuckcpp.purlblog.Maper.CategoryMapper;
import com.github.fuckcpp.purlblog.Service.CategoryService;
import com.github.fuckcpp.purlblog.bean.admin.Category;
import com.github.fuckcpp.purlblog.bean.admin.Layui;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@Slf4j
@RestController
@RequestMapping("/admin/category")
public class CategoryRest
{


    @Autowired
    CategoryService categoryService;

    @Autowired
    Category category;


    @Autowired
    CategoryMapper categoryMapper;


    @PostMapping("/setPage")
    public  Layui setPage(Integer id ,Integer value)
    {
        if ((value == 1 || value == 0))
        {

            Boolean aBoolean = categoryMapper.setpage(id, value);
            if (aBoolean)
            {
                return Layui.builder().code(1).msg("操作成功").build();

            }
        }
        return Layui.builder().code(0).msg("操作失败").build();
    }
    @PostMapping("/changeSort")
    public  void changeSort()
    {

    }
    @PostMapping("/add")
    public  Layui  add(Integer pid,String name,String page)
    {


       if (pid!=null&&name!=null&&page!=null)
       {
            category.setPage(page);
            category.setPid(pid);
            category.setName(name);
           boolean save = categoryService.save(category);
           if (save)
           {
               return Layui.builder().code(1).msg("操作成功").build();
           }else {
               return Layui.builder().code(0).msg("操作失败").build();
           }
       }
        return Layui.builder().code(0).msg("操作失败").build();

//        pid=1&name=dsadas&page=dsadasd

    }
    @PostMapping("/changeState")
    public  Layui  changeState(Integer id,Integer value)
    {

        if ((value == 1 || value == 0))
        {

            Boolean aBoolean = categoryMapper.changeState(id, value);
            if (aBoolean)
            {
                return Layui.builder().code(1).msg("操作成功").build();

            }
        }
        return Layui.builder().code(0).msg("操作失败").build();


    }

    @PostMapping("/del")
    public Layui delete(String id)
    {


        if (id!=null)
        {
            try {
                Integer.parseInt(id);
                boolean b = categoryService.removeById(id);
                if (b)
                {
                    return Layui.builder().code(1).msg("删除成功").build();
                }else
                    {
                        return Layui.builder().code(0).msg("删除失败id 不存在").build();
                    }
            }catch (Exception e)
            {
                log.error("id不正确 ",e);
                return Layui.builder().code(0).msg("删除失败 id 或者异常 不存在").build();
            }
        }
        return Layui.builder().code(0).msg("删除失败 id 或者异常 不存在").build();

    }





}
