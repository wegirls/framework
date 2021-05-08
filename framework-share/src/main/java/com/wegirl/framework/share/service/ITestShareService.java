package com.wegirl.framework.share.service;

import com.wegirl.framework.share.request.TestRequest;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author rui.zhou
 * @date 2021/05/06 15:51
 **/
public interface ITestShareService{

    /**
     * this is a test function
     * @param name
     * @return
     */
    @ApiOperation("测试的接口1")
    @ApiImplicitParam(name = "name", value = "测试请求对象", defaultValue = "XXX", required = true)
    @RequestMapping(value = "/test",method = RequestMethod.GET)
    String test(String name);

    /**
     * this is a test2 function
     * @param testRequest
     * @return
     */
    @ApiOperation("测试的接口2")
    @RequestMapping(value = "/test2",method = RequestMethod.POST)
    String test2(TestRequest testRequest);
}
