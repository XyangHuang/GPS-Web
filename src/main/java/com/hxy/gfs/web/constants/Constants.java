package com.hxy.gfs.web.constants;

import java.util.Locale;

public class Constants {

    /** Configuration file */
    public static final String MGMT_PROPS_FILE = "gfs_api.properties";
    public static final String HTTP_PROTOCOL = "http://";
    public static final String MGMT_HOST_PROPS_KEY = "address";
    public static final String MGMT_PORT_PROPS_KEY = "port";
    public static final String MGMT_BASE_URI_PROPS_KEY = "base.path";

    /** Field name id used in BaseModel */
    public static String FIELD_ID = "id";
    /** Field name deletedYN used in BaseModel */
    public static String FIELD_DELETED_YN = "deletedYN";

    /** I18N */
    public static final String I18N_LOCALE_ATTRIBUTE = "request-locale";
    public static final String I18N_USER_LOCALE = "i18n.user.locale";
    public static final String I18N_DEFAULT_LANGUAGE = "zh-CN";
    public static final Locale I18N_DEFAULT_BUNDLE_LOCALE = Locale.ROOT;
    public static final String I18N_BUNDLE_BASE_NAME = "messages";

    /** HEADER */
    public static final String HEADER_X_AUTH_HEADER = "x-auth-token";

    /** Time format */
    public static final String DEFAULT_TIME_FORMAT = "yyyy-MM-dd HH:mm:ss";

    /** json keys */
    public static final String USERNAME = "username";
    public static final String PASSWORD = "password";
    
    /**
     * Base Model
     */
    public static final String FIELD_BASE_MODEL_ID = "id";
    public static final String FIELD_BASE_MODEL_MARK_FOR_DELETE = "mark_for_delete";
    public static final String FIELD_BASE_MODEL_CREATED_TIME = "created_time";
    public static final String FIELD_BASE_MODEL_LAST_UPDATED_TIME = "last_updated_time";
    
    /**
     * Base Account
     */
    public static final String FIELD_BASE_ACCOUNT_USERNAME = "username";
    public static final String FIELD_BASE_ACCOUNT_PASSWORD = "password";
    public static final String FIELD_BASE_ACCOUNT_NICK_NAME = "nick_name";

    /**
     * User Model
     */
    public static final String TABLE_USER_MODEL = "user";
    
    /**
     * Manager Model
     */
    public static final String TABLE_MANAGER_MODEL = "manager";
    
    /**
     * Questionnaire Model
     */
    public static final String TABLE_QUESTIONNAIRE_MODEL = "questionnaire";
    public static final String TABLE_QUESTIONNAIRE_MODEL_TITLE = "title";
    public static final String TABLE_QUESTIONNAIRE_MODEL_DESCRIPTION = "description";
    public static final String TABLE_QUESTIONNAIRE_MODEL_STATUS = "status";
    
    /**
     * Question Model
     */
    public static final String TABLE_QUESTION_MODEL = "question";
    public static final String TABLE_QUESTION_MODEL_QUESTIONNAIRE_ID = "questionnaire_id";
    public static final String TABLE_QUESTION_MODEL_TITLE = "title";
    public static final String TABLE_QUESTION_MODEL_QUESTION_NUMBER = "question_number";
    public static final String TABLE_QUESTION_MODEL_QUESTION_TYPE = "question_type";
    
    /**
     * Choice Model
     */
    public static final String TABLE_CHOICE_MODEL = "choice";
    public static final String TABLE_CHOICE_MODEL_QUESTION_ID = "question_id";
    public static final String TABLE_CHOICE_MODEL_CHOICE_NAME = "choice_name";
    public static final String TABLE_CHOICE_MODEL_NEED_ADD_INFO = "need_add_info";
    
    /**
     * UserQuestionnaire Model
     */
    public static final String TABLE_USER_QUESTIONNAIRE_MODEL = "user_questionnaire";
    public static final String TABLE_USER_QUESTIONNAIRE_MODEL_USER_ID = "user_id";
    public static final String TABLE_USER_QUESTIONNAIRE_MODEL_QUESTIONNAIRE_ID = "questionnaire_id";
    public static final String TABLE_USER_QUESTIONNAIRE_MODEL_SUMBIT_TIME = "submit_time";
    
    /** USER **/
    public static final String USER = "user";
    public static final String USER_LOGIN_TOKEN = "token";
    public static final String USER_IDENTIFIER = "useridentifier";

    /** PATH **/
    public static final String PATH_WADL = "application.wadl";
    public static final String PATH_LOGIN = "login";
    public static final String PATH_LOGOUT = "logout";

    /** SESSION **/
    public static final String SESSION_USER_TOKEN = "session.user.token";
}
