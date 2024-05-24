package com.cybertek.tests.day12.synchronize;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class ExplicitWait {
    WebDriver driver;
    WebDriverWait wait;
    @BeforeMethod
    public void beforeMethod(){
        driver=new ChromeDriver();
       // driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        wait=new WebDriverWait(driver, Duration.ofSeconds(10));

       // wait.until(ExpectedConditions.elementToBeClickable(By.xpath("")))
    }
    @Test
    public void test1(){
        driver.get("https://www.abercrombie.com/shop/us");
        WebElement search= driver.findElement(By.xpath("(//button[@class='button catalog-searchWrapper-module__button'])[2]"));
        //System.out.println(driver.getTitle());
       // Assert.assertTrue(driver.getTitle().contains("Abercrombie & Fitch"));
        //wait.until(ExpectedConditions.invisibilityOfAllElements(search));
        wait.until(ExpectedConditions.elementToBeClickable(search));
        search.click();



        //WebElement searchBox=driver.findElement(By.id("search-input-field"));
        //searchBox.sendKeys("Pajama"+ Keys.ENTER);
    }


}


