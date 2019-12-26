package com.course.testng.suite;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class SuiteConfig {
    //套件测试
    @BeforeSuite
    public  void beforeSuite(){
        System.out.println("这是beforeSuite套件");
    }
    @AfterSuite
    public  void afterSuite(){
        System.out.println("这是afterSuite套件");
    }
    @BeforeTest
    public void beforeTest(){
        System.out.println("beforeTest");
    }
    @AfterTest
    public void afterTest(){
        System.out.println("afterTest");
    }
}
