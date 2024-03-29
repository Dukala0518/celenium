package com.cybertek.tests.day2.locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElement {
    public static void main(String[] args) throws Exception{
        WebDriver driver=new ChromeDriver();
        //1.go to amazon.com page
        driver.get("https://www.amazon.com/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2F%3Fref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=usflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");


        /*
        <input type="email" maxlength="128"
        id="ap_email" name="email" tabindex="1"
        class="a-input-text a-span12 auth-autofocus auth-required-field">

        */
        //2.write email to the text box
            //----
        WebElement emailBox=driver.findElement(By.id("ap_email"));
        emailBox.sendKeys("Dukala0518@gmail.com");


    }
}
