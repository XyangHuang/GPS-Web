package com.hxy.gfs.web.controller;

import java.text.SimpleDateFormat;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("hello")
public class HelloController {
    
    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView printWelcome(ModelMap model) {
        model.addAttribute("message", "Spring3 MVC 例子");
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy年MM月dd日");
        model.addAttribute("date", dateFormat.format(new java.util.Date()));
        return new ModelAndView("hello");
    }
}