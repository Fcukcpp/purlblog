package com.github.fuckcpp.purlblog.Maper;/*
作者Crying711
日期:2021/1/10
时间:21:33
*/

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.github.fuckcpp.purlblog.pojo.Admin.Admin;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Component;

@Component
@Mapper
public interface AdminMapper extends BaseMapper<Admin> {

    @Select("select 1 from t_admin where username =  #{name} and password = #{password} limit 1")
    public String Isadmin(@Param("name")String name, @Param("password")String pass) ;


    @Update("update t_admin set state =#{state} where id =#{id}")
    public Boolean changeState(@Param("id") Integer id, @Param("state")Integer value) ;
}
