package com.wegirl.framework.web.controller;

import com.wegirl.framework.common.ResponseData;
import com.wegirl.framework.share.request.UserRequest;
import com.wegirl.framework.share.response.UserResponse;
import com.wegirl.framework.share.service.IUserShareController;
import com.wegirl.framework.web.service.impl.UserServiceImpl;
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
@RestController
@RequestMapping("/framework/user")
public class UserController implements IUserShareController {

    @Resource
    private UserServiceImpl userServiceImpl;

    @Override
    public ResponseData<UserResponse> queryUserById(Long id) {
        return userServiceImpl.queryUserById(id);
    }

    @Override
    public ResponseData<List<UserResponse>> queryAllUser() {
        return userServiceImpl.queryAllUser();
    }

    @Override
    public ResponseData<UserResponse> queryUser(@RequestBody @Validated UserRequest userRequest) {
        return userServiceImpl.queryUser(userRequest);
    }

}

