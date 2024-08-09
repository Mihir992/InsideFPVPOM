package com.qa.util;

import com.qa.base.Testbase;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

public class Testutil extends Testbase {

    public static void waitForElement(WebElement e){
        FluentWait wait = new FluentWait(driver);
        //Specify the timout of the wait
        wait.withTimeout(Duration.ofSeconds(10));
        //Sepcify polling time
        wait.pollingEvery(Duration.ofSeconds(2));
        //Specify what exceptions to ignore
       wait.ignoring(NoSuchElementException.class);

        //This is how we specify the condition to wait on.
        //This is what we will explore more in this chapter
        wait.until(ExpectedConditions.visibilityOf(e));
    }

    public static void ScrollToElement(WebElement e){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);",e);
    }

    public static void captureScreenshot(WebDriver driver,String testName,String methodName) throws IOException {
        File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        System.out.println(source);
        // Format the filename to include a timestamp and test name
        String timestamp = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
        File destination = new File("C:\\Users\\admin\\eclipseworkspace\\InsideFPVEcom\\Screenshots\\"
                         + testName + "_" +
                        methodName + "_" +
                        timestamp + ".png");
        FileUtils.copyFile(source,destination);
        System.out.println("Screenshot saved as: " + destination.getAbsolutePath());
    }
}
