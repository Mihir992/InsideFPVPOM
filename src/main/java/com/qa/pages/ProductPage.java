package com.qa.pages;

import com.qa.base.Testbase;
import com.qa.util.Testutil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ProductPage extends Testbase {

    WebDriverWait wait;

    //Initializing Page Object:
    public ProductPage()
    {
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        PageFactory.initElements(driver,this);
    }

    public ProductDetailPage selectProduct() throws InterruptedException {
        // Get the product name from properties file
        String productName = prop.getProperty("productName");
        // Construct the XPath with the dynamic product name
        String xpathExpression = String.format("//div[contains(text(),'%s')]", productName);
        // Find the element using the dynamic XPath
        // Find the element using the dynamic XPath and wait until it is clickable
        WebElement productElement = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpathExpression)));
        // Perform actions on the element
        System.out.println("Product found: " + productElement.getText());
        Testutil.ScrollToElement(productElement);
        productElement.click();
        //Actions action = new Actions(driver);
        //action.moveToElement(imgProduct).click().perform();
        Thread.sleep(20000);// Add a brief pause to ensure the action completes before moving on
        return new ProductDetailPage();
    }
}
