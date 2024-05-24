package com.cybertek.tests.day14.webtables;

import com.cybertek.testBase.testBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class WebTable extends testBase {
    @Test
    public void test1() throws InterruptedException {
        driver.get("https://datatables.net");
        WebElement office=driver.findElement(By.xpath("(//span[@class='dt-column-title'])[9]"));
        driver.manage().window().maximize();
        System.out.println(office.getText());
        WebElement two=driver.findElement(By.xpath("//button[@class='dt-paging-button']"));
        two.click();
        Thread.sleep(3000);
        WebElement name=driver.findElement(By.xpath("(//td[@class='sorting_1 dtr-control'])[5]"));
        System.out.println(name.getText());
        List<WebElement> list=driver.findElements(By.tagName("th"));
        System.out.println(list.size());
        for (WebElement eachList:list){
            System.out.println(eachList.getText());
        }

    }
}
