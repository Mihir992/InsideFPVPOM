package com.qa.testcase;

import com.qa.base.Testbase;
import com.qa.pages.ProductDetailPage;
import com.qa.pages.ProductPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ProductDetailPageTest extends Testbase {

    ProductPage productpageobj;
    ProductDetailPage productDetailPageobj;


    public ProductDetailPageTest() {
        super();
    }

    @BeforeMethod
    public void setup() throws InterruptedException {
        initilization();
        productDetailPageobj = new ProductDetailPage();
        productDetailPageobj = productpageobj.selectProduct();
    }

    @Test(priority = 1)
    public void getProductNameTextTest() {
        productDetailPageobj.getProductNameText();
    }

    @Test(priority = 2)
    public void getProductPriceTest() {
        productDetailPageobj.getProductPrice();
    }

    @Test(priority = 3)
    public void verifyAddtoCartButtonTextDisplayTest() {
        productDetailPageobj.verifyAddtoCartButtonTextDisplay();
    }

    @Test(priority = 4)
    public void verifyBuyNowButtonTextDisplayTest() {
        productDetailPageobj.verifyBuyNowButtonTextDisplay();
    }

    @Test(priority = 5)
    public void verifyShippingTextDisplayTest() {
        productDetailPageobj.verifyShippingTextDisplay();
    }

    @Test(priority = 6)
    public void verifyAddToCartTest() {
        productDetailPageobj.clickOnPlusButton();
        productDetailPageobj.clickOnAddToCartButton();
    }

    @AfterMethod
    public void terminate(){
        driver.quit();
    }
}
