package com.yangyang.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class HelloServiceImpl implements HelloService{
    @Autowired
    Config config;
    private static Logger logger = LoggerFactory.getLogger(HelloServiceImpl.class);

    @Override
    public Map<String, Object> hello(String name) {
        logger.info(name+" is querying.");
        Map<String, Object> ret = new HashMap<>();
        ret.put("name", name);
        ret.put("greeting", config.get("greeting")+name);
        return ret;
    }
}
