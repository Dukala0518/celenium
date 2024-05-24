package com.cybertek.tests.day9.webelements;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.security.Key;
import java.security.KeyStore;
import java.util.*;

public class eBayTest {
    WebDriver driver;
    @BeforeMethod
    public void beforeMethod(){
        driver= WebDriverFactory.getDriver("chrome");
        driver.get("https://www.ebay.com/");
    }

    @Test
    public void test1(){
        driver.get("https://www.ebay.com/");
        driver.findElement(By.id("gh-ac")).sendKeys("paper towel"+ Keys.ENTER);
      List<WebElement> list= driver.findElements(By.xpath("//div[@class='s-item__title']"));
        System.out.println(list.size());
        System.out.println(list.get(1).getText());
        System.out.println(list.get(list.size()-1).getText());
    }

    @AfterMethod
    public void afterMethod(){
       driver.quit();
    }
}
