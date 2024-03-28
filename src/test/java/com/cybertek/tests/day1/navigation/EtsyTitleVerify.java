package com.cybertek.tests.day1.navigation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EtsyTitleVerify {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        //go to etsy--data URL of website:https://www.etsy.com/
        //verify title
        //expected vs actual
        driver.get("https://www.etsy.com/");
        String expected="Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone";
        String actualTitle=driver.getTitle();
        if(expected.equalsIgnoreCase(actualTitle)){
            System.out.println("Pass");
        }else {
            System.out.println("The test is failed");
            System.out.println(expected+" vs "+ actualTitle);

        }
        driver.close();


    }
}
