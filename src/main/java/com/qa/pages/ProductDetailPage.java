package com.qa.pages;

import com.qa.base.Testbase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ProductDetailPage extends Testbase {
    WebDriverWait wait;

    //Initializing Page Object:
    public ProductDetailPage()
    {
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        PageFactory.initElements(driver,this);
    }

    //Page Factory - OR:
    @FindBy(xpath="//button[@aria-label='Increase quantity']")
    WebElement btnPlus;

    @FindBy(xpath="//button[@aria-label='Decrease quantity']")
    WebElement btnMinus;

    @FindBy(xpath="//input[@class='quantity-selector__input']")
    WebElement qty;

    @FindBy(xpath="(//div[contains(text(),'Add to cart')])[1]")
    WebElement addToCartbtnText;

    @FindBy(xpath="//span[contains(text(),'BUY NOW')]")
    WebElement buynowbtnText;

    @FindBy(xpath="//span[contains(text(),'Shipping & Delivery')]")
    WebElement shippingtext;

    public void getProductNameText(){
        try {
            WebElement productNameElement = wait.until(
                    ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[@class='product-info__title h2']"))
            );

            String productName = productNameElement.getText();
            System.out.println("Product Name: " + productName);

        } catch(Exception e){
            e.printStackTrace();
        }
    }

    public void getProductPrice(){
        try {
            WebElement productPriceElement = wait.until(
                    ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='product-info__price']"))
            );

            String productPrice = productPriceElement.getText();
            System.out.println("Product Price: " + productPrice);

        } catch(Exception e){
            e.printStackTrace();
        }
    }

    public void clickOnPlusButton(){
        btnPlus.click();
        String count = qty.getText();
        System.out.println("Quantity Count:"+ count);
    }

    public void clickOnMinusButton(){
        btnMinus.click();
        String count = qty.getText();
        System.out.println("Quantity Count:"+ count);
    }

    public boolean verifyAddtoCartButtonTextDisplay(){
        return addToCartbtnText.isDisplayed();
    }

    public boolean verifyBuyNowButtonTextDisplay(){
        return buynowbtnText.isDisplayed();
    }

    public boolean verifyShippingTextDisplay(){
        return shippingtext.isDisplayed();
    }

    public void clickOnAddToCartButton(){
        addToCartbtnText.click();
    }
}
