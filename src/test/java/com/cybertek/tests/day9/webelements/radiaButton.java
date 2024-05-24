package com.cybertek.tests.day9.webelements;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
//input id html

public class radiaButton {
   WebDriver driver;
   @BeforeMethod
    public void beforeMethod(){
       driver=WebDriverFactory.getDriver("chrome");
       driver.get("https://designsystem.digital.gov/components/radio-buttons/");
   }
   @Test
    public void htmlIsEnable(){
      WebElement html= driver.findElement(By.xpath("(//label[@class='usa-radio__label'])[2]"));
       System.out.println(html.isEnabled());
       System.out.println(html.getAttribute("for"));
       System.out.println(html.getAttribute("disabled"));
       html.click();
       Assert.assertTrue(html.isEnabled());
       //Assert.assertEquals(html.isEnabled(),"null");
       Assert.assertNull(html.getAttribute("null"));



   }
   @AfterMethod
    public void afterMethod(){
       driver.quit();
   }




}
