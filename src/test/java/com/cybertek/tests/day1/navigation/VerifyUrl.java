package com.cybertek.tests.day1.navigation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyUrl {
    public static void main(String[] args) {
        /*
        1.go to etsy-data is:https://www.etsy.com/
        2.verify url

        */

        WebDriver driver=new ChromeDriver();
        driver.get("https://www.etsy.com/");
        driver.manage().window().maximize();
        //for verify title ==use get title() method
        //for verify url==use getCurrentUrl() method
        String expectedURl="https://www.etsy.com/";
        String actualUrl=driver.getCurrentUrl();
        if (expectedURl.equalsIgnoreCase(actualUrl)){
            System.out.println("Pass");
        } else{
            System.out.println("Failed");
            System.out.println("Expected URL: "+expectedURl);
            System.out.println("Actual URL" +actualUrl);
        }
        driver.close();
    }
}
