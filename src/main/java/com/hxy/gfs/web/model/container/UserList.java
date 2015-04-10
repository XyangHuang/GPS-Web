package com.hxy.gfs.web.model.container;

import java.util.ArrayList;
import java.util.Collection;

import com.fasterxml.jackson.annotation.JsonRootName;
import com.hxy.gfs.web.model.BaseAccount;

@JsonRootName("users")
public class UserList extends ArrayList<BaseAccount> {

    private static final long serialVersionUID = -2220327054422493413L;

    public UserList(Collection<? extends BaseAccount> u) {
        super(u);
    }

    public UserList() {

    }

}
