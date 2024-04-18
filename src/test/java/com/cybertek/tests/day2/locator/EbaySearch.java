package com.cybertek.tests.day2.locator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EbaySearch {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        //1.go to Amazon
        driver.get("https://www.amazon.com/");
        //2. navigate to eBay
        driver.navigate().to("https://www.ebay.com/");
        //3.go to search button and click
        driver.findElement(By.id("gh-ac")).click();
        //4.find search button and put what you look for
      //  driver.findElement(By.id("gh-ac")).sendKeys("nike panda women shoes");
        //5.find search button and click
       // driver.findElement(By.id("gh-btn")).click();
        driver.findElement(By.id("gh-ac")).sendKeys("Coffee"+ Keys.ENTER);
        String expected="Coffee";
        String actual=driver.getTitle();
        if(actual.contains(expected)){
            System.out.println("Pass");
        }else{
            System.out.println("Fail");
            System.out.println("Expected title: "+expected);
            System.out.println("Actual title: "+actual);
        }
        driver.close();



    }
}
