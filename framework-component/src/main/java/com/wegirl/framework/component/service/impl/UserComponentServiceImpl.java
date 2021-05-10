package com.wegirl.framework.component.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.conditions.query.LambdaQueryChainWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wegirl.framework.component.service.IUserComponentService;
import com.wegirl.framework.dao.entity.User;
import com.wegirl.framework.dao.mapper.UserMapper;
import com.wegirl.framework.share.request.UserRequest;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author rui.zhou
 * @since 2021-05-07
 */
@Service
public class UserComponentServiceImpl extends ServiceImpl<UserMapper, User> implements IUserComponentService {

    @Resource
    private UserMapper userMapper;

    public String test(){
        final List<User> list = new LambdaQueryChainWrapper<>(userMapper).eq(User::getName, "").list();
        return null;
    }

    @Override
    public User selectOne(UserRequest userRequest) {
        LambdaQueryWrapper<User> lambdaQueryWrapper = new LambdaQueryWrapper<>();
        lambdaQueryWrapper
                .eq(User::getId, userRequest.getId()).or()
                .eq(User::getName, userRequest.getName()).or()
                .eq(User::getAge, userRequest.getAge()).or()
                .eq(User::getEmail, userRequest.getEmail());
        User user = userMapper.selectOne(lambdaQueryWrapper);
        return user;
    }
}
