package com.cybertek.tests.day4.xpath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TextMethod {
    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("https://signon.strayer.edu/idp/X9zwp/resumeSAML20/idp/SSO.ping");


    }
}
