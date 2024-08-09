/*package com.qa.testcase;

import com.qa.base.Testbase;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import com.qa.util.Testutil;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageTest extends Testbase {

    HomePage homepageobj;
    LoginPage loginpageobj;

    public HomePageTest(){
        super();
    }

    @BeforeMethod
    public void setup(){
        initilization();
        homepageobj = new HomePage();
    }

    /*@Test(priority = 1)
    public void verifyHomePageTitleTest(){
        String title = homepageobj.getHomePageTitle();
        Assert.assertEquals(title,"InsideFPV | India's Leading Drone Manufacturer | Best Drones in India",
                "Title not mached");
    }

    @Test(priority = 2)
    public void verifyheaderLogoTest(){
         boolean logo = homepageobj.verifyheaderLogo();
         Assert.assertTrue(logo,"Not Display");
    }

    @Test(priority = 3)
    public void verifyheadermainnavTest(){
        boolean headerNav = homepageobj.verifyheadermainnav();
        Assert.assertTrue(headerNav,"Not Displaying header naviagtion menu");
    }

    @Test(priority = 4)
    public void verifySearchIconTest(){
        boolean searchIcon = homepageobj.verifySearchIcon();
        Assert.assertTrue(searchIcon,"Search Icon Not Displaying to user");
    }
    @Test(priority = 5)
    public void verifyCartIconTest(){
        boolean cartIcon = homepageobj.verifyCartIcon();
        Assert.assertTrue(cartIcon,"Cart Icon Not Displaying");
    }

    @Test(priority = 6)
    public void verifyAccountIconTest(){
        boolean accountIcon = homepageobj.verifyAccountIcon();
        Assert.assertTrue(accountIcon,"Account Icon Not Displaying");
    }

    @Test(priority = 7)
    public void verifybannerImageTest(){
        boolean bannerImage = homepageobj.verifybannerImage();
        Assert.assertTrue(bannerImage,"Banner Image Not Displaying");
    }

    @Test(priority = 8)
    public void verifyhomecontentTest(){
        boolean homeContent = homepageobj.verifyhomecontent();
        Assert.assertTrue(homeContent,"Home Content Not Displaying");
    }

    @Test(priority = 9)
    public void verifyfooterTest(){
        boolean footer = homepageobj.verifyfooter();
        Assert.assertTrue(footer,"footer Not Displaying");
    }*/

    /*@Test(priority = 1)
    public void navigateToLoginPageTest(){
       loginpageobj  = homepageobj.navigeToLoginPage();
    }

    @AfterMethod
    public void terminate(){
        driver.quit();
    }
}*/
