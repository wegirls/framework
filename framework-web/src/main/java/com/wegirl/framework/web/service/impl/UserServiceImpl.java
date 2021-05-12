package com.wegirl.framework.web.service.impl;

import com.wegirl.framework.common.CommonMessageCode;
import com.wegirl.framework.common.ResponseData;
import com.wegirl.framework.component.service.impl.UserComponentServiceImpl;
import com.wegirl.framework.dao.entity.User;
import com.wegirl.framework.share.request.UserRequest;
import com.wegirl.framework.share.response.UserResponse;
import com.wegirl.framework.web.service.IUserService;
import com.wegirl.framework.web.struct.mapper.UserMapper;
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
    public ResponseData<UserResponse> queryUserById(Long id) {
        Optional<User> optional = Optional.ofNullable(userComponentServiceImpl.getById(id));
        if (!optional.isPresent()) {
            return new ResponseData(CommonMessageCode.SUCCESS,new UserResponse());
        }
        return new ResponseData(CommonMessageCode.SUCCESS,UserMapper.INSTANCE.userToUserResponse(optional.get()));
    }

    @Override
    public ResponseData<List<UserResponse>> queryAllUser() {
        final List<User> userList = userComponentServiceImpl.list();
        final Stream<UserResponse> userResponseStream = userList.stream().map(user -> {
            final UserResponse userResponse = new UserResponse();
            userResponse.setId(user.getId());
            userResponse.setName(user.getName());
            userResponse.setAge(user.getAge());
            userResponse.setEmail(user.getEmail());
            return userResponse;
        });
        return new ResponseData(CommonMessageCode.SUCCESS,userResponseStream.collect(Collectors.toList()));
    }

    @Override
    public ResponseData<UserResponse> queryUser(UserRequest userRequest) {
        User user = userComponentServiceImpl.selectOne(userRequest);
        if (user == null) {
            return new ResponseData(CommonMessageCode.SUCCESS,new UserResponse());
        }
        return new ResponseData(CommonMessageCode.SUCCESS, UserMapper.INSTANCE.userToUserResponse(user));
    }
}
