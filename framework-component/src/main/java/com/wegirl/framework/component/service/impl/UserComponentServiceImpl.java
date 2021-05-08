package com.wegirl.framework.component.service.impl;

import com.baomidou.mybatisplus.extension.conditions.query.LambdaQueryChainWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wegirl.framework.component.service.IUserComponentService;
import com.wegirl.framework.dao.entity.User;
import com.wegirl.framework.dao.mapper.UserMapper;
import org.springframework.stereotype.Service;

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


    private UserMapper userMapper;

    public String test(){
        final List<User> list = new LambdaQueryChainWrapper<>(userMapper).eq(User::getName, "").list();
        return null;
    }

}
