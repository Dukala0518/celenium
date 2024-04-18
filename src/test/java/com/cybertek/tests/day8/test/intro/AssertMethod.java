package com.cybertek.tests.day8.test.intro;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

public class AssertMethod {
    @Test
    public void test1(){
        String expected="one";
        String actual="one";
        System.out.println("Test begins");
        Assert.assertEquals(actual,expected);
        Assert.assertEquals(1,1);
        Assert.assertEquals(true,true);
        System.out.println("Test is done");
    }
    @Test
    public void test2(){
        System.out.println("Test begins");
        String expected="one";
        String actual="two";
        Assert.assertEquals(actual,expected);
        System.out.println("Test is done");
    }
    @Test
    public void test3(){
        System.out.println("Test begins");
        String expected="one";
        String actual="two";
        Assert.assertNotEquals(actual,expected);
        System.out.println("Test is done");
    }
    @Test
    public void test4(){
        System.out.println("Test begins");
        String expected="one";
        String actual="one";
        Assert.assertTrue(expected.equals(actual));
        int a=20;
        int b=30;
        Assert.assertTrue(a<b);
        System.out.println("Test is done");
    }

}
