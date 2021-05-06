package com.wegirl.framework.web.controller;

import com.wegirl.framework.share.service.ITestShareService;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author rui.zhou
 * @date 2021/05/06 15:46
 **/
@RestController
public class TestController implements ITestShareService {

    @Override
    public String test() {
        // component
        return "this is a test controller.";
    }
}
