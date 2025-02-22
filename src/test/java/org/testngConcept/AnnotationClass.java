package org.testngConcept;

import org.testng.annotations.*;

public class AnnotationClass {

    @BeforeSuite
    public void beforeSuiteMethod(){
        System.out.println("Before Suite gets executed");
    }

    @BeforeClass
    public void beforeClassMethod(){
        System.out.println("Before class gets executed");
    }

    @BeforeTest
    public void beforeTestSuiteMethod(){
        System.out.println("Before Test Suite Gets triggered");
    }

    @BeforeMethod
    public void beforeTestMethod(){
        System.out.println("Before test execution this method is triggered");
    }

    @Test(groups = {"Sanity"}, priority = 2)
    public void testOne(){
        System.out.println("Test One execution is happening");
    }

    @Test(groups = {"Regression"}, priority = 1)
    public void testTwo(){
        System.out.println("Test two execution is happening");
    }

    @AfterSuite
    public void afterSuiteMethod()
    {
        System.out.println("After suite is getting tiggered");
    }

    @AfterTest
    public void afterTestSuiteMethod(){
        System.out.println("After test suite method gets triggered");
    }

    @AfterClass
    public void afterClassMethod(){
        System.out.println("After class method gets triggered");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("After test Method gets triggered");
    }
}

