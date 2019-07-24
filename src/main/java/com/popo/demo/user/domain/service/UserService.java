package com.popo.demo.user.domain.service;

import com.popo.demo.user.domain.model.User;

public interface UserService {

    /**
     * 新增 用户
     *
     * @param user 用户
     * @return 新增的用户id
     */
    Long addUser(User user);

    /**
     * 测试方法
     */
    void test();
}
