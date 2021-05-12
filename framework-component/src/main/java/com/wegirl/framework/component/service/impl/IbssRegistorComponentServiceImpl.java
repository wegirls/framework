package com.wegirl.framework.component.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.conditions.query.LambdaQueryChainWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wegirl.framework.component.service.IIbssRegistorComponentService;
import com.wegirl.framework.dao.entity.IbssRegistor;
import com.wegirl.framework.dao.mapper.IbssRegistorMapper;
import com.wegirl.framework.share.dto.IbssRegistorDto;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.stream.Stream;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author rui.zhou
 * @since 2021-05-11
 */
@Service
public class IbssRegistorComponentServiceImpl extends ServiceImpl<IbssRegistorMapper, IbssRegistor> implements IIbssRegistorComponentService {

    @Resource
    private IbssRegistorMapper ibssRegistorMapper;

    @Override
    public IbssRegistor selectOne(IbssRegistorDto ibssRegistorDto) {
        LambdaQueryChainWrapper<IbssRegistor> lambdaQueryChainWrapper = new LambdaQueryChainWrapper(ibssRegistorMapper);
        final Stream<IbssRegistor> limit = lambdaQueryChainWrapper
                .eq(IbssRegistor::getContno, ibssRegistorDto.getContno()).or()
                .eq(IbssRegistor::getCustomerno, ibssRegistorDto.getCustomerno()).or()
                .eq(IbssRegistor::getName, ibssRegistorDto.getName()).or()
                .eq(IbssRegistor::getRole, ibssRegistorDto.getRole()).list().stream().limit(1);
        return limit.findFirst().get();
    }
}
