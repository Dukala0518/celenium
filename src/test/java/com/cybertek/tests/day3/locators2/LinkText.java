package com.cybertek.tests.day3.locators2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkText {
    public static void main(String[] args) throws Exception {
        WebDriver driver=new ChromeDriver();
        //driver.get("https://www.amazon.com/dp/B0CC5WMQFH/ref=ods_gw_GW_US_EN_AUCC_AEA_APR24-EVG_H1_Y_C-3677/?_encoding=UTF8&pd_rd_w=CG6z9&content-id=amzn1.sym.311f215a-2f18-438e-84ff-7a032e10e906&pf_rd_p=311f215a-2f18-438e-84ff-7a032e10e906&pf_rd_r=RWMS9HG9D4RBQ1QQV5ZQ&pd_rd_wg=Q0pm3&pd_rd_r=9f6aa226-13e4-4a16-b3a1-834358576ab5");
       driver.get("https://signon.strayer.edu/idp/SSO.saml2?SAMLRequest=fVLRbsIgFP2Vhve2tlZniZo4zTITN411e9jLQttbJaHAuLDNvx%2FWLdMXExLC4Z5zzz0wRtYKTWfOHuQWPhygDb5bIZF2FxPijKSKIUcqWQtIbUWL2dOKplGPaqOsqpQgF5TbDIYIxnIlSbBcTMh7zUZVNhhkg7y8S2uWlP0my8uyD002HGQZY80oyYdJmvRJ8AoGPXNCvJCnIzpYSrRMWg%2F10izs%2BZXskpxmI9rL30iw8NNwyWzHOlirkcYx8r1UMkJr2BFMBLWLea3jolhHJ%2F8pCWZ%2FJudKomvBFGA%2BeQUv29W%2FDK9Yqx1e6SBvtYCTStyq2gmI9EHH3RnPexqyCju0hoY5YUPUJNj85njPZc3l%2FnaE5bkI6eNutwk362JHpuOTNu0iMdMbDsfxZeH4%2FPbPvsVysVGCV8fgQZmW2dsOTgivw6YrpV5dIgdpfXBCqK%2B5AWZhQqxxQOLpueX1D5v%2BAA%3D%3D&RelayState=https%3A%2F%2Ficampus.strayer.edu%2Fsaml_login%3Fdestination%3D%252F");

        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.findElement(By.linkText("Forgot Username?")).click();
        Thread.sleep(3000);
        driver.close();

    }
}
