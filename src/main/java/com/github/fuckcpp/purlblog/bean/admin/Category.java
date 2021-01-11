package com.github.fuckcpp.purlblog.bean.admin;/*
作者Crying711
日期:2021/1/11
时间:21:43
*/

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
@TableName("t_category")
public class Category {
    @TableId(type = IdType.AUTO)
    private Integer id;
    private String name;
    private String link;
    private Integer type;
    private Integer sort;
    private Integer pid;
    private Integer state;
    private String page;

    private Integer createTime;
    private Integer updateTime;
    private Integer deleteTime;


}
