package com.github.fuckcpp.purlblog.pojo.Admin;/*
作者Crying711
日期:2021/1/10
时间:21:08
*/


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@TableName("t_admin")
public class Admin
{
    @TableId(type = IdType.AUTO)
    private  Integer id;
    private  String username;
    private  String password;
    private  Integer state;
    private  String email;
    private  String nickname;
    private  Integer createTime;
    private  Integer updateTime;
    private  Integer deleteTime;



}
