package com.cybertek.tests.day6.csslocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByAttributesValues {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://signon.strayer.edu/idp/SSO.saml2?SAMLRequest=fVJdTwIxEPwrl77fHVzuEBsgQYmRxA%2FioQ%2B%2BmKVdpEmvrd3Wj39vOTTKC8kmTac7s9NpJwSddnwew8484FtECtlnpw3x%2FmDKojfcAiniBjokHgRv57c3vCoG3HkbrLCa%2FaOcZgAR%2BqCsYdlyMWUvQ6wAoa6aqh5ALRDPBYxxez4ayqYZbZqx3JydbQXImmVP6CkxpywJJTpRxKWhACYkaFDV%2BSDVeD1s%2BHCU6plli3QbZSD0rF0IjnhZkno11hQUPHyhL1DGUklXtu19sfdfsWz%2Ba%2FLSGood%2Bhb9uxL4%2BHDzJ6MEdC7SkQ6pzmncq5SdlVFj4Xau7Pd0WKscBPWoxC1EHXJyLFv95HihjFTm9XSEm0MT8ev1epWv7ts1m0322ryPxM9OOJyU%2Fxsnh7e%2FSyOWi5XVSnxlV9Z3EE472CNK5tu%2BlSd1QwpNSMFpbT8uPULAKQs%2BIitnh5HHP2z2DQ%3D%3D&RelayState=https%3A%2F%2Ficampus.strayer.edu%2Fsaml_login%3Fdestination%3D%252F");
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Dukala");
        driver.findElement(By.cssSelector("input[id='password']")).sendKeys("Janjan");


    }


}
