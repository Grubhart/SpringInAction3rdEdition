package org.grubhart.spitter.controller;

import org.grubhart.spitter.service.SpitterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
public class HomeController {

    public static final int SPITTER_PER_PAGE =25;

    private SpitterService spitterService;

    @Autowired
    public HomeController(SpitterService spitterService) {
        this.spitterService = spitterService;

    }

    @RequestMapping({"/","/home"})
    public String showHomePage(Map<String, Object> model){
        model.put("spittles",spitterService.getRecentSpittles(SPITTER_PER_PAGE));
        return "home";
    }


}
