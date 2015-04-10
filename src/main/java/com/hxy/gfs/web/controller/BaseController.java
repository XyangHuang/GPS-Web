package com.hxy.gfs.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("")
public class BaseController {

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView toUserLoginPage() {
        return new ModelAndView("front_page");
    }
    
    @RequestMapping(value="front", method = RequestMethod.GET)
    public ModelAndView toFrontPage() {
        return new ModelAndView("front_page");
    }
}
