package com.cybertek.tests.day10.dropdownlist;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.time.LocalDate;
import java.util.List;

public class localDate {
        WebDriver driver;

        @BeforeMethod
        public void beforeMethod() {
            driver = new ChromeDriver();
            driver.get("https://designsystem.digital.gov/components/select/");
        }
        @Test
        public void test1() {
            String local = LocalDate.now().getMonth().name();
            System.out.println(local);
        }
        @AfterMethod
        public void afterMethod() {
            driver.quit();
        }

    }



