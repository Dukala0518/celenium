package com.cybertek.tests.day3.locators2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginVerify {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        //verify top deal is represented on the home page
        //1.open amazon home page
        driver.get("https://www.amazon.com/b/?_encoding=UTF8&node=71069091011&pd_rd_w=5haYz&content-id=amzn1.sym.91b933ef-dfa9-49be-a13c-a1cf5303524f&pf_rd_p=91b933ef-dfa9-49be-a13c-a1cf5303524f&pf_rd_r=JSAQ41WM61H2CXNB6VBF&pd_rd_wg=QvCtv&pd_rd_r=b0935544-1ef9-4417-82c4-00ad0c207906");
        //2.find Top Deal text and store in to topDealText variable
        WebElement topDealText=driver.findElement(By.tagName("h1"));
        //3.Declare expected topDealText in String
        String expected="Shop by category";
        //4. Convert topDealText WebElement to String and store it in actual variable
        String actual=topDealText.getText();
        System.out.println(actual);
        //5.compare them using if statement
        if(expected.equalsIgnoreCase(actual)){
            System.out.println("Pass");
        }else{
            System.out.println("Fail");
            System.out.println("Expected: "+expected);
            System.out.println("Actual: "+actual);
        }
        //6.Close page
        //driver.close();



        //<h2 class="a-color-base headline truncate-1line gwm-u-blackjack-typography">Top Deal</h2>











    }
}
