package com.cybertek.tests.day5.Xpath.important;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class XpathDynamicId {
    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("https://signon.strayer.edu/idp/SSO.saml2?SAMLRequest=fVJdTwIxEPwrl77fBw1y0AAJSowkKIRDH3wxtV2kSa%2Bt3Vbl31sOjfJC0qTpdGd2dtox8lY7NothbzbwHgFD9tVqg6y7mJDoDbMcFTLDW0AWBGtm90tGi4o5b4MVVpN%2FlMsMjgg%2BKGtItphPyMtwR6mkfQ4jTmvo1699UVM%2BGFR0VNU9GMmdqIeS1gJI9gQeE3NCklCiI0ZYGAzchARVtJ9XaV1tewNGh6xHn0k2T9Mow0PH2ofgkJUlqjdjTYHB8wP4AmQslXRl06yKo39KstmvyRtrMLbgG%2FAfSsDjZvknowRvXcQzHVSt03BUKVsro4bC7V3ZnfG005wL7FAJOx51yNGRbP2T47UyUpm3yxG%2BnoqQ3W2363y9arZkOj5qsy4SP73gcFz%2BLxyf3v4htVjM11YrcchurW95uOzgiCiZ77pSltQNKjAhBae1%2FbzxwANMSPARSDk9tTz%2FYdNv&RelayState=https%3A%2F%2Ficampus.strayer.edu%2Fsaml_login%3Fdestination%3D%252F");
        driver.findElement(By.xpath("//input[starts-with(@id,'username')]")).sendKeys("Dukala0518@gmail.com");
    }

}
