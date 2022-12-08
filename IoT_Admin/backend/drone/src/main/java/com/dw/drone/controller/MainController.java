package com.dw.drone.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/*
 * 프론트를 이클립스에서 관리하면 Controller ex) JSP
 * 프론트가 분리되어 있으면 RestController ex) React, Angular ...
 */

//페이지 호출할 때는 Rest (X) Controller (O)
@Controller
public class MainController {
	
	@GetMapping("/home")
	public String loadHomePage() {
		/*
		 * return 타입은 String
		 * html 페이지 이름을 리턴
		 */
		return "home";
	}
	
	@GetMapping("/")
	public String loadIndexPage() {
		return "index";
	}
	
	@GetMapping("/drone/detail/{uuid}")
	public String loadDetailPage(@PathVariable int uuid, ModelMap map) {
		System.out.println("uuid =>" + uuid);
		
		//ModelMap은 주소로 넘어오는 @PathVariable or @RequestParam 데이터를 View(HTML)에 전달한다.
		map.addAttribute("droneUUID", uuid);
		
		return "detail";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
