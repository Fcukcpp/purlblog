package com.github.fuckcpp.purlblog.bean;/*
作者Crying711
日期:2021/1/11
时间:18:02
*/

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Login
{
    private String      username;
    private String      password;
    private String      captcha;
}
