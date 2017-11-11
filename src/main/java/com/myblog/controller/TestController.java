package com.myblog.controller;

import com.myblog.service.ITestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author serenity
 */
@Controller
public class TestController {
    @Autowired
    private ITestService iTestService;

    @RequestMapping(value = "test", method = RequestMethod.GET)
    public String test() {
        return "index";
    }

    @RequestMapping(value = "springtest", method = RequestMethod.GET)
    public String springTest() {
        return iTestService.test();
    }
}
