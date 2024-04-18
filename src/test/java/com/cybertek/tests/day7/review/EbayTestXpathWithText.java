package com.cybertek.tests.day7.review;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.*;

public class EbayTestXpathWithText {
    public static void main(String[] args) {
        XpathWithText();
    }
    //formula is ------>     //tagName[.='text']
    private static void XpathWithText(){
        //open browser
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        //go to ebay
        driver.get("https://www.ebay.com/");
        //search selenium book
        driver.findElement(By.id("gh-ac")).sendKeys("Selenium book"+ Keys.ENTER);
      WebElement firstBook= driver.findElement(By.xpath("//span[.='Selenium As Food and Medicine - paperback Passwater, Richard A.']"));
      String expected=firstBook.getText();
        System.out.println(expected);
        //click on the firstBook
        firstBook.click();
        //verify they have same name
        WebElement FirstBookTitle= driver.findElement(By.xpath("//span[.='Selenium As Food and Medicine - paperback Passwater, Richard A.']"));
        String actual=FirstBookTitle.getText();
        System.out.println(actual);
        if(expected.equalsIgnoreCase(actual)){
            System.out.println("Pass");
        }else{
            System.out.println("actual = " + actual);
            System.out.println("expected = " + expected);
        }
       driver.quit();




    }
}
