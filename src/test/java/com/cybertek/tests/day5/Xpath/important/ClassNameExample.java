package com.cybertek.tests.day5.Xpath.important;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ClassNameExample {
    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("https://signon.strayer.edu/idp/SSO.saml2?SAMLRequest=fVJdawIxEPwrR97vTo%2FqeUEFq5QKtopn%2B9CXEpNVA7kkzSZt%2Ffe9j5bqixAImezMzk4yRlYpS2fBn%2FQWPgKgj74rpZG2FxMSnKaGoUSqWQVIPafl7GlFs6RHrTPecKPIBeU2gyGC89JoEi0XE%2FK%2Bz2GQ53DY81G%2FgLwYsb7gYj%2FiIusPs3xUFINCFFkxzEn0Cg5r5oTUQjUdMcBSo2fa11Avu4t7zdr1C9ob0EH%2BRqJFPY3UzLesk%2FcWaZqiPGqjE%2FSOncElIEIqhU3Lcp00%2FjMSzf5Mzo3GUIErwX1KDi%2Fb1b%2BM5KyyAa90UFZWQaOSVkYEBYk92bQ9Y7dnMePYogIOLCgfoyXR5jfHe6mF1MfbEe67IqSPu90m3qzLHZmOG23aRuKmNxyO08vCcff2z3WL5WJjlOTn6MG4ivnbDhpEivjQltJaXaME7evglDJfcwfMw4R4F4Ck067l9Q%2Bb%2FgA%3D&RelayState=https%3A%2F%2Ficampus.strayer.edu%2Fsaml_login%3Fdestination%3D%252F");
       // System.out.println(driver.findElement(By.className("ping-button normal allow")).getText());
       // System.out.println(driver.findElement(By.linkText("Forgot Username?")));
        // System.out.println(driver.findElement(By.linkText("Forgot Username?")).getText());
        //System.out.println(driver.findElement(By.partialLinkText("Username")).getText());
        driver.findElement(By.xpath("//input[@name='pf.username']")).sendKeys("Password");
        driver.findElement(By.xpath("//input[@name='pf.pass']")).sendKeys("Dukala0518");
        driver.findElement(By.xpath("//a[@onclick='postOk();']")).click();
        driver.close();
    }



}
