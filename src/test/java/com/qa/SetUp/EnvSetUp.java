package com.qa.SetUp;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

public class EnvSetUp {
    /* This is the place i need to create a browser instance using webdriver
        and maximize the window, some implicit waits and this driver instance needs to be passed for
        execution of test cases
     */

    public static WebDriver driver;

    @BeforeTest
    //Ideal place to perform some setup which is shared among all tests.
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","C:/chromedriver.exe");
        //Create a new ChromeDriver
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://www.facebook.com/");
    }
    @AfterTest
    public void tearDown(){
        driver.quit();
    }
}
