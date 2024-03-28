package com.cybertek.tests.day1.navigation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyAmazon {
    public static void main(String[] args) {
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.amazon.com/");
        driver.manage().window().maximize();
        String actualUrl="https://www.amazon.com/";
        String expectedUrl=driver.getCurrentUrl();
        if(expectedUrl.equalsIgnoreCase(actualUrl)){
            System.out.println("Pass");
        }else {
            System.out.println("Fail");
            System.out.println("Expected URL "+expectedUrl);
            System.out.println("Actual URl "+actualUrl);
        }
        driver.close();
    }
}
