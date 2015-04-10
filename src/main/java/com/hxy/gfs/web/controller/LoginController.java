package com.hxy.gfs.web.controller;

import java.text.SimpleDateFormat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Validator;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.hxy.gfs.web.model.SessionContext;
import com.hxy.gfs.web.model.container.LoginForm;
import com.hxy.gfs.web.service.LoginService;

@Controller
@RequestMapping("login")
public class LoginController
{
    @Autowired
    private LoginService loginService;
    
    @Autowired
    private Validator validator;

    @RequestMapping(value="", method = RequestMethod.GET)
    public ModelAndView toUserLoginPage()
    {
        return new ModelAndView("user_login");
    }

    @RequestMapping(value="", method = RequestMethod.POST)
    public ModelAndView userLogin(LoginForm loginForm, BindingResult result, ModelMap model)
    {
        if (loginForm != null)
        {
            validator.validate(loginForm, result);
            
            if (result.hasErrors())
            {
                model.addAttribute("objectErrorList", result.getAllErrors());
                return new ModelAndView("user_login");
            }

            try
            {
                SessionContext sessionContext = loginService.loginUser(loginForm);

                if (sessionContext != null)
                {
                    model.addAttribute("message", "欢迎您：" + sessionContext.getUserName());
                    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy年MM月dd日");
                    model.addAttribute("date", dateFormat.format(new java.util.Date()));
                    return new ModelAndView("hello");
                }
            } catch (Exception e)
            {
                model.addAttribute("error_message", e.getMessage());
                return new ModelAndView("error");
            }
        }

        model.addAttribute("error_message", "服务端未接受到到提交的信息");
        return new ModelAndView("error");
    }
}
