package com.cybertek.tests.day7.review;

import org.bouncycastle.jcajce.provider.drbg.DRBG;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonTextVerifyTestCase {
    public static void main(String[] args) throws InterruptedException {
        //1.set up driver
        WebDriver driver = new ChromeDriver();
        //2.go to amazon home page
        driver.get("https://www.amazon.com/");
       // driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Red Cup"+Keys.ENTER);


        driver.findElement(By.name("field-keywords")).sendKeys("Red Cup"+Keys.ENTER);
       // driver.findElement(By.xpath("//span[@class='a-size-base-plus a-color-base a-text-normal']")).click();
WebElement s=driver.findElement(By.xpath("//span[@class='a-size-base-plus a-color-base a-text-normal']"));
        System.out.println(s.getText());
        s.click();
        driver.findElement(By.id("productTitle"));
        WebElement a=  driver.findElement(By.id("productTitle"));
        System.out.println(a.getText());


    }
}