package com.cybertek.tests.day8.test.intro;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class FirstTestNGTest {
    @Test
public void test1(){
        System.out.println("test 1");
    }
    @Ignore
    @Test
    public void test2(){
        System.out.println("test 2");
    }
}
