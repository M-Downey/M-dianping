package com.hmdp.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hmdp.dto.LoginFormDTO;
import com.hmdp.dto.Result;
import com.hmdp.entity.User;

import javax.servlet.http.HttpSession;
import java.net.HttpCookie;

/**
 * <p>
 *  服务类
 * </p>
 */
public interface IUserService extends IService<User> {
    public Result login(LoginFormDTO loginFormDTO, HttpSession session);

    Result sendCode(String phone, HttpSession session);
}
