package com.qa.TestCases;

import com.qa.PageObjects.LoginPage;
import com.qa.SetUp.EnvSetUp;
import org.testng.annotations.Test;

public class LoginTest extends EnvSetUp {

    @Test
    public void InvalidUserNameInvalidPassword() throws InterruptedException {
        LoginPage lp = new LoginPage(driver);
        lp.login("xyz@gmail.com","xy@");
        Thread.sleep(30000);
        lp.verifyLoginSuccessful();
    }

}
