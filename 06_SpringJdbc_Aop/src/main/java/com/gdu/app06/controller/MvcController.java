package com.gdu.app06.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MvcController {
	@GetMapping("/")
	public String Welcome() {
		return "index";
	}

}
