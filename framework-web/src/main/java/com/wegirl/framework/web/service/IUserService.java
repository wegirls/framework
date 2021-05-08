package com.wegirl.framework.web.service;

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
    UserResponse queryUserById(Long id);

    /**
     * 查用户
     * @param userRequest
     * @return
     */
    UserResponse queryUser(UserRequest userRequest);

    /**
     * 查所有用户
     * @return
     */
    List<UserResponse> queryAllUser();
}
