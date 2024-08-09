package com.qa.testcase;

import com.qa.base.Testbase;
import com.qa.pages.AccountPage;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import com.qa.pages.ProductPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AccountPageTest extends Testbase {

    LoginPage loginpageobj;
    AccountPage accountpageobj;
    ProductPage productpageobj;

    public AccountPageTest() {
        super();
    }

    @BeforeMethod
    public void setup() {
        initilization();
        loginpageobj = new LoginPage();
       // accountpageobj = new AccountPage();
        accountpageobj = loginpageobj.doLogin();
    }

    @Test(priority = 1)
    public void verifyAccountPageTitleTest() throws InterruptedException {
        String title = accountpageobj.getAccountPageTitle();
        Assert.assertEquals(title, "Account",
                "Title not matched");
        Thread.sleep(5000);
    }

    @Test(priority = 2)
    public void navigateToProductsTest() {
        productpageobj = accountpageobj.navigateToProducts();
    }

    @AfterMethod
    public void terminate(){
        driver.quit();
    }
}