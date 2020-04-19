package com.xhjsj.utils;

import org.apache.commons.lang3.StringUtils;

public class StringUtil {
    public static String getSqlInStrByStrArray(String str) {
        StringBuffer temp = new StringBuffer();
        if(StringUtils.isEmpty(str)){
            return "('')";
        }
        temp.append("(");
        if(StringUtils.isNotEmpty(str)){
            String[] strArray=str.split(",");
            if (strArray != null && strArray.length > 0 ) {
                for (int i = 0; i < strArray.length; i++) {
                    temp.append("'");
                    temp.append(strArray[i]);
                    temp.append("'");
                    if (i !=  (strArray.length-1) ) {
                        temp.append(",");
                    }
                }
            }
        }
        temp.append(")");
        return temp.toString();
    }
}
