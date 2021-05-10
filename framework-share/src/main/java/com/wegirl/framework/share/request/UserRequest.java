package com.wegirl.framework.share.request;

import lombok.Data;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

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
    @NotBlank(message="name cannot be empty")
    private String name;

    /**
     * 年龄
     */
    @NotNull(message="age cannot be null")
    private Integer age;

    /**
     * 邮箱
     */
    @Pattern(message = "email format is incorrect", regexp = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$")
    private String email;

}
