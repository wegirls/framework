package com.wegirl.framework.web.service.impl;

import com.wegirl.framework.common.CommonMessageCode;
import com.wegirl.framework.common.ResponseData;
import com.wegirl.framework.component.service.impl.IbssRegistorComponentServiceImpl;
import com.wegirl.framework.dao.entity.IbssRegistor;
import com.wegirl.framework.share.dto.IbssRegistorDto;
import com.wegirl.framework.web.service.IbssRegistorService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author rui.zhou
 * @date 2021/05/11 11:04
 **/
@Service
public class IbssRegistorServiceImpl implements IbssRegistorService {

    @Resource
    private IbssRegistorComponentServiceImpl ibssRegistorComponentServiceImpl;

    @Override
    public ResponseData<IbssRegistorDto> queryIbssRegistor(IbssRegistorDto ibssRegistorDto) {

        final IbssRegistor ibssRegistor = ibssRegistorComponentServiceImpl.selectOne(ibssRegistorDto);
        if (ibssRegistor == null) {
            return new ResponseData<>(CommonMessageCode.SUCCESS, new IbssRegistorDto());
        }
        ibssRegistorDto.setContno(ibssRegistor.getContno());
        ibssRegistorDto.setCustomerno(ibssRegistor.getCustomerno());
        ibssRegistorDto.setName(ibssRegistor.getName());
        ibssRegistorDto.setRole(ibssRegistor.getRole());

        return new ResponseData<>(CommonMessageCode.SUCCESS, ibssRegistorDto);
    }
}
