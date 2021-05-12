package com.wegirl.framework.component.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wegirl.framework.common.ResponseData;
import com.wegirl.framework.dao.entity.IbssRegistor;
import com.wegirl.framework.share.dto.IbssRegistorDto;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author rui.zhou
 * @since 2021-05-11
 */
public interface IIbssRegistorComponentService extends IService<IbssRegistor> {

    /**
     * selectOne
     * @param ibssRegistorDto
     * @return
     */
    IbssRegistor selectOne(IbssRegistorDto ibssRegistorDto);
}
