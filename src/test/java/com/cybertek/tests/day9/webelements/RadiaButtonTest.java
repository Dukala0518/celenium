package com.cybertek.tests.day9.webelements;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RadiaButtonTest {
    WebDriver driver;

    @BeforeMethod
    public void beforeMethod() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://materializecss.com/radio-buttons.html");
    }

    @Test
    public void test1() {

        WebElement red = driver.findElement(By.xpath("//input[@name='group1']"));
        System.out.println(red.isSelected());
    }

    @Test
    public void test2() {

        WebElement red = driver.findElement(By.xpath("//input[@name='group1']"));


    }

    @AfterMethod
    public void afterTest() {
        driver.quit();

    }

}
