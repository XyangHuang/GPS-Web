package com.hxy.gfs.web.service.impl;

import javax.ws.rs.core.MediaType;

import org.springframework.stereotype.Service;

import com.hxy.gfs.web.model.SessionContext;
import com.hxy.gfs.web.model.container.LoginForm;
import com.hxy.gfs.web.service.LoginService;
import com.hxy.gfs.web.utils.InvocationUtil;
import com.hxy.gfs.web.utils.JsonUtil;

@Service
public class LoginServiceImpl implements LoginService {

    @Override
    public SessionContext loginUser(LoginForm loginForm) {
        String postBody = JsonUtil.getJsonStringWithRootFromPojo(loginForm);
        String response = InvocationUtil.sendPostRequest("login", null, MediaType.APPLICATION_JSON, postBody,
                        MediaType.APPLICATION_JSON);
        
        
        return JsonUtil.getPojoFromJsonStringWithRoot(response, SessionContext.class);
    }
}
