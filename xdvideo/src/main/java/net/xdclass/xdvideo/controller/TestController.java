package net.xdclass.xdvideo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.xdclass.xdvideo.config.WeChatConfig;

@RestController
public class TestController {
	@RequestMapping("test01")
	public String test(){
		
		return "hello xdclass.net";
	}
	
	@Autowired
	WeChatConfig weChatConfig;
	
	@RequestMapping("test_config")
	public String test01(){
		
		return weChatConfig.getAppId();
	}
	
	
}
