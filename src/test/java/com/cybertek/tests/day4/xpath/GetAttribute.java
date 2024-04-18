package com.cybertek.tests.day4.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttribute {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://signon.strayer.edu/idp/SSO.saml2?SAMLRequest=fVJNbwIhFPwrG%2B77Ude6K1ETq2lqYqtxbQ%2B9NAivSsIC5UFb%2F31xbdP2YkICDG%2FmDQMjZK2ydBr8QW%2FgLQD65LNVGml3MCbBaWoYSqSatYDUc9pM75e0lxXUOuMNN4r8oVxmMERwXhpNksV8TF6q61IMK15XZb0TdQ27Pr%2BqhIjrCviQl3W16w8GYihKkjyBw8gckygU6YgBFho90z5CRa%2BfFnGU26trWhS0qJ9JMo%2B3kZr5jnXw3iLNc5R7bXSG3rEjuAxEyKWwedOsspP%2FHkmmPyZnRmNowTXg3iWHx83yV0Zy1tqA%2F3RQtlbBSSVvjQgKMnuwebfH89xLGccOFfDKgvIpWpKsv3O8kVpIvb8c4e5chPRuu12n61WzJZPRSZt2kbjJBYej%2FG%2Fh6Pz2D7HFYr42SvJjcmtcy%2FxlBydEivS1K6VRXaME7WNwSpmPmQPmYUy8C0Dyybnl%2Fx82%2BQI%3D&RelayState=https%3A%2F%2Ficampus.strayer.edu%2Fsaml_login%3Fdestination%3D%252F");
        WebElement loginButton=driver.findElement(By.id("signOnButton"));
       String typeAttributeValue= loginButton.getAttribute("Type");
       String idAttributeValue=loginButton.getAttribute("ID");
       String classAttributeValue=loginButton.getAttribute("class");
       String titleAttributeValue=loginButton.getAttribute("title");
        System.out.println(typeAttributeValue);
        System.out.println(idAttributeValue);
        System.out.println(classAttributeValue);
        System.out.println(titleAttributeValue);



    }
}
