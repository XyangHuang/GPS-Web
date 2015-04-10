package com.hxy.gfs.web.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.hxy.gfs.web.constants.Constants;

public class BaseModel
{
    @JsonProperty(Constants.FIELD_BASE_MODEL_ID)
    private long id;

    @JsonIgnore
    private boolean markForDelete = false;

    @JsonIgnore
    private Date createdTime;

    @JsonIgnore
    private Date lastUpdatedTime;

    public long getId()
    {
        return id;
    }

    public void setId(long id)
    {
        this.id = id;
    }

    public boolean isMarkForDelete()
    {
        return markForDelete;
    }

    public void setMarkForDelete(boolean markForDelete)
    {
        this.markForDelete = markForDelete;
    }

    public Date getCreatedTime()
    {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime)
    {
        this.createdTime = createdTime;
    }

    public Date getLastUpdatedTime()
    {
        return lastUpdatedTime;
    }

    public void setLastUpdatedTime(Date lastUpdatedTime)
    {
        this.lastUpdatedTime = lastUpdatedTime;
    }
}
