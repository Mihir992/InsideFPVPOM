package com.qa.util;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class ITestListenerClass implements ITestListener  {

    private WebDriver driver; // Ensure this is properly initialized elsewhere

    @Override
    public void onTestFailure(ITestResult result) {
        try {
            // Capture screenshot on test failure with testName and methodName
            Testutil.captureScreenshot(driver,
                    result.getTestClass().getName(),
                    result.getMethod().getMethodName() + "_FAIL");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        try {
            // Capture screenshot on test failure with testName and methodName
            Testutil.captureScreenshot(driver,
                    result.getTestClass().getName(),
                    result.getMethod().getMethodName() + "_PASS");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        // Optional: Capture screenshots for skipped tests if needed
        // Log details about the skipped test
        String testClassName = result.getTestClass().getName();
        String methodName = result.getMethod().getMethodName();
        System.out.println("Test skipped: " + testClassName + "." + methodName);
        // Additional logging if needed
        Throwable throwable = result.getThrowable();
        if (throwable != null) {
            System.out.println("Reason for skipping: " + throwable.getMessage());
        }
    }

    // Other overridden methods
    @Override
    public void onTestStart(ITestResult result) {
    }

    @Override
    public void onStart(ITestContext context) { }

    @Override
    public void onFinish(ITestContext context) { }
}