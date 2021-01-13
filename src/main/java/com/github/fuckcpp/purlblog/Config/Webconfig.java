package com.github.fuckcpp.purlblog.Config;/*
作者Crying711
日期:2021/1/11
时间:14:10
*/

import com.github.fuckcpp.purlblog.Constant.Serverconfig;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.nio.file.Path;

@Component
@Configuration
public class Webconfig implements WebMvcConfigurer
{
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/static/upload/**").addResourceLocations("file:"+Serverconfig.PATH);
//        registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/");
    }
}
