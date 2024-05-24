package com.cybertek.tests.day12.synchronize;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ImplicitWait {
    WebDriver driver;
    @BeforeMethod
    public void beforeMethod(){
        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
    }
    @Test
    public void test1(){
        driver.get("https://www.abercrombie.com/shop/us");
        WebElement search= driver.findElement(By.xpath("//button[@class='button catalog-searchWrapper-module__button']"));
        System.out.println(driver.getTitle());
        Assert.assertTrue(driver.getTitle().contains("Abercrombie & Fitch"));
        search.click();



       //WebElement searchBox=driver.findElement(By.id("search-input-field"));
       //searchBox.sendKeys("Pajama"+ Keys.ENTER);
    }


}
