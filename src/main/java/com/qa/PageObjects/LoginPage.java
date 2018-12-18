package com.qa.PageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPage {
    public WebDriver driver;

    public LoginPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(id="email")
    public WebElement userName;

    @FindBy(id="pass")
    public WebElement password;

    @FindBy(id="loginbutton")
    public WebElement loginButton;

    @FindBy(xpath="//a[text()='Home']")
    public WebElement lnkHome;

    public void login(String uname, String pass){
        userName.sendKeys(uname);
        password.sendKeys(pass);
        loginButton.click();
    }
    public void verifyLoginSuccessful(){
        Assert.assertTrue(lnkHome.isDisplayed());
    }

}
