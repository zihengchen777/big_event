package com.itheima.service;

import com.itheima.pojo.User;
import org.springframework.stereotype.Service;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: Chen Ziheng
 * @Date: 2024/03/26/14:52
 * @Description:
 */

public interface UserService {
    //根据用户名查询用户
    public User findByUserName(String username);

    //注册用户
    void register(String username, String password);

    void update(User user);
    //更新头像
    void updateAvatar(String avatarUrl);

    void updatePwd(String newPwd,Integer id);
}
