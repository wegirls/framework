package com.wegirl.framework.web.controller;

import com.wegirl.framework.share.request.UserRequest;
import com.wegirl.framework.share.response.UserResponse;
import com.wegirl.framework.share.service.IUserShaeService;
import com.wegirl.framework.web.service.impl.UserServiceImpl;
import io.swagger.annotations.Api;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author rui.zhou
 * @since 2021-05-07
 */
@Api(tags = "用户管理相关接口")
@RestController
@RequestMapping("/framework/user")
public class UserController implements IUserShaeService {

    @Resource
    private UserServiceImpl userServiceImpl;

    @Override
    public UserResponse queryUserById(Long id) {
        return userServiceImpl.queryUserById(id);
    }

    @Override
    public List<UserResponse> queryAllUser() {
        return userServiceImpl.queryAllUser();
    }

    @Override
    public UserResponse queryUser(UserRequest userRequest) {// @RequestBody @Validated
        return userServiceImpl.queryUser(userRequest);
    }

}

