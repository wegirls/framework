package com.wegirl.framework.component.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wegirl.framework.dao.entity.User;
import com.wegirl.framework.share.request.UserRequest;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author rui.zhou
 * @since 2021-05-07
 */
public interface IUserComponentService extends IService<User> {

    /**
     * selectOne
     * @param userRequest
     * @return
     */
    User selectOne(UserRequest userRequest);
}
