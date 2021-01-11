package com.github.fuckcpp.purlblog.Controller.Admin.Login;/*
作者Crying711
日期:2021/1/11
时间:13:30
*/

import com.github.fuckcpp.purlblog.Maper.AdminMapper;
import com.github.fuckcpp.purlblog.Utils.MD5Location;
import com.github.fuckcpp.purlblog.bean.Login;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

@Slf4j
@Controller
@RequestMapping("/admin")
public class LoginController
{

    @GetMapping("/login")
    public  String Login()
    {
        return  "admin/login/index";

    }
    @Autowired
    AdminMapper adminMapper;


    @ResponseBody
    @PostMapping("/login.do")
    public com.github.fuckcpp.purlblog.bean.admin.Login LoginDO(Login login,HttpServletRequest request)
    {

        String code =request.getSession().getAttribute("code").toString();
        if (login!=null)
        {
            log.info("login :"+ login );
            if (login.getCaptcha().equals(code))
            {
                String isadmin = adminMapper.Isadmin(login.getUsername(), MD5Location.getMd5(login.getPassword()));
                if (isadmin !=null)
                {
                    return new com.github.fuckcpp.purlblog.bean.admin.Login("登录成功", "https://www.baidu.com/s", 1);
                }
                }

        }
        return  new com.github.fuckcpp.purlblog.bean.admin.Login("登录失败","https://www.baidu.com/",0);

    }

    @GetMapping("/code")
    public  void Code(HttpServletResponse response, HttpServletRequest request) throws IOException {
        BufferedImage bufferedImage = new BufferedImage(100,40,BufferedImage.TYPE_3BYTE_BGR);
        Graphics g = bufferedImage.getGraphics();
        String code ="";
        g.setColor(Color.YELLOW);
        g.fillRect(0,0,100,100);
        g.setColor(Color.MAGENTA);
        g.drawRect(0,0,100-1,100-1);
        String var = "QWERTYUIPASDFGHJKLZXCVBNM123456789";
        for (int i = 1; i <= 4; i++)
        {
            int len = new Random().nextInt(var.length());
            char a = var.charAt(len);
            int x = 100/5*i;
            code+=a;
            g.drawString(a+"",x,25);
        }
        log.info("ip:  "+request.getRemoteAddr()+"code:  "+code);
        request.getSession().setAttribute("code",code.toString());
//        model.addAttribute("code",code.toString());
        g.setColor(Color.green);
        g.drawLine(1,1,30,30);
        ImageIO.write(bufferedImage,"jpg",response.getOutputStream());
    }

}
