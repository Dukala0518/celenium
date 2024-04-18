package com.cybertek.tests.day7.review;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Vikipedia {
    public static void main(String[] args) {
        //GO TO VIKIPEDIA.ORG
        //ENTER SEARCH TERM SELENIUM WEB DRIVER
        //CLICK ON SEARCH BUTTON
        //CLICK ON SEARCH RESULT
        //VERIFY URL ENDS WITH SELENIUM SOFTWARE
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("https://www.ebay.com/");
       WebElement searchBox= driver.findElement(By.cssSelector("input[class='gh-tb ui-autocomplete-input']"));
       searchBox.sendKeys("shoes"+Keys.ENTER);
       String searchBoxToString=searchBox.getText();
      String URL= driver.getCurrentUrl();
        System.out.println(URL);
      if(URL.contains("shoe")){
          System.out.println("pass");
      }else{
          System.out.println("Fail");
          System.out.println(URL);
      }




//https://www.ebay.com/sch/i.html?_from=R40&_trksid=p4432023.m570.l1313&_nkw=shoes&_sacat=0



    }
}
