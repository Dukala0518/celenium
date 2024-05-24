package com.cybertek.tests.QA;

public class QA {
    /*
   TODO why we get no such element exception?
    1.wrong locator
    2.wait
    3.iframe
    *******
    WHAT ARE WAIT COMMANDS IN SELENIUM?
    Selenium  wait commands TELL THE DRIVER( test execution)to pause for a certain length of time
    before moving onto the next step.
    Specially when you are work on dynamic webpage, it is common to get the message “Element Not Visible Exception“.
    In order to prevent this Exception, we use Selenium Wait Commands.
    There are three types of waits in Seliunium.
    Implicit wait, explicit wait, and fluent wait.
    Also there is wait thread.sleep.
    ABOUT IMPLICIT WAIT -----> driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
    When we set implicit wait, driver will not immediate NoSuchElementException when it can not find
    an element.It will try to find element for given duration.
    Implicit wait stops waiting when condition is fulfilled, which is locator finds an wanted element.
    Explicit Wait
    It allows you to wait for specific conditions to be met,
    such as an element is visible on the web page, before performing further actions.
    Unlike Implicit Waits, which wait for a certain amount of time before throwing an exception
    if the condition is not met,
    Explicit Waits wait only as long as required for a specified condition to be true.
    Fluent Wait in Selenium
    Fluent Wait in Selenium marks the maximum amount of time for Selenium WebDriver to wait for a
    certain condition (web element) becomes visible. It also defines how frequently WebDriver will
    check if the condition appears before throwing the “ElementNotVisibleException”.
    To put it simply, Fluent Wait looks for a web element repeatedly at regular intervals
    until timeout happens or until the object is found.
    Fluent Wait commands are most useful when interacting with web elements that can
    take longer durations to load. This is something that often occurs in Ajax applications.
    While using Fluent Wait, it is possible to set a default polling period as needed.
    The user can configure the wait to ignore any exceptions during the polling period.
    Fluent waits are also sometimes called smart waits because they don’t wait out
    the entire duration defined in the code. Instead, the test continues to execute as soon
    as the element is detected – as soon as the condition specified in .until(YourCondition) method becomes true.
    Fluent Wait Syntax

    TODO What is test base?

    TEST BASE is a class that will contain all the common variables and methods to our tests.
    Other tests access the variables test base by extending it

    TODO What is property file and configuration.property?
    The property file is configuration file that store configurations and parameters that can be used by selenium
     tests.Mostly it has .properties extensions and contains in key-value pairs. Using property file
     helps to modify test configuration without breaking every code.  Basically it helps to manage and maintain
      configuration details separately from the test codes.

    TODO What is singleton design patter?

    TODO How do you do multi-browser testing in your framework?  Which browser you can test?
    To control browser type, we use user properties.You can change browser type in properties file, it
    affects all my codes in classes.
    TODO What are packages did you create?
   1. utility package
   we can call it statically, we call occasionally we call them
   2.testBase
   Test base is a class that will contain all the common variables and methods to our tests.
   Other tests access the variables test base by extending it
   TODO What is selenium?
   Selenium is a tool for automating everything you can do inside a web browser.
   It automates functional aspects of web-based applications and can run across all browsers and platforms.







    */




}
