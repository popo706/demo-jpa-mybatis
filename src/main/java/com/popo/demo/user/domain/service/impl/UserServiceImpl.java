package com.popo.demo.user.domain.service.impl;

import com.popo.demo.user.domain.mapper.IUserDao;
import com.popo.demo.user.domain.model.User;
import com.popo.demo.user.domain.model.UserDept;
import com.popo.demo.user.domain.model.UserInfo;
import com.popo.demo.user.domain.repository.UserDeptRepository;
import com.popo.demo.user.domain.repository.UserRepository;
import com.popo.demo.user.domain.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final UserDeptRepository userDeptRepository;
    private final IUserDao iUserDao;

    @Override
    @Transactional
    public Long addUser(User user) {
        userRepository.save(user);
        return user.getId();
    }

    @Override
    public void test() {
        Long userId = addUser(new User("张三", "18800000000", System.currentTimeMillis()));
        if (userId == null) {
            log.error("用户新增失败");
        }

        //add userDept
        List<UserDept> userDepts = new ArrayList<>();
        userDepts.add(new UserDept("科室A", userId));
        userDepts.add(new UserDept("科室B", userId));
        userDeptRepository.saveAll(userDepts);

        //user
        User jpaUser = userRepository.findOneById(userId);
        log.info("japUser:{}", jpaUser);
        User mapperUser = iUserDao.findOne(userId);
        log.info("mapperUser:{}", mapperUser);

        //userInfo
        UserInfo jpaUserInfo = new UserInfo(jpaUser, userDepts);
        log.info("jpaUserInfo:{}", jpaUserInfo);

        UserInfo mapperUserInfo = iUserDao.findUserInfo(userId);
        log.info("mapperUserInfo:{}", mapperUserInfo);
    }
}
