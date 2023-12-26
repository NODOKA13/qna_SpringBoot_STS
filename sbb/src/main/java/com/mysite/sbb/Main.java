package com.mysite.sbb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Main {

	@GetMapping("/")
	public String mainPage() {
		return "redirect:/question/list";
	}
	
	@GetMapping("/dummy")
	public String dummy() {
		return "mainPage";
	}
}
