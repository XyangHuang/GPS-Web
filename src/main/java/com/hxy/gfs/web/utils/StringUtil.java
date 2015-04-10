package com.hxy.gfs.web.utils;

public class StringUtil
{
    public static final String EMPTY = "";

    /**
     * Check whether the given String is empty.
     * 
     * @param str
     * @return true | false
     */
    public static boolean isNullOrEmpty(String str)
    {
        return str == null || str.equals("");
    }
    
    public static boolean isLengthBetween(String str, int min, int max)
    {
        if (str == null)
        {
            return false;
        }
        else if (str.length() >= min && str.length() <= max)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
