package com.course.testng.groups;

import org.testng.annotations.Test;

@Test(groups = "stu")
public class groupsOnClass {
    //学生类
    public void  groupsOnClassStu1(){
        System.out.println("这是学生类的测试方法1");
    }
    public void  groupsOnClassStu2(){
        System.out.println("这是学生类的测试方法2");
    }
}
