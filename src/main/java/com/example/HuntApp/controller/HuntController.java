package com.example.huntapp.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.example.huntapp.repository.LocationRepository;

@Controller
public class HuntController {

	@Resource
	private LocationRepository locationRepository;

	ModelAndView mv = new ModelAndView();
	

	@RequestMapping("/yashwanth")
	@ResponseBody
	public ModelAndView yashwanth() {
		mv.setViewName("yashwanth");
		return mv;
	}
	
	@RequestMapping("/")
	@ResponseBody
	public ModelAndView home() {
		System.out.println("Entering Home");
		mv.setViewName("index");
		return mv;
	}
	
	@RequestMapping("/pruthvi")
	@ResponseBody
	public ModelAndView pruthvi() {
		mv.setViewName("pruthvi");
		return mv;
	}

	@GetMapping
	public String huntDemo() {
		return "serviceUp";
	}
	
	@RequestMapping("cancel")
	public ModelAndView back() {
		mv.setViewName("index");
		return mv;
	}

	@RequestMapping("/location/edit/cancel")
	public ModelAndView back1() {
		mv.setViewName("index");
		return mv;
	}
}
