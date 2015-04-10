package com.hxy.gfs.web.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.hxy.gfs.web.constants.Constants;

@JsonRootName(Constants.TABLE_QUESTIONNAIRE_MODEL)
public class Questionnaire extends BaseModel implements Serializable
{
    private static final long serialVersionUID = 7377954384878198731L;

    @JsonProperty(Constants.TABLE_QUESTIONNAIRE_MODEL_TITLE)
    private String title;

    @JsonProperty(Constants.TABLE_QUESTIONNAIRE_MODEL_DESCRIPTION)
    private String description;

    @JsonProperty(Constants.TABLE_QUESTIONNAIRE_MODEL_STATUS)
    private byte status;

    @JsonProperty("questions")
    private List<Question> questions;

    public List<Question> getQuestions()
    {
        return questions;
    }

    public void setQuestions(List<Question> questions)
    {
        this.questions = questions;
    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public byte getStatus()
    {
        return status;
    }

    public void setStatus(byte status)
    {
        this.status = status;
    }
    
    public void addQuestion(Question question)
    {
        if (question == null) return;
        
        if (questions == null)
        {
            questions = new ArrayList<Question>();
        }
        
        questions.add(question);
    }
}
