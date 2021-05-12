package com.wegirl.framework.share.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import java.util.Date;

/**
 * @author rui.zhou
 * @date 2021/05/11 10:54
 **/
@Data
public class IbssRegistorDto {

    private String customerno;

    private String contno;

    private String role;

    private String name;

    //private Date createTime;

    private String obsoleteFlag;

}
