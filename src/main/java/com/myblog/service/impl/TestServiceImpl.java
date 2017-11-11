package com.myblog.service.impl;

import com.myblog.service.ITestService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements ITestService {
    private Logger logger = LoggerFactory.getLogger(this.getClass().getName());
    @Override
    public String test() {
        String a = "number1";
        logger.debug("this is debug {}",a);
        logger.info("this is info {}",a);
        return "index";
    }
}
