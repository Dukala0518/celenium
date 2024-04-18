package com.cybertek.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverFactory {
    /*
    Write a static return method which returns WebDriver and accepts parameter
    as a String which is browserType
    return ChromeDriver or FirefoxDriver
    */
   public static WebDriver getDriver(String browserType) {
        WebDriver driver=null;
        switch (browserType.toLowerCase()){
            case"chrome":
                driver=new ChromeDriver();
                break;
            case"firefox":
                driver=new FirefoxDriver();
                break;
        }
        return driver ;
    }


}

