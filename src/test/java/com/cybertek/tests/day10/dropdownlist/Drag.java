package com.cybertek.tests.day10.dropdownlist;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import javax.swing.*;
import java.time.LocalDate;

public class Drag {
    WebDriver driver;
    Actions action;

    @BeforeMethod
    public void beforeMethod() throws InterruptedException {
        driver = new ChromeDriver();
        action=new Actions(driver);
        driver.get("https://demos.telerik.com/kendo-ui/dragdrop/index?autoRun=true&theme=default-main");
        Thread.sleep(3000);
    }

    @Test
    public void test2() throws InterruptedException {
        Thread.sleep(3000);
        WebElement drag= driver.findElement(By.id("draggable"));
        WebElement drop=driver.findElement(By.id("droptarget"));
        Thread.sleep(3000);

        action.dragAndDrop(drag,drop).build().perform();
        //Thread.sleep(3000);
        action.moveToElement(drag).clickAndHold().moveToElement(drop).click().release().build().perform();
        action.sendKeys(Keys.ARROW_DOWN).perform();
        action.sendKeys(Keys.ARROW_DOWN).perform();



    }

}
