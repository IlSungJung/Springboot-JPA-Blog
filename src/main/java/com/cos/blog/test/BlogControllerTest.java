package com.cos.blog.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //스프링이 com.cos.blog 패키지 이하를 스캔해서 모든 파일을 메모리에 new 하는것은 아니구요.
public class BlogControllerTest {
	
	@GetMapping("test/hello")
	public String hello() {
		return "<h1>hello spring boot.</h1>";
	}
}
