package com.hxy.gfs.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Validator;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("questionnaire")
public class QuestionnaireController
{
    @Autowired
    private Validator validator;

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView toUserLoginPage()
    {
        return new ModelAndView("questionnaire_manager");
    }
}
