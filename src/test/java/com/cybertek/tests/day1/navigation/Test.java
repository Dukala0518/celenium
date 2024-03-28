package com.cybertek.tests.day1.navigation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
    public static void main(String[] args) {
        //1.go to google
        //2.save the title in String variable
        //3.go to Etsy
        //4.Save the Etsy title in a String
        //5.Navigate back to previous page
        //6.Verify the title is same as step 2
        //7.Navigate forward to previous page
        //8.Verify the title is same as step 4

        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com/");
        String GoogleName="Google";
        driver.navigate().to("https://www.etsy.com/");
        String Etsy="Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone";
        driver.navigate().back();
        String actual=driver.getTitle();
        if (GoogleName.equalsIgnoreCase(driver.getTitle())){
            System.out.println("Pass");
        }else{
            System.out.println("Fail");
        }
        driver.navigate().forward();

        if(Etsy.equalsIgnoreCase(driver.getTitle())){
            System.out.println("Pass");
        }else{
            System.out.println("Fail");
        }
        driver.close();


    }
}
