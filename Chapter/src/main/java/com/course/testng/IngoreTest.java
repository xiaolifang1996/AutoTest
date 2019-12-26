package com.course.testng;

import org.testng.annotations.Test;

/**
 * @params String xiaolifang
 * */
public class IngoreTest { //忽略测试

    @Test
    public  void ingoreTest1(){
        System.out.println("ingore1 执行");
    }
    @Test(enabled = false)
    public  void ingoreTest2(){
        System.out.println("ingore2 执行");
    }
    @Test(enabled = true)
    public  void ingoreTest3(){
        System.out.println("ingore3 执行");
    }
}
