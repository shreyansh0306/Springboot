package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WebController {
	
	@RequestMapping("web")
	public ModelAndView web(@RequestParam("urlname") String name) {
		
		ModelAndView mv = new ModelAndView();
		System.out.println(name);
		mv.addObject("name", name);
		mv.setViewName("web");
		return mv;
	}
	
}
