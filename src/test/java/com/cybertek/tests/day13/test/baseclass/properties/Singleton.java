package com.cybertek.tests.day13.test.baseclass.properties;

public class Singleton {
    //make constructor private
    private Singleton (){
    }
    static  String string;
    public static String getInstance(){
        if(string==null){
            string="chrome";
        }
        return string;
    }
}
