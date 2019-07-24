package com.popo.demo.user.domain.repository;

import com.popo.demo.user.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 用户仓储层
 */
public interface UserRepository extends JpaRepository<User, Long> {

    /**
     * 根据 用户id 查询 用户信息
     *
     * @param userId 用户id
     * @return 用户信息
     */
    User findOneById(Long userId);
}
