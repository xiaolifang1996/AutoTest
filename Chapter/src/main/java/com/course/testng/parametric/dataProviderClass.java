package com.course.testng.parametric;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class dataProviderClass {
    @Test(dataProvider = "data")
    public void getParameter(String name, int age){
        System.out.println(name+"享年"+age);
    }
    @DataProvider(name = "data")
    public Object[][] trasimicParameter(){
        Object[][] objects = new Object[][]{
                {"佘强",29},
                {"章贤佑",26}
        };
        return objects;
    }
    @Test(dataProvider = "methodData")
    public void test1(String bookName,double price){
        System.out.println("这本书叫:"+bookName+"价格是:"+price);

    }
    @Test(dataProvider = "methodData")
    public void test2(String bookName,double price){
        System.out.println("这本书叫:"+bookName+"价格是:"+price);

    }
    @Test(dataProvider = "methodData")
    public void test3(String bookName,double price){
        System.out.println("这本书叫:"+bookName+"价格是:"+price);

    }
    //往不同的方法中传值，利用一个方法

    @DataProvider(name = "methodData")
    public Object[][] trasmicData(Method method){
        Object[][] obj = null;
        if(method.getName().equals("test1")){
            obj = new Object[][]{
                    {"失格人间",25.23},
                    {"十宗罪",45.00},
                    {"傲慢与偏见",12.56}
            };
        }else{
            obj = new Object[][]{{"失格人间",25.23},
                    {"十宗罪",45.00},
                    {"小王子",28.8}

            };
        }

        return obj;
    }

}
