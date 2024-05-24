package com.cybertek.tests.day13.test.baseclass.properties;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.util.Properties;

public class propertiesExample {
    WebDriver driver= WebDriverFactory.getDriver("chrome");
    @Test
    public void test1(){
        System.out.println(System.getProperty("os.name"));
        System.out.println(System.getProperty("os.version"));
        System.out.println(System.getProperty("user.home"));
        System.out.println(System.getProperty("user.name"));
       //PROPERTIES IS A CLASS FROM JAVA THAT SAVES KEY AND VALUE COMBINATION.
        Properties properties=new Properties();
        properties.setProperty("browser","chrome");
        properties.setProperty("url","//http:ebay.com");
        String browser=properties.getProperty("browser");
        System.out.println(browser);
       // String pUrl= ConfigurationReader.getProperty("url");
        //System.out.println(pUrl);

    }



    }

