package com.qa.pages;

import com.qa.base.Testbase;
import com.qa.util.Testutil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage extends Testbase {

    WebDriverWait wait;

    //Initializing Page Object:
    public HomePage()
    {
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        PageFactory.initElements(driver,this);
    }

    //Page Factory - OR:
    @FindBy(xpath="//img[@class='header__logo-image']")
    WebElement headerLogoImage;

    @FindBy(xpath="//div[@class='header__main-nav']")
    WebElement headermainnav;

    @FindBy(xpath="(//a[@aria-controls='search-drawer'])[2]")
    WebElement searchIcon;

    @FindBy(xpath="(//a[@aria-controls='cart-drawer'])")
    WebElement cartIcon;

    @FindBy(xpath="//a[@class='hidden tap-area sm:block'][2]")
    WebElement accountIcon;

    @FindBy(xpath="//a[@class='slideshow__slide']")
    WebElement bannerImage;

    @FindBy(xpath="(//div[contains(text(),'Our customer support is available ')][1])")
    WebElement homecontent;

    @FindBy(xpath="//div[@class='footer']")
    WebElement footer;

    /*public String getHomePageTitle(){
        return driver.getTitle();
    }

    public boolean verifyheaderLogo(){
        return headerLogoImage.isDisplayed();
    }

    public boolean verifyheadermainnav(){
        return headermainnav.isDisplayed();
    }

    public boolean verifySearchIcon(){
        return searchIcon.isDisplayed();
    }

    public boolean verifyCartIcon(){
        return cartIcon.isDisplayed();
    }

    public boolean verifyAccountIcon(){
        return accountIcon.isDisplayed();
    }

    public boolean verifybannerImage(){
        return bannerImage.isDisplayed();
    }

    public boolean verifyhomecontent(){
        Testutil.ScrollToElement(homecontent);
        return homecontent.isDisplayed();
    }

    public boolean verifyfooter(){
        Testutil.ScrollToElement(footer);
        return footer.isDisplayed();
    }*/
    public LoginPage navigeToLoginPage(){
        accountIcon.click();
        return new LoginPage();
    }

}
