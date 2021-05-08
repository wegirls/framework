package com.wegirl.framework.share.request;

import lombok.Data;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

/**
 * @author rui.zhou
 * @date 2021/05/07 11:18
 **/
@Data
public class TestRequest {

    /**
     * title
     */
    private String title;

    /**
     * name
     */
    @NotBlank(message="name cannot be empty")
    private String name;

    /**
     * password
     */
    @Size(message = "password length cannot be greater than 6 and cannot be less than 1",min = 1, max = 6)
    private String password;

    /**
     * age
     */
    @NotNull(message="age cannot be null")
    private Integer age;

    /**
     * list
     */
    @NotEmpty(message="list cannot be empty")
    private List list;

}
