package com.cybertek.tests.day10.dropdownlist;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class sendKeysWithJavaScript {
    WebDriver driver=new ChromeDriver();
    JavascriptExecutor jse;

    @BeforeMethod
    public void beforeMethod(){
        jse =(JavascriptExecutor) driver;

    }
    @Test
    public void test1() throws InterruptedException {
        driver.get("https://www.ebay.com/");
        WebElement aboutEbay=driver.findElement(By.linkText("About eBay"));
        Thread.sleep(2000);
        jse.executeScript("arguments[0].scrollIntoView(true);", aboutEbay);
        Thread.sleep(2000);
    }
    @Test
    public void test2(){
        driver.get("https://www.ebay.com/");
       WebElement searchBox= driver.findElement(By.xpath("//input[@type='text']"));
       String text="shoes";
       jse.executeScript("arguments[0].setAttribute('value','"+text+"')",searchBox);




    }





}


