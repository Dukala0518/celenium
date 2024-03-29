package com.cybertek.tests.day2.locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class login {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        //open Strayer login page
        driver.get("https://signon.strayer.edu/idp/SSO.saml2?SAMLRequest=fVJRb8IgGPwrDe9tLRqbEjVxmmUmbprV7WEvC9KvSkKB8cE2%2F%2F1qu2X64hPhuLvvOJggb5Rl8%2BCP%2Bhk%2BAqCPvhulkXUHUxKcZoajRKZ5A8i8YOX8cc1oMmDWGW%2BEUeRCclvBEcF5aTSJVsspeRejYcaB7mlW8zwX9Sinw3ooRgWFIi9EXeV7TsdUFGMSvYLDVjklrVErRwyw0ui59i00oKN4MIxpscsoyzKW0TcSLdvbSM19pzp6b5GlKcqDNjpB7%2FgJXAJVSGVl07LcJOf8lETzv5ALozE04Epwn1LAy%2FP630YK3tiAVz4oG6vg7JI2pgoKEnu0abfHfqUxF9ihFdQ8KB%2BjJdH2t8c7qSupD7cr3PckZA%2B73TbebsodmU3O3qyrxM1uJJykl8RJ%2F%2FZP7YjVcmuUFKfo3riG%2B9sJzois4rqjstZdowTt2%2BKUMl8LB9zDlHgXgKSzfuT1D5v9AA%3D%3D&RelayState=https%3A%2F%2Ficampus.strayer.edu%2Fsaml_login%3Fdestination%3D%252F");
       //verify user is on the right page
       // String expectedTitle="https://signon.strayer.edu/idp/SSO.saml2?SAMLRequest=fVJRb8IgGPwrDe9tLRqbEjVxmmUmbprV7WEvC9KvSkKB8cE2%2F%2F1qu2X64hPhuLvvOJggb5Rl8%2BCP%2Bhk%2BAqCPvhulkXUHUxKcZoajRKZ5A8i8YOX8cc1oMmDWGW%2BEUeRCclvBEcF5aTSJVsspeRejYcaB7mlW8zwX9Sinw3ooRgWFIi9EXeV7TsdUFGMSvYLDVjklrVErRwyw0ui59i00oKN4MIxpscsoyzKW0TcSLdvbSM19pzp6b5GlKcqDNjpB7%2FgJXAJVSGVl07LcJOf8lETzv5ALozE04Epwn1LAy%2FP630YK3tiAVz4oG6vg7JI2pgoKEnu0abfHfqUxF9ihFdQ8KB%2BjJdH2t8c7qSupD7cr3PckZA%2B73TbebsodmU3O3qyrxM1uJJykl8RJ%2F%2FZP7YjVcmuUFKfo3riG%2B9sJzois4rqjstZdowTt2%2BKUMl8LB9zDlHgXgKSzfuT1D5v9AA%3D%3D&RelayState=https%3A%2F%2Ficampus.strayer.edu%2Fsaml_login%3Fdestination%3D%252F";
        String expectedTitle="Strayer | Login";
        String actualTitle= driver.getTitle();
        if(expectedTitle.equalsIgnoreCase(actualTitle)){
            System.out.println("Pass");
        }else{
            System.out.println("Fail");
            System.out.println("Expected URL: "+expectedTitle);
            System.out.println("Actual URL: "+actualTitle);
        }
        //find login button put email address
         driver.findElement(By.id("username")).sendKeys("Dukala0518@gmail.com");
         //find password button and put password
         driver.findElement(By.id("password")).sendKeys("Janjan2350");
         //find login button and click
         driver.findElement(By.id("signOnButton")).click();
         //Verify user is on the right page



    }
}
