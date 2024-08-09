package com.qa.testcase;

import com.qa.base.Testbase;
import com.qa.pages.AccountPage;
import com.qa.pages.LoginPage;
import com.qa.pages.ProductDetailPage;
import com.qa.pages.ProductPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ProductPageTest extends Testbase {
    AccountPage accountpageobj;
    ProductPage productpageobj;
    ProductDetailPage productDetailPageobj;

    public ProductPageTest() {
        super();
    }

@BeforeMethod
public void setup() {
    initilization();
    productpageobj = new ProductPage();
    productpageobj = accountpageobj.navigateToProducts();
}

@Test
public void selectProductTest() throws InterruptedException {
    productDetailPageobj = productpageobj.selectProduct();
}
@AfterMethod
public void terminate(){
    driver.quit();
}
}