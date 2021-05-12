package com.wegirl.framework.web.struct.mapper;

import com.wegirl.framework.dao.entity.User;
import com.wegirl.framework.share.response.UserResponse;
import lombok.Data;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * @author rui.zhou
 * @date 2021/05/11 15:43
 **/
@Mapper
public interface UserMapper {

    UserMapper INSTANCE = Mappers.getMapper( UserMapper.class );

    /**
     * User类型转换成UserResponse类型
     * @param user
     * @return
     */
    UserResponse userToUserResponse(User user);
}
