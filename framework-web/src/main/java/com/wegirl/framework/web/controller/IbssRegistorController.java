package com.wegirl.framework.web.controller;

import com.wegirl.framework.common.ResponseData;
import com.wegirl.framework.share.dto.IbssRegistorDto;
import com.wegirl.framework.share.service.IIbssRegistorShareController;
import com.wegirl.framework.web.service.impl.IbssRegistorServiceImpl;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author rui.zhou
 * @since 2021-05-11
 */
@Api(tags = "ibss-registor相关接口")
@RestController
@RequestMapping("/framework/ibss-registor")
public class IbssRegistorController implements IIbssRegistorShareController {

    @Resource
    private IbssRegistorServiceImpl ibssRegistorServiceImpl;

    @Override
    public ResponseData<IbssRegistorDto> queryIbssRegistor(@RequestBody IbssRegistorDto ibssRegistorDto) {
        return ibssRegistorServiceImpl.queryIbssRegistor(ibssRegistorDto);
    }
}

