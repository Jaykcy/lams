package com.xhjsj.utils;

public class RoomMax {
    public static boolean judgeCanApply(Integer now,Integer max){
        if(now<=max){
            return true;
        }
        return false;
    }
}
