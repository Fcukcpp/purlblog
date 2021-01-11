package com.github.fuckcpp.purlblog.bean;/*
作者Crying711
日期:2021/1/10
时间:21:08
*/


import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;


@NoArgsConstructor
@AllArgsConstructor
@Data
@TableName("t_admin")
public class Admin
{
    private  Integer id;
    private  String username;
    private  Integer state;
    private  String email;
    private  String nickname;
    private  Date createTime;
    private  Date updateTime;
    private  Date deleteTime;



}
