package com.course.testng.MulityThread;

import org.testng.annotations.Test;

public class MulityThreadFromXml {
    @Test
    public void test1(){
        System.out.printf("test1当前执行的线程id是: %s%n",+Thread.currentThread().getId());
    }
    @Test
    public void test2(){
        System.out.printf("test2当前执行的线程id是: %s%n",+Thread.currentThread().getId());
    }
    @Test
    public void test3(){
        System.out.printf("test3当前执行的线程id是: %s%n",+Thread.currentThread().getId());
    }
}
