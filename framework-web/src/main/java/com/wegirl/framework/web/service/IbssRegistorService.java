package com.wegirl.framework.web.service;

import com.wegirl.framework.common.ResponseData;
import com.wegirl.framework.share.dto.IbssRegistorDto;

/**
 * @author rui.zhou
 * @date 2021/05/11 11:05
 **/
public interface IbssRegistorService {
    /**
     * queryIbssRegistor
     * @param ibssRegistorDto
     * @return
     */
    ResponseData<IbssRegistorDto> queryIbssRegistor(IbssRegistorDto ibssRegistorDto);
}
