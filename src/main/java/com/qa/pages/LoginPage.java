package com.qa.pages;

import com.qa.base.Testbase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage extends Testbase {
    WebDriverWait wait;

    //Initializing Page Object:
    public LoginPage()
    {
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        PageFactory.initElements(driver,this);
    }

    //Page Factory - OR:

    @FindBy(xpath="//h1[contains(text(),'Login')]")
    WebElement lblLoginText;

    @FindBy(xpath="(//input[@type='email'])[1]")
    WebElement inputEmail;

    @FindBy(xpath="//input[@type='password']")
    WebElement inputPassword;

    @FindBy(xpath="//input[@type='password']")
    WebElement btnlogin;

    public boolean verifyLoginTextTitle(){
        return lblLoginText.isDisplayed();
    }

    public AccountPage doLogin(){
        inputEmail.click();
        inputEmail.sendKeys(prop.getProperty("username"));
        inputPassword.click();
        inputPassword.sendKeys(prop.getProperty("password"));
        btnlogin.click();

        // Create WebDriverWait instance
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // 10 seconds wait time

        return new AccountPage();
    }

}
