package com.cybertek.tests.day9.webelements;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class radioButtonTest2 {
    //historical-figures
    WebDriver driver;
    @BeforeMethod
    public void beforeMethod(){
        driver=new ChromeDriver();
        driver.get("https://designsystem.digital.gov/components/radio-buttons/");
    }

   /* @Test
    public void test1(){
      List< WebElement > historicalFigures= driver.findElements(By.name("historical-figures"));
        System.out.println(historicalFigures.size());
        for(WebElement figure: historicalFigures){
            //Assert.assertTrue((figure.isSelected()));
            //Assert.assertTrue(figure.isDisplayed());
            System.out.println(figure.isSelected());

    }*/
    @Test
    public void allLinks() {
       List<WebElement>link= driver.findElements(By.tagName("a"));
        System.out.println(link.size());
        System.out.println("no links??");
    }
    @Test
    public void test1(){
        List< WebElement > historicalFigures= driver.findElements(By.name("historical-figures"));
        System.out.println(historicalFigures.size());
        for(WebElement figure: historicalFigures){
            //Assert.assertTrue((figure.isSelected()));
            //Assert.assertTrue(figure.isDisplayed());
            System.out.println(figure.isSelected());

        }}



    @AfterMethod
    public void afterMethod(){
        driver.quit();
    }

}
