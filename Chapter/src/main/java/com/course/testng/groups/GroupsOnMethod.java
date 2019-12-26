package com.course.testng.groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

import java.security.acl.Group;

public class GroupsOnMethod {
    //分组测试
    @Test(groups = "server")
    public void test1() {
        System.out.println("这是服务端的方法11111");
    }

    @Test(groups = "server")
    public void test2() {
        System.out.println("这是服务端的方法222222");
    }

    @Test(groups = "client")
    public void test3() {
        System.out.println("这是客户端的方法333333");
    }

    @Test(groups = "client")
    public void test4() {
        System.out.println("这是客户端的方法4444444");
    }
    @BeforeGroups ("server")
    public void test5() {
        System.out.println("这是执行服务端方法之前的方法1");
    }
    @AfterGroups("server")
    public void test6() {
        System.out.println("这是执行服务端方法之后的方法1");
    }
    @BeforeGroups ("client")
    public void test7() {
        System.out.println("这是执行用户端方法之前的方法2");
    }
    @AfterGroups("client")
    public void test8() {
        System.out.println("这是执行用务端方法之后的方法2");
    }
}
