package com.cybertek.tests.day12.synchronize;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class FluentWait {
    WebDriver driver;
    WebDriverWait wait;

   @BeforeMethod
    public void beforeMethod(){
       driver=new ChromeDriver();
       wait=new WebDriverWait(driver,Duration.ofSeconds(10));
    }
    @Test
    public void test1(){
        driver.get("https://www.ebay.com/");

      // WebElement shopNow= driver.findElement(By.xpath("//div[@style='background: rgb(18, 18, 88); color: rgb(197, 229, 251); border-color: rgb(18, 18, 88);']"));
     //  wait.until(ExpectedConditions.visibilityOf(shopNow));
      // shopNow.click();
    }
}
