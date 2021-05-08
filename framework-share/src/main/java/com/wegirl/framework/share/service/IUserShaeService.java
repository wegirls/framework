package com.wegirl.framework.share.service;

import com.wegirl.framework.share.request.UserRequest;
import com.wegirl.framework.share.response.UserResponse;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * @author rui.zhou
 * @date 2021/05/07 17:12
 **/
public interface IUserShaeService {

    /**
     * ID查询用户
     * @param id
     * @return
     */
    @ApiOperation("查询用户接口1")
    @ApiImplicitParam(name = "id", value = "用户id", defaultValue = "1", required = true)
    @RequestMapping(value = "/queryUserById", method = RequestMethod.GET)
    UserResponse queryUser(Long id);

    /**
     * 查询用户
     * @param userRequest
     * @return
     */
    @ApiOperation("查询用户接口2")
    @RequestMapping(value = "/queryUser", method = RequestMethod.POST)
    UserResponse queryUser(UserRequest userRequest);

    /**
     * 查询所有用户
     * @return
     */
    @ApiOperation("查询用户接口3")
    @RequestMapping(value = "/queryAllUser", method = RequestMethod.GET)
    List<UserResponse> queryAllUser();
}
