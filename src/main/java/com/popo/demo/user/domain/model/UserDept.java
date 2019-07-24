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
@Table(name = "user_dept")
@NoArgsConstructor
@AllArgsConstructor
public class UserDept {

    /**
     * 账号id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 科室名称
     */
    private String deptName;

    /**
     * 用户id
     */
    private Long userId;

    public UserDept(String deptName, Long userId) {
        this.deptName = deptName;
        this.userId = userId;
    }
}
