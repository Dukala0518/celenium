package com.cybertek.tests.day3.locators2;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaFaker {
    public static void main(String[] args) throws Exception{
        //create Faker Object
        Faker faker=new Faker();

        // I need first name
        String name=faker.name().firstName();
        String password=faker.app().author();
        System.out.println(name);
        WebDriver driver=new ChromeDriver();
        driver.get("https://signon.strayer.edu/idp/SSO.saml2?SAMLRequest=fVJNTwIxFPwrm973gy2L2AAJSowkKoRFD15Md%2FuQJt229rUq%2F95lVyNcODWdzsybTjtB3ijL5sHv9QY%2BAqCPvhulkXUHUxKcZoajRKZ5A8h8zcr54wPLk4xZZ7ypjSInkssKjgjOS6NJtFxMyduoEEVBR7t6XI2rqyoDykc1FeMi312LAR3yKz6mQyqgItELOGyVU9IatXLEAEuNnmvfQlk%2BjDMa02w7oCwvWDZ6JdGivY3U3HeqvfcWWZqifNdGJ%2BgdP4BLQIRUCpuW5So55s9JNP8LeWs0hgZcCe5T1vC8efi3kTVvbMAzH5SNVXB0SRsjgoLE7m3a7bFf85jX2KECdjwoH6Ml0fq3xxuphdTvlyusehKy%2B%2B12Ha9X5ZbMJkdv1lXiZhcSTtJT4qR%2F%2B6d2xHKxNkrWh%2BjOuIb7ywmOiBTxrqOy1l2jBO3b4pQyX7cOuIcp8S4ASWf9yPMfNvsB&RelayState=https%3A%2F%2Ficampus.strayer.edu%2Fsaml_login%3Fdestination%3D%252F");
        Thread.sleep(3000);
        driver.findElement(By.id("username")).sendKeys(name);
        Thread.sleep(3000);
        driver.findElement(By.id("password")).sendKeys(password);
        Thread.sleep(3000);
        driver.findElement(By.id("signOnButton")).click();
        Thread.sleep(3000);
        driver.close();







    }
}
