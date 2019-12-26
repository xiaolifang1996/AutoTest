package com.course.testng;

import org.testng.annotations.*;

public class basicAnnotation {
   @Test
    public   void  teseCase(){
    //这是最基础的注解，用来把方法标记为测试的一部分
        System.out.println("这是第一个测试用例");
    }
    //在执行前的方法
    @BeforeMethod
    public void testCase2(){
        System.out.println("在执行测试用例前执行的方法");
    }
    //执行后的方法
    @AfterMethod
    public void testCase3(){
        System.out.println("在执行测试用例后执行的方法");
    }
    @Test
    public  void testCase4(){
        System.out.println("这是第二个测试用例");
    }
    @BeforeClass
    public void testCase5(){
        System.out.println("这是测试用例执行前执行的类");
    }
    @AfterClass
    public void testCase6(){
        System.out.println("这是测试用例执行后的类");
    }
    @BeforeSuite
    public  void testCase7(){
       System.out.println("这是BeforeSuite测试套件");
    }
    @AfterSuite
    public  void testCase8(){
        System.out.println("这是AfterSuite测试套件");
    }
}
