package com.course.testng.groups;

import org.testng.annotations.Test;

@Test(groups = "teacherv")
public class groupsOnClass3 {
    //教师类
    public void  groupsOnClassTeacher1(){
        System.out.println("这是教师类的测试方法111");
    }
    public void  groupsOnTeacher2(){
        System.out.println("这是教师类的测试方法222");
    }
}
