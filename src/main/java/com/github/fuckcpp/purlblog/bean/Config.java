package com.github.fuckcpp.purlblog.bean;/*
作者Crying711
日期:2021/1/12
时间:0:47
*/

import com.github.fuckcpp.purlblog.Constant.Serverconfig;
import com.github.fuckcpp.purlblog.pojo.Admin.Category;
import com.github.fuckcpp.purlblog.pojo.Admin.Index;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Date;

@Configuration(proxyBeanMethods = false)
public class Config
{




    @Bean
    public Category GetCatepory()
    {           Category category = Category
                .builder().
                createTime((int) (new Date().getTime()/1000)).
                page(null).type(0).link(null).sort(0).state(0).build();
                return  category;
    }

    @Bean
    public Index Getwebsideconfig(){
     return    Index.builder().springbootversion("2.x").PureBlogversion("1.0.0").osname(Serverconfig.OSNAME).mysqlversion(Serverconfig.MYSQLVERSION).
                javaversion(Serverconfig.JAVAVERSION).filepath(Serverconfig.PATH).PID(Serverconfig.PID)
                .domainname(Serverconfig.DOMAINNAME)

             .build();



    }




}
