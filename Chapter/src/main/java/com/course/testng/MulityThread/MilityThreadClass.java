package com.course.testng.MulityThread;

import org.testng.annotations.Test;

public class MilityThreadClass {

    @Test(invocationCount = 5,threadPoolSize =4)
    public void getMuliytThread(){
        System.out.printf("当前执行的线程id 是：%s%n",+Thread.currentThread().getId());
    }
}
