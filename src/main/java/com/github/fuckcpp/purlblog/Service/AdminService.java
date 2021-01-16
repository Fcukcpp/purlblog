package com.github.fuckcpp.purlblog.Service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.github.fuckcpp.purlblog.pojo.Admin.Admin;
import org.springframework.transaction.annotation.Transactional;


/**
 *  Service 的CRUD也不用写了
 */
@Transactional
public interface AdminService extends IService<Admin> {

}
