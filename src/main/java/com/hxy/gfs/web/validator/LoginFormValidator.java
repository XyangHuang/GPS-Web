package com.hxy.gfs.web.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.hxy.gfs.web.model.container.LoginForm;
import com.hxy.gfs.web.utils.StringUtil;

@Component("loginFormValidator")
public class LoginFormValidator implements Validator {

    @Override
    public boolean supports(Class<?> arg0)
    {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public void validate(Object arg0, Errors arg1)
    {
        LoginForm loginForm = (LoginForm) arg0;
        
        // 验证用户名
        if (StringUtil.isNullOrEmpty(loginForm.getUserName()))
        {
            arg1.rejectValue("userName", null, "用户名不能为空.");
        }
        else if (!StringUtil.isLengthBetween(loginForm.getUserName(), 5, 10))
        {
            arg1.rejectValue("userName", null, "用户名长度应该在6~10位.");
        }
        
        // 验证密码
        if (StringUtil.isNullOrEmpty(loginForm.getPassword()))
        {
            arg1.rejectValue("password", null, "密码不能为空.");
        }
        else if (!StringUtil.isLengthBetween(loginForm.getPassword(), 5, 10))
        {
            arg1.rejectValue("password", null, "密码长度应该在6~10位.");
        }
    }
}