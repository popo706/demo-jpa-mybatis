package com.popo.demo.user.domain.repository;

import com.popo.demo.user.domain.model.UserDept;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserDeptRepository extends JpaRepository<UserDept, Long> {

    /**
     * 根据 用户id 查询 用户科室列表
     *
     * @param userId 用户id
     * @return 用户科室列表
     */
    List<UserDept> findAllByUserId(Long userId);
}
