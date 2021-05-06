package com.wegirl.framework.share.service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author rui.zhou
 * @date 2021/05/06 15:51
 **/
public interface ITestShareService{

    /**
     * this is a test function
     * @return
     */
    @RequestMapping(value = "/test",method = RequestMethod.GET)
    String test();
}
