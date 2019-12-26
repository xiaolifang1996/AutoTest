package com.course.testng;

import org.testng.annotations.Test;

public class ExceptExceptionClass {
  @Test(expectedExceptions=RuntimeException.class)
    public  void ThroeEception1(){
        System.out.print("异常类运行成功了！！");
        throw  new RuntimeException();
    }
}
