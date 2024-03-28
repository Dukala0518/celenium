package com.cybertek.tests.day1.navigation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstClass {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");

       // WebDriverManager.chromedriver().setup();
        //WebDriver -->Interface
        WebDriver driver = new ChromeDriver();
        //open Google home page
       // driver.get("https://www.google.com");
      //  System.out.println("Accessed Google.com");
        //how do you launch/open a web page?
        //by using get()-->provide url as String

       // System.out.println("Closing the browser");
      //  Thread.sleep(5000);
      //  driver.quit();
        //navigate().back

        //go to Google
        //go to Amazon.com
        //go back to Google
        driver.get("https://www.google.com");
        driver.manage().window().maximize();


        driver.navigate().to("https://www.amazon.com");

        driver.navigate().back();
        //navigate().forward()

        driver.navigate().forward();
        driver.navigate().refresh();
        String practiceWebUrl="https://www.etsy.com";

        driver.navigate().to(practiceWebUrl);
        driver.navigate().refresh();
        //close drive
        driver.close(); //-->close only one drive
       // driver.quit();  //-->close all the drivers


    }
}
