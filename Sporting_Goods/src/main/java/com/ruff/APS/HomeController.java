package com.ruff.APS;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class HomeController {
	
	@RequestMapping("/home")
	public String showHomePage() {
		
		System.out.println("Page was refreshed");
		return "home";

}
}
