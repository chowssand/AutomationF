package com.qa.TestCases;

import com.qa.PageObjects.LoginPage;
import com.qa.SetUp.EnvSetUp;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends EnvSetUp {

    @Test
    public void LoginTOPage(){
        LoginPage lp = new LoginPage(driver);
        lp.login("xyz@gmail.com","xyz");
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
