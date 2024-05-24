package com.cybertek.tests.day11.popup_and_alerts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Set;

import static org.openqa.selenium.Keys.ENTER;
/*
every tab which opened by selenium has their own unique id which is called vindow handles
*/

public class TabHandle {
    WebDriver driver;
    @BeforeMethod
    public void beforeMethod (){
    driver= new ChromeDriver();
}
    @Test
    public void test1() {
        driver.get("https://www.ebay.com/");
        WebElement searchBox = driver.findElement(By.xpath("//input[@type='text']"));
        searchBox.sendKeys("Wooden spoon" + ENTER);
        WebElement firstElement = driver.findElement(By.xpath("(//div[@class='s-item__title'])[2]"));
        firstElement.click();
        System.out.println("Before");
        Set<String> windowHandle = driver.getWindowHandles();
        for (String single : windowHandle) {
            driver.switchTo().window(single);
           if(driver.getTitle().equals("Wooden Kitchen Utensils set 11 PCS Wooden Cooking Spoons and Spatula for Cooking | eBay\n")){
               break;
           }
        }
        System.out.println("-----");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
    }}
