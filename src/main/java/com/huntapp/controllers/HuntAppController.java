package com.huntapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HuntAppController {

	@RequestMapping("/huntapp")
	public ModelAndView selectColor() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("msg","Welcome to hunt app");
		mav.setViewName("index");
		return mav;
	}
	
}
