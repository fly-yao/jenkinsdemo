package com.demo.day02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demo1 {

   @Test
    public void f() throws InterruptedException {

       WebDriver driver=new ChromeDriver();
       driver.manage().window().maximize();
       driver.get("https://www.baidu.com/");
       Thread.sleep(2000);
       driver.quit();
    }


}
