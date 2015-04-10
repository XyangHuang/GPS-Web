package com.hxy.gfs.web.service;

import com.hxy.gfs.web.model.SessionContext;
import com.hxy.gfs.web.model.container.LoginForm;

public interface LoginService {
    public SessionContext loginUser(LoginForm loginForm);
}
