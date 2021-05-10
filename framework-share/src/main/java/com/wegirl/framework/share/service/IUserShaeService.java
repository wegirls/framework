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
    @ApiOperation("查询用户通过ID")
    @ApiImplicitParam(name = "id", value = "用户id", defaultValue = "1", required = true)
    @RequestMapping(value = "/queryUserById", method = RequestMethod.GET)
    UserResponse queryUserById(Long id);

    /**
     * 查询所有用户
     * @return
     */
    @ApiOperation("查询所有用户")
    @RequestMapping(value = "/queryAllUser", method = RequestMethod.GET)
    List<UserResponse> queryAllUser();

    /**
     * 查询用户通过任意参数
     * @param userRequest
     * @return
     */
    @ApiOperation("查询用户通过任意参数")
    @RequestMapping(value = "/queryUser", method = RequestMethod.POST)
    UserResponse queryUser(UserRequest userRequest);
}
