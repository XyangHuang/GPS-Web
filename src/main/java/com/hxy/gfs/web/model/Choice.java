package com.hxy.gfs.web.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.hxy.gfs.web.constants.Constants;

@JsonRootName(Constants.TABLE_CHOICE_MODEL)
public class Choice extends BaseModel implements Serializable
{
    private static final long serialVersionUID = 2177325190737626891L;

    @JsonProperty(Constants.TABLE_CHOICE_MODEL_QUESTION_ID)
    private long questionId;

    @JsonProperty(Constants.TABLE_CHOICE_MODEL_CHOICE_NAME)
    private String choiceName;

    @JsonProperty(Constants.TABLE_CHOICE_MODEL_NEED_ADD_INFO)
    private boolean needAddInfo;

    public long getQuestionId()
    {
        return questionId;
    }

    public void setQuestionId(long questionSid)
    {
        this.questionId = questionSid;
    }

    public String getChoiceName()
    {
        return choiceName;
    }

    public void setChoiceName(String choiceName)
    {
        this.choiceName = choiceName;
    }

    public boolean isNeedAddInfo()
    {
        return needAddInfo;
    }

    public void setNeedAddInfo(boolean needAddInfo)
    {
        this.needAddInfo = needAddInfo;
    }
}
