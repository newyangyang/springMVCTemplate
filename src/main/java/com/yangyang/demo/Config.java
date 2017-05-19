package com.yangyang.demo;

import java.util.Properties;

import javax.annotation.Resource;
import org.springframework.stereotype.Component;

@Component("config")
public class Config {

	@Resource(name="myProperties")
	private Properties myProperties;

	String get(String key) {
		return myProperties.getProperty(key);
	}
}
