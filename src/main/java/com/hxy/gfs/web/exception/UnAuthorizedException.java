package com.hxy.gfs.web.exception;

import java.util.Collection;

public class UnAuthorizedException extends BaseException {

    private static final long serialVersionUID = -5469199039846817137L;

    public UnAuthorizedException() {
        super("403 Forbidden");
    }

    public UnAuthorizedException(String message, String code, Collection<?> details) {
        super(message, code, details);
        // TODO Auto-generated constructor stub
    }

    public UnAuthorizedException(String message, String code, Object[] param, Collection<?> details, Throwable cause) {
        super(message, code, param, details, cause);
        // TODO Auto-generated constructor stub
    }

    public UnAuthorizedException(String message, String code, Object[] param, Collection<?> details) {
        super(message, code, param, details);
        // TODO Auto-generated constructor stub
    }

    public UnAuthorizedException(String message, String code) {
        super(message, code);
        // TODO Auto-generated constructor stub
    }

    public UnAuthorizedException(String message) {
        super(message);
        // TODO Auto-generated constructor stub
    }

    public UnAuthorizedException(String message, String code, Object[] param) {
        super(message, code, param);
        // TODO Auto-generated constructor stub
    }

}
