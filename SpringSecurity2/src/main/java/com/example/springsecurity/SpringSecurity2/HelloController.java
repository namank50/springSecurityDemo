package com.example.springsecurity.SpringSecurity2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@GetMapping("/")
	public String home() {
		return("<h1>Welcome</h1>");
	}
	@GetMapping("/user")
	public String user() {
		return("<h1>Hello User</h1>");
	}
	
	@GetMapping("/admin")
	public String admin() {
		return("<h1>Welcome Admin</h1>");
	}
}
