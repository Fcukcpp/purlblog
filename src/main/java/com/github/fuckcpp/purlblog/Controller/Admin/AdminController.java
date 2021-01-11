package com.github.fuckcpp.purlblog.Controller.Admin;/*
作者Crying711
日期:2021/1/10
时间:21:40
*/

import com.github.fuckcpp.purlblog.Service.AdminService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@RequestMapping("/admin")
@Controller
@Slf4j
public class AdminController
{

    @Autowired
    AdminService adminService;









}
