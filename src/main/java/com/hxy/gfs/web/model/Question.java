package com.hxy.gfs.web.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.hxy.gfs.web.constants.Constants;

@JsonRootName(Constants.TABLE_QUESTION_MODEL)
public class Question extends BaseModel implements Serializable
{
    private static final long serialVersionUID = -7789025606924508331L;

    @JsonProperty(Constants.TABLE_QUESTION_MODEL_QUESTIONNAIRE_ID)
    private long questionnaireId;

    @JsonProperty(Constants.TABLE_QUESTION_MODEL_TITLE)
    private String title;

    @JsonProperty(Constants.TABLE_QUESTION_MODEL_QUESTION_TYPE)
    private byte questionType;

    @JsonProperty(Constants.TABLE_QUESTION_MODEL_QUESTION_NUMBER)
    private int questionNumber;
    
    @JsonProperty("choices")
    private List<Choice> choices;
    
    public long getQuestionnaireId()
    {
        return questionnaireId;
    }

    public void setQuestionnaireId(long questionnaireId)
    {
        this.questionnaireId = questionnaireId;
    }

    public List<Choice> getChoices()
    {
        return choices;
    }

    public void setChoices(List<Choice> choices)
    {
        this.choices = choices;
    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public byte getQuestionType()
    {
        return questionType;
    }

    public void setQuestionType(byte questionType)
    {
        this.questionType = questionType;
    }

    public int getQuestionNumber()
    {
        return questionNumber;
    }

    public void setQuestionNumber(int questionNumber)
    {
        this.questionNumber = questionNumber;
    }
    
    public void addChoice(Choice choice)
    {
        if (choice == null) return;
        
        if (choices == null)
        {
            choices = new ArrayList<Choice>();
        }
        
        choices.add(choice);
    }
}
