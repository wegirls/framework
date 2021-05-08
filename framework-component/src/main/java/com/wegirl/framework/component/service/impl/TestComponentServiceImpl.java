package com.wegirl.framework.component.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wegirl.framework.component.service.ITestComponentService;
import com.wegirl.framework.dao.entity.Test;
import com.wegirl.framework.dao.mapper.TestMapper;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 测试信息 服务实现类
 * </p>
 *
 * @author rui.zhou
 * @since 2021-05-07
 */
@Service
public class TestComponentServiceImpl extends ServiceImpl<TestMapper, Test> implements ITestComponentService {


}
