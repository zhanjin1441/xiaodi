package net.xdclass.xdvideo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.xdclass.xdvideo.config.WeChatConfig;

@RestController
public class VideoController2 {
	@RequestMapping("next")
	public String next(){
		
		return "hello xdclass.net"+"i believe myself";
	}
}
