package com.cybertek.tests.day4.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StrayerVeriftyText {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://signon.strayer.edu/idp/SSO.saml2?SAMLRequest=fVJdTwMhEPwrF97vs1V7pG1S2xibqG286oMvhoNtS8IBsuDHv5deNdaXJpsQhp3ZYWCMrFOWzoLf60d4C4A%2B%2BeyURtofTEhwmhqGEqlmHSD1nDaz%2BztaZQW1znjDjSInlPMMhgjOS6NJslxMyCsv22pwCaPyikHR1nVdcCFaPihHrYhVl8NBWw%2FqaihI8gwOI3NColCkIwZYavRM%2BwgV1TAtYlWb8oKWNR1evZBkEW8jNfM9a%2B%2B9RZrnKHfa6Ay9Y1%2FgMhAhl8LmTbPKDv4rksx%2BTc6NxtCBa8C9Sw5Pj3d%2FMpKzzgb8p4OyswoOKnlnRFCQ2b3N%2Bz0e1yplHHtUwJYF5VO0JFn%2F5HgttZB6dz7C9tiE9HazWafrVbMh0%2FFBm%2FaRuOkZh%2BP8tHF8fPuHOGK5WBsl%2BVdyY1zH%2FHkHB0SKdNu30qiuUYL2MTilzMfcAfMwId4FIPn0OPL%2FD5t%2BAw%3D%3D&RelayState=https%3A%2F%2Ficampus.strayer.edu%2Fsaml_login%3Fdestination%3D%252F");
       WebElement userName= driver.findElement(By.id("username"));
       userName.sendKeys("Dukala");
       WebElement passwordBox= driver.findElement(By.id("password"));
       passwordBox.sendKeys("Janjan2350");
       WebElement loginBox=driver.findElement(By.id("signOnButton"));
       loginBox.click();
       WebElement text=driver.findElement(By.xpath("//div[@class='ping-error']"));
       String actual=text.getText();
       String expected="We didn't recognize the username or password you entered. Please try again.";
       if(actual.equalsIgnoreCase(expected)){
           System.out.println("Pass");
       }else{
           System.out.println("Fail");
           System.out.println("Expected: "+expected);
           System.out.println("Actual: "+actual);
       }
       driver.close();
//



    }
}
