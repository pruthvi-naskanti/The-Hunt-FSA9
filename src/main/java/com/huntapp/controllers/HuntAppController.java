package com.huntapp.controllers;

import com.huntapp.models.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.huntapp.repository.LocationRepository;

@Controller
public class HuntAppController {

	ModelAndView mav = new ModelAndView();
	//@Autowired
	//LocationRepository locrepo;
	
	@RequestMapping("/huntapp")
	public ModelAndView SelectColor() {
		mav.setViewName("index");
		return mav;
	}
	
	@RequestMapping("/addloc")
	public ModelAndView AddLocation() {
		mav.setViewName("addlocation");
		//Iterable<AddLocation> Loc=locrepo.findAll();
		//mav.addObject("Loc",Loc);
		return mav;
	}
	
	@RequestMapping("/LocationAdded")
	public ModelAndView LocationAdded() {
		mav.setViewName("index");
		return mav;
	}
	
	@RequestMapping("back")
	public ModelAndView back() {
		mav.setViewName("index");
		return mav;
	}
	
}
