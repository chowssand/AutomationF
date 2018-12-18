package com.qa.PageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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

    public void login(String uname, String pass){
        userName.sendKeys(uname);
        password.sendKeys(pass);
        loginButton.click();
    }

}
