package com.demo.day02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demo2 {

    @Test
    public void f() throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://mail.163.com/");
        Thread.sleep(4000);
        driver.quit();
    }
}
