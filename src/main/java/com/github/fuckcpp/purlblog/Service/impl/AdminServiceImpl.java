package com.github.fuckcpp.purlblog.Service.impl;/*
作者Crying711
日期:2021/1/10
时间:21:34
*/

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.fuckcpp.purlblog.Maper.AdminMapper;
import com.github.fuckcpp.purlblog.Service.AdminService;
import com.github.fuckcpp.purlblog.bean.Admin;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl  extends ServiceImpl<AdminMapper, Admin> implements AdminService {
}
