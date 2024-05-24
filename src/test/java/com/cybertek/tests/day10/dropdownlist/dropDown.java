package com.cybertek.tests.day10.dropdownlist;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.util.*;

public class dropDown {
    WebDriver driver;

    @BeforeMethod
    public void beforeMethod(){
        driver=new ChromeDriver();
        driver.get("https://designsystem.digital.gov/components/select/");
    }
    @Test
    public void test1(){
     WebElement list= driver.findElement(By.id("options"));
     Select dropdown=new Select(list);
     System.out.println(dropdown.getFirstSelectedOption().getText());
     Assert.assertEquals(dropdown.getFirstSelectedOption().getText(),"- Select -");

    }
    @Test
    public void test2() {
        WebElement list = driver.findElement(By.className("usa-select"));
        Select selection = new Select(list);
       // selection.selectByVisibleText("Option C");
        WebElement selections=selection.getFirstSelectedOption();
        List<WebElement> listOfSelection=selection.getAllSelectedOptions();
        System.out.println(listOfSelection.size());
        List<WebElement>listOfOption=selection.getOptions();
        System.out.println(listOfOption.size());
        for(WebElement ner:listOfOption){
            System.out.println(ner.getText());
        }


    }
    @AfterMethod
    public void afterMethod(){
      //  driver.quit();
    }

}
