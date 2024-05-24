package com.cybertek.tests.day11.popup_and_alerts;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PopUp {
    WebDriver driver;
    @BeforeMethod
    public void beforeMethod (){
        driver= new ChromeDriver();

    }
    @AfterMethod
    public void afterMethod() {
        //driver.quit();
    }
    @Test
    public void test1(){
        driver.get("https://www.primefaces.org/showcase/ui/overlay/confirmDialog.xhtml?jfwid=dfb3c");
       WebElement firstPopUp= driver.findElement(By.xpath("//span[@class='ui-button-text ui-c']"));
       firstPopUp.click();
       WebElement secondPopUp=driver.findElement(By.id("j_idt341:j_idt345"));
       secondPopUp.click();

    }
    @Test
    public void  test2 (){
        driver.get("https://phppot.com/demo/javascript-confirm/");
        WebElement fPopUp= driver.findElement(By.xpath("//div[@class='alert-box']"));
        fPopUp.click();
        Alert alert;
        try{
            alert=driver.switchTo().alert();
            alert.accept();
        }catch (NoAlertPresentException e){
            System.out.println("no alert ");
        }

    }
    @Test
    public void test3(){
        driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_iframe_target");

       WebElement frame= driver.findElement(By.id("iframeResult"));
       driver.switchTo().frame(frame);
       WebElement text= driver.findElement(By.tagName("H1"));
    }



}
