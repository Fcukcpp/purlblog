package com.github.fuckcpp.purlblog.Config;/*
作者Crying711
日期:2021/1/11
时间:14:10
*/

import com.github.fuckcpp.purlblog.Constant.Serverconfig;
import com.github.fuckcpp.purlblog.interceptor.LoginInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.accept.HeaderContentNegotiationStrategy;
import org.springframework.web.accept.ParameterContentNegotiationStrategy;
import org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.nio.file.Path;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@Component
@Configuration
public class Webconfig implements WebMvcConfigurer {
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/static/upload/**").addResourceLocations("file:" + Serverconfig.PATH);
//        registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/");
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry)
    {
        registry.addInterceptor(new LoginInterceptor()).addPathPatterns("/admin/**")  //所有请求都被拦截包括静态资源
                .excludePathPatterns("/", "/admin/login", "static/admin/**", "static/index/**", "static/upload/**"
                        , "/admin/code", "/admin/login.do"
                ); //放行的请求;

    }


    /**
     * 自定义内容协商
     *
     * @param configurer
     */
    @Override
    public void configureContentNegotiation(ContentNegotiationConfigurer configurer) {
        Map<String, MediaType> mediaTypes = new HashMap<>();
        mediaTypes.put("gg", MediaType.parseMediaType("image/svg+xml"));
        //指定支持解析哪些参数对应的哪些媒体类型
        ParameterContentNegotiationStrategy parameterStrategy = new ParameterContentNegotiationStrategy(mediaTypes);
//                parameterStrategy.setParameterName("ff");

        HeaderContentNegotiationStrategy headeStrategy = new HeaderContentNegotiationStrategy();

        configurer.strategies(Arrays.asList(parameterStrategy, headeStrategy));
    }
}