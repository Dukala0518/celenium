package com.cybertek.tests.day4.xpath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;

public class PracticeFactory {
    public static void main(String[] args) {
        WebDriver driver=WebDriverFactory.getDriver("Chrome");
        driver.get("GOOGLE.COM");


    }
}
