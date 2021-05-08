package com.wegirl.framework.dao.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 测试信息
 * </p>
 *
 * @author rui.zhou
 * @since 2021-05-07
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("test")
@ApiModel(value="Test对象", description="测试信息")
public class Test extends Model<Test> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty(value = "用户名")
    @TableField("user_name")
    private String userName;

    @ApiModelProperty(value = "密码")
    @TableField("pass_word")
    private String passWord;


    @Override
    protected Serializable pkVal() {
        return null;
    }

}
