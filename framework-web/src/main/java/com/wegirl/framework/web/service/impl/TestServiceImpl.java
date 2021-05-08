package com.wegirl.framework.web.service.impl;

import com.wegirl.framework.component.service.impl.TestComponentServiceImpl;
import com.wegirl.framework.dao.entity.Test;
import com.wegirl.framework.web.service.ITestService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author rui.zhou
 * @date 2021/05/07 09:24
 **/
@Slf4j
@Service
public class TestServiceImpl implements ITestService {

    @Resource
    private TestComponentServiceImpl testComponentServiceImpl;

    @Override
    public String test() {
        final List<Test> list = testComponentServiceImpl.list();
        log.info("list | {}", list);
        return null;
    }
}
