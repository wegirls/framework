package com.wegirl.framework.share.response;

import lombok.Data;

/**
 * @author rui.zhou
 * @date 2021/05/07 17:14
 **/
@Data
public class UserResponse {

    /**
     * id
     */
    private Long id;

    /**
     * 名称
     */
    private String name;

    /**
     * 年龄
     */
    private Integer age;

    /**
     * 邮箱
     */
    private String email;
}
