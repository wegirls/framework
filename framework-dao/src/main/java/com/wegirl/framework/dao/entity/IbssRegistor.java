package com.wegirl.framework.dao.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 
 * </p>
 *
 * @author rui.zhou
 * @since 2021-05-11
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("T_IBSS_REGISTOR")
@ApiModel(value="IbssRegistor对象", description="")
public class IbssRegistor extends Model<IbssRegistor> {

    private static final long serialVersionUID = 1L;

    @TableField("CUSTOMERNO")
    private String customerno;

    @TableField("CONTNO")
    private String contno;

    @TableField("ROLE")
    private String role;

    @TableField("NAME")
    private String name;

    @TableField("CREATE_TIME")
    private Date createTime;

    @TableField("OBSOLETE_FLAG")
    private String obsoleteFlag;


    @Override
    protected Serializable pkVal() {
        return null;
    }

}
