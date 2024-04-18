package com.cybertek.tests.day3.locators2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeValue {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://signon.strayer.edu/idp/SSO.saml2?SAMLRequest=fVJdawIxEPwrR97vE7UaVLBKqWCreLYPfSnxbqOBXJJmk7b%2B%2B8a7luqLsBAy2ZmdTDJG1khDZ94d1RY%2BPKCLvhupkLYHE%2BKtopqhQKpYA0hdRcvZ04oWSUaN1U5XWpILym0GQwTrhFYkWi4m5L3o5RzuesCKUT4ADsM%2B7It8n49YzWEw5P39YMB5n2cViV7BYmBOSBAKdEQPS4WOKRegrOjFWah8l%2FdpqCx%2FI9Ei3EYo5lrW0TmDNE1RHJRWCTrLTmATqH0qapOW5To5%2By9INPszOdcKfQO2BPspKnjZrv5lRMUa4%2FFKB0VjJJxV0kbXXkJijiZt99itRcwqbNEaOPPSxWhItPnN8V6oWqjD7Qj3XRPSx91uE2%2FW5Y5Mx2dt2kZipzccjtPLxnH39s9hxHKx0VJUp%2BhB24a52w7OiKhj3rbSoK5QgHIhOCn119wCczAhznog6bQbef3Dpj8%3D&RelayState=https%3A%2F%2Ficampus.strayer.edu%2Fsaml_login%3Fdestination%3D%252F");
        //Get value of type attribute
      WebElement userName= driver.findElement(By.name("pf.username"));
        String valueofType=userName.getAttribute("type");
        System.out.println(valueofType);
        System.out.println(userName.getAttribute("autocorrect"));
        System.out.println(userName.getAttribute("id"));
        System.out.println(driver.findElement(By.tagName("h1")).getText());


        driver.close();

    }
}
