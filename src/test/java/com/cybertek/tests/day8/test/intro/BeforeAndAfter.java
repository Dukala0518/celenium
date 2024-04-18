package com.cybertek.tests.day8.test.intro;

import org.bouncycastle.pqc.crypto.newhope.NHOtherInfoGenerator;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class BeforeAndAfter {
    @BeforeMethod
    public void beforemethod(){
        System.out.println("Before method");
    }
    @Test
    public  void test1(){
        System.out.println("Test 1");
    }
    @Test
    public void test2(){
        System.out.println("Test 2");

    }
    @AfterMethod
     public void afterMethod(){
        System.out.println("After method");
    }

}
