package com.cybertek.tests.day7.review;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EbayTest {
    public static void main(String[] args) throws Exception {
        eBayFirstMatch();
        ebaySecondMatch();
    }

    public static void ebaySecondMatch() throws Exception{
        //open browser
        WebDriver driver=new ChromeDriver();
        //go to eBay home page
        driver.get("https://www.ebay.com/");
        //find second result store in to firsResult
        WebElement firstResult= driver.findElement(By.xpath("(//h3[@class='vl-popular-destinations-evo__name'])[2]"));
        //convert firsResult web element to String and print
        String expected=firstResult.getText();
        //click on second
        firstResult.click();
        //store actual result in to String
        Thread.sleep(2000);
        String actual= driver.findElement(By.xpath("//h1[@class='bhp__title']")).getText();
        //comparing actual and expected by using if condition
        if(actual.equalsIgnoreCase(expected)){
            System.out.println("PASS");
        }else {
            System.out.println("actual = " + actual);
            System.out.println("expected = " + expected);
        }
        //close the web page
        driver.close();

    }
    public static void eBayFirstMatch() {
        //open browser
        WebDriver driver=new ChromeDriver();
        //go to eBay home page
        driver.get("https://www.ebay.com/");
        //find first result store in to firsResult
       WebElement firstResult= driver.findElement(By.xpath("//h3[@class='vl-popular-destinations-evo__name']"));
        //convert firsResult web element to String and print
        String expected=firstResult.getText();
        //click on firsResult
        firstResult.click();
        //store actual result in to String
       String actual= driver.findElement(By.xpath("//h1[@class='title-banner__title']")).getText();
        //comparing actual and expected by using if condition
        if(actual.equalsIgnoreCase(expected)){
            System.out.println("PASS");
        }else {
            System.out.println("actual = " + actual);
            System.out.println("expected = " + expected);
        }
        //close the web page
         driver.close();
    }
}
