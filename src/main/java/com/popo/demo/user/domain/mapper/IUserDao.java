package com.popo.demo.user.domain.mapper;

import com.popo.demo.user.domain.model.User;
import com.popo.demo.user.domain.model.UserInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface IUserDao {

    /**
     * 根据user Id 查询 user 信息
     *
     * @param userId 用户id
     * @return 用户信息
     */
    User findOne(@Param("id") Long userId);

    /**
     * 根据user Id 查询 user 信息
     *
     * @param userId 用户id
     * @return 用户信息
     */
    UserInfo findUserInfo(@Param("id") Long userId);
}
