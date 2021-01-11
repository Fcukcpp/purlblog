package com.github.fuckcpp.purlblog.bean.admin;/*
作者Crying711
日期:2021/1/12
时间:0:47
*/

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Date;

@Configuration(proxyBeanMethods = false)
public class Config
{




    @Bean
    public  Category GetCatepory()
    {           Category category = Category
                .builder().
                createTime((int) (new Date().getTime()/1000)).
                page(null).type(0).link(null).sort(0).state(0).build();
                return  category;
    }




}
