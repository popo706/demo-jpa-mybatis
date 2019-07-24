package com.popo.demo.user.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "user")
@NoArgsConstructor
@AllArgsConstructor
public class User {

    /**
     * 账号id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

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

    public User(String realName, String phoneNum, Long birthday) {
        this.realName = realName;
        this.phoneNum = phoneNum;
        this.birthday = birthday;
    }
}
