/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.HuntApp.Controllers;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.HuntApp.Models.Location;
import com.example.HuntApp.Repository.LocationRepository;

/**
 *
 * @author VenkataYashwanth Damera
 */
@Controller
public class HuntController {

    ModelAndView mv = new ModelAndView();

    @Autowired
    LocationRepository LoRepo;

    @RequestMapping("")
    public ModelAndView home() {
        mv.setViewName("index");
        return mv;
    }

    @RequestMapping("home")
    public ModelAndView home1() {
        mv.setViewName("index");
        return mv;
    }


    @RequestMapping("LocationAdded")
    public ModelAndView addNewGenre(Location gn) {
        LoRepo.save(gn);
        mv.setViewName("index");
        return mv;
    }

    @RequestMapping("addloc")
    public ModelAndView addGenreType() {
        mv.setViewName("addNewLocation.html");
        return mv;
    }



    @RequestMapping("location")
    public ModelAndView viewMovies() {
    	mv.setViewName("viewLocation.html");
        Iterable<Location> LocList = LoRepo.findAll();
        mv.addObject("LocList", LocList);
        return mv;
    }


    @RequestMapping("cancel")
    public ModelAndView cancel() {
        mv.setViewName("index");
        return mv;
    }

    @RequestMapping("search")
    public ModelAndView searchById(int id) {
        //Movie MovieFound = MovieRepo.findById(id).orElse(new Movie());
       // mv.addObject(MovieFound);
        mv.setViewName("searchresult.html");
        return mv;
    }
    
    @RequestMapping("editlocation")
    public ModelAndView editMovie(Location loc) {
        LoRepo.save(loc);
        mv.setViewName("editlocation.html");
        return mv;
    }

    @RequestMapping("deletelocation")
    public ModelAndView deleteMovie(Location loc) {
        Optional<Location> locFound = LoRepo.findById(loc.getLocation_id());
        if (locFound.isPresent()) {
            LoRepo.delete(loc);
        }
        
        return home();
    }
    
    @RequestMapping("yashwanth")
    public ModelAndView yashwanth() {
    	mv.setViewName("yashwanth.html");
    	return mv;
    }
    
    @RequestMapping("pruthvi")
    public ModelAndView pruthvi() {
    	mv.setViewName("pruthvi.html");
    	return mv;
    }
}
