package com.wegirl.framework.share.request;

import lombok.Data;

/**
 * @author rui.zhou
 * @date 2021/05/07 17:19
 **/
@Data
public class UserRequest {

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
