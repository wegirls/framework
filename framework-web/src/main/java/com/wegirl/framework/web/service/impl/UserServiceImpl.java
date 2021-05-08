package com.wegirl.framework.web.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Assert;
import com.baomidou.mybatisplus.extension.conditions.query.LambdaQueryChainWrapper;
import com.wegirl.framework.component.service.impl.UserComponentServiceImpl;
import com.wegirl.framework.dao.entity.User;
import com.wegirl.framework.dao.mapper.UserMapper;
import com.wegirl.framework.share.request.UserRequest;
import com.wegirl.framework.share.response.UserResponse;
import com.wegirl.framework.web.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author rui.zhou
 * @date 2021/05/07 17:26
 **/
@Service
public class UserServiceImpl implements IUserService {

    @Resource
    private UserComponentServiceImpl userComponentServiceImpl;

    @Override
    public UserResponse queryUserById(Long id) {
        final UserResponse userResponse = new UserResponse();
        User user = userComponentServiceImpl.getById(id);
        if (user != null) {
            userResponse.setId(user.getId());
            userResponse.setName(user.getName());
            userResponse.setAge(user.getAge());
            userResponse.setEmail(user.getEmail());
        }
        return userResponse;
    }

    @Override
    public UserResponse queryUser(UserRequest userRequest) {
        final UserResponse userResponse = new UserResponse();
        LambdaQueryWrapper<User> lambdaQueryWrapper = new LambdaQueryWrapper<>();
        lambdaQueryWrapper.eq(User::getName,userRequest.getName());
        final User user = userComponentServiceImpl.getOne(lambdaQueryWrapper);
        if (user != null) {
            userResponse.setId(user.getId());
            userResponse.setName(user.getName());
            userResponse.setAge(user.getAge());
            userResponse.setEmail(user.getEmail());
        }
        return userResponse;
    }

    @Override
    public List<UserResponse> queryAllUser() {
        final List<User> userList = userComponentServiceImpl.list();
        //userList.stream().filter().collect(Collectors.toList());
        final Stream<UserResponse> userResponseStream = userList.stream().map(user -> {
            final UserResponse userResponse = new UserResponse();
            userResponse.setId(user.getId());
            userResponse.setName(user.getName());
            userResponse.setAge(user.getAge());
            userResponse.setEmail(user.getEmail());
            return userResponse;
        });
        return userResponseStream.collect(Collectors.toList());
    }
}
