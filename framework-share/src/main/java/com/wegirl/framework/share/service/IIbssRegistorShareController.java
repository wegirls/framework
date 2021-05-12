package com.wegirl.framework.share.service;

import com.wegirl.framework.common.ResponseData;
import com.wegirl.framework.share.dto.IbssRegistorDto;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author rui.zhou
 * @date 2021/05/11 10:52
 **/
public interface IIbssRegistorShareController {

    /**
     * 通过任意参数查询
     * @param ibssRegistorDto
     * @return
     */
    @ApiOperation("通过任意参数查询")
    @RequestMapping(value = "/queryIbssRegistor",method = RequestMethod.POST)
    ResponseData<IbssRegistorDto> queryIbssRegistor(IbssRegistorDto ibssRegistorDto);


}
