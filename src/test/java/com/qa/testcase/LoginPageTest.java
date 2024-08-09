package com.qa.testcase;

import com.qa.base.Testbase;
import com.qa.pages.AccountPage;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginPageTest extends Testbase {

   // HomePage homepageobj;
    LoginPage loginpageobj;
    AccountPage accountpageobj;

    public LoginPageTest(){
        super();
    }

    @BeforeMethod
    public void setup(){
        initilization();
        loginpageobj = new LoginPage();
     //   homepageobj = new HomePage();
       // loginpageobj  = homepageobj.navigeToLoginPage();
    }

    @Test(priority = 1)
    public void verifyLoginPageTitleTest() throws InterruptedException {
        loginpageobj.verifyLoginTextTitle();
        Thread.sleep(5000);
    }

    @Test(priority = 2)
    public void doLoginPageTest() throws InterruptedException {
        accountpageobj = loginpageobj.doLogin();
    }

    @AfterMethod
    public void terminate(){
        driver.quit();
    }
}
