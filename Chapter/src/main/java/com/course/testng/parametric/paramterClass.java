package com.course.testng.parametric;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class paramterClass {
    //从xml配置文件获取参数
    @Test
    @Parameters({"name","age"})
    public void paramterFromXml(String name,int age){
        System.out.println("姓名是："+name+"------"+"年龄是："+age);
    }
}
