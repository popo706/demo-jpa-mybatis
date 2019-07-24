package com.popo.demo.user.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserInfo {

    /**
     * 用户id
     */
    private Long userId;

    /**
     * 真实姓名
     */
    private String realName;

    /**
     * 手机号
     */
    private String phoneNum;

    /**
     * 出生日期
     */
    private Long birthday;

    /**
     * 用户科室列表
     */
    private List<UserDept> userDepts;

    public UserInfo(User user, List<UserDept> userDepts) {
        this.userId = user.getId();
        this.realName = user.getRealName();
        this.phoneNum = user.getPhoneNum();
        this.birthday = user.getBirthday();
        this.userDepts = userDepts;
    }
}
