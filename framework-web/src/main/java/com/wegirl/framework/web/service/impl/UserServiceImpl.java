package com.wegirl.framework.web.service.impl;

import com.wegirl.framework.component.service.impl.UserComponentServiceImpl;
import com.wegirl.framework.dao.entity.User;
import com.wegirl.framework.share.request.UserRequest;
import com.wegirl.framework.share.response.UserResponse;
import com.wegirl.framework.web.service.IUserService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import java.util.Optional;
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
        Optional<User> optional = Optional.ofNullable(userComponentServiceImpl.getById(id));
        if (!optional.isPresent()) {
            return new UserResponse();
        }
        UserResponse userResponse = new UserResponse();
        userResponse.setId(optional.get().getId());
        userResponse.setName(optional.get().getName());
        userResponse.setAge(optional.get().getAge());
        userResponse.setEmail(optional.get().getEmail());
        return userResponse;
    }

    @Override
    public List<UserResponse> queryAllUser() {
        final List<User> userList = userComponentServiceImpl.list();
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

    @Override
    public UserResponse queryUser(UserRequest userRequest) {
        User user = userComponentServiceImpl.selectOne(userRequest);
        if (user == null) {
            return new UserResponse();
        }
        UserResponse userResponse = new UserResponse();
        userResponse.setId(user.getId());
        userResponse.setName(user.getName());
        userResponse.setAge(user.getAge());
        userResponse.setEmail(user.getEmail());
        return userResponse;
    }
}
