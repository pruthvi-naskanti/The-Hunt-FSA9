package com.example.huntapp.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.example.huntapp.entity.Location;
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
		mv.setViewName("index");
		List<Location> locationsList = (List<Location>) locationRepository.findAll();
		List<Long> idList = new ArrayList<Long>();
		for (Location l : locationsList) {
			idList.add(l.getId());
		}
		Random random = new Random();
		int rand = random.nextInt(locationsList.size());
		Location randomLocation = locationsList.get(rand);
		mv.addObject("location", randomLocation);
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
		List<Location> locationsList = (List<Location>) locationRepository.findAll();
		List<Long> idList = new ArrayList<Long>();
		for (Location l : locationsList) {
			idList.add(l.getId());
		}
		Random random = new Random();
		int rand = random.nextInt(locationsList.size());
		Location randomLocation = locationsList.get(rand);
		mv.addObject("location", randomLocation);
		return mv;
	}

	@RequestMapping("/location/edit/cancel")
	public ModelAndView back1() {
		mv.setViewName("index");
		return mv;
	}
}
