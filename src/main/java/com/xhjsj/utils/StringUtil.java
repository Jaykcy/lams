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

    public static String getSqlInIntByStrArray(String str) {
        StringBuffer temp = new StringBuffer();
        if(StringUtils.isEmpty(str)){
            return "('')";
        }
        temp.append("(");
        if(StringUtils.isNotEmpty(str)){
            String[] strArray=str.split(",");
            if (strArray != null && strArray.length > 0 ) {
                for (int i = 0; i < strArray.length; i++) {
                    temp.append(strArray[i]);
                    if (i !=  (strArray.length-1) ) {
                        temp.append(",");
                    }
                }
            }
        }
        temp.append(")");
        return temp.toString();
    }

    public static String[] toStrArray(String str)
    {
        return toStrArray(",",str);
    }

    /**
     * 转换为String数组<br>
     *
     * @param split 分隔符
     * @param split 被转换的值
     * @return 结果
     */
    public static String[] toStrArray(String split, String str)
    {
        return str.split(split);
    }

    public static String stringArray2Strin(String[] str) {

        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < str.length; i++) {
            sb.append("'").append(str[i]).append("'").append(",");
        }
        return sb.toString().substring(0, sb.length() - 1);
    }


}
