package com.qa.pages;
import com.qa.base.Testbase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import java .util.NoSuchElementException;
import java.time.Duration;
import org.openqa.selenium.WebElement;


public class AccountPage extends Testbase {
    WebDriverWait wait;
    //private WebDriver driver;

    //Initializing Page Object:
    public AccountPage() {
      //  this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        PageFactory.initElements(driver, this);
    }

    //Page Factory - OR:
    @FindBy(xpath = "//div[@class='container']//a[contains(text(),'Continue shopping')]")
    WebElement btnContinueShopping;

    public String getAccountPageTitle() {
        return driver.getTitle();
    }

    public ProductPage navigateToProducts() {
        // Define Fluent Wait
        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofSeconds(5))
                .ignoring(NoSuchElementException.class);
        WebElement continueShoppingButton = wait.until(ExpectedConditions.visibilityOf(btnContinueShopping));
        wait.until(ExpectedConditions.elementToBeClickable(continueShoppingButton)).click();

        // Return the new page object
        return new ProductPage();
    }
}