package com.wegirl.framework.web.service;

import com.wegirl.framework.common.ResponseData;
import com.wegirl.framework.dao.entity.User;
import com.wegirl.framework.share.request.UserRequest;
import com.wegirl.framework.share.response.UserResponse;

import java.util.List;

/**
 * @author rui.zhou
 * @date 2021/05/07 17:27
 **/
public interface IUserService {
    /**
     * id查用户
     * @param id
     * @return
     */
    ResponseData<UserResponse> queryUserById(Long id);

    /**
     * 查所有用户
     * @return
     */
    ResponseData<List<UserResponse>> queryAllUser();

    /**
     * 查询用户通过任意参数
     * @param userRequest
     * @return
     */
    ResponseData<UserResponse> queryUser(UserRequest userRequest);
}
