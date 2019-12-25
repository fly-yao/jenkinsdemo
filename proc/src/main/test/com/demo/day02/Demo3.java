package com.demo.day02;

import org.testng.annotations.*;

public class Demo3 {
    @BeforeClass
    public void beforeClass() throws InterruptedException {
        Thread.sleep(2000);
        System.out.println(1);
    }
    @BeforeMethod
    public void beforeMethod() throws InterruptedException {
        Thread.sleep(2000);
        System.out.println(2);
    }
    @Test
    public void f() throws InterruptedException {
        Thread.sleep(2000);
        System.out.println(3);
    }
    @AfterClass
    public void afterClass() throws InterruptedException {
        Thread.sleep(2000);
        System.out.println(4);
    }
    @AfterMethod
    public void afterMrthod() throws InterruptedException {
        Thread.sleep(200);
        System.out.println(5);
    }
}
