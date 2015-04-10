package com.hxy.gfs.web.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.hxy.gfs.web.constants.Constants;

public class BaseAccount extends BaseModel
{
    @JsonProperty("base_account_id")
    private long baseAccountId;
    
    @JsonProperty("userName")
    private String userName;

    @JsonProperty(Constants.FIELD_BASE_ACCOUNT_PASSWORD)
    private String password;

    @JsonProperty(Constants.FIELD_BASE_ACCOUNT_NICK_NAME)
    private String name;

    @JsonProperty("phone_number")
    private String phoneNumber;
    
    @JsonProperty("role")
    private int role;

    public long getBaseAccountId()
    {
        return baseAccountId;
    }

    public void setBaseAccountId(long baseAccountId)
    {
        this.baseAccountId = baseAccountId;
    }

    public String getUserName()
    {
        return userName;
    }

    public void setUserName(String userName)
    {
        this.userName = userName;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getPhoneNumber()
    {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber)
    {
        this.phoneNumber = phoneNumber;
    }
    
    public int getRole()
    {
        return role;
    }

    public void setRole(int role)
    {
        this.role = role;
    }
}
