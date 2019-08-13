package com.course.testng;

import org.testng.annotations.Test;

public class basicAnnotation {
    @Test
    public   void  teseCase(){
    //这是最基础的注解，用来把方法标记为测试的一部分
        System.out.print("这是第一个测试用例");
    }

}
