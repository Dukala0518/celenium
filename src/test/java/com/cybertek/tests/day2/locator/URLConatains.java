package com.cybertek.tests.day2.locator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class URLConatains {
    public static void main(String[] args) {
        WebDriver driver =new ChromeDriver();
        driver.get("https://www.google.com/");
        String expectedPartialURL=("google.com");
        String actualURL=driver.getCurrentUrl();
        if(actualURL.contains(expectedPartialURL)){
            System.out.println("Pass");
        }else{
            System.out.println("Fail");
            System.out.println("ExpectedPartial URL is: "+expectedPartialURL);
            System.out.println("Actaul URL is: "+actualURL);
        }
        driver.close();




    }




}
