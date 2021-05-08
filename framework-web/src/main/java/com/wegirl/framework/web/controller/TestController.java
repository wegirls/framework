package com.wegirl.framework.web.controller;

import com.baomidou.mybatisplus.core.toolkit.Assert;
import com.wegirl.framework.share.request.TestRequest;
import com.wegirl.framework.share.service.ITestShareService;
import com.wegirl.framework.web.service.impl.TestServiceImpl;
import io.swagger.annotations.Api;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;

/**
 * @author rui.zhou
 * @date 2021/05/06 15:46
 **/
@Api(tags = "测试相关接口")
@RestController
public class TestController implements ITestShareService {

    @Resource
    private TestServiceImpl testServiceImpl;

    @Override
    public String test(String name) {
        // component
        Assert.notEmpty(name, "error: can not execute. because can not find name!", new Object[0]);
        testServiceImpl.test();
        return "this is a test controller name is " + name;
    }

    @Override
    public String test2(@RequestBody @Validated TestRequest testRequest) {
        testRequest = new TestRequest();
        Assert.notNull(testRequest, "error: can not execute. because can not find cache of TableInfo for entity!", new Object[0]);
        testServiceImpl.test();
        return "this is a test2 controller.";
    }

}
