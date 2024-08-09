package com.qa.base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import com.qa.util.Testutil;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class Testbase {

    public static WebDriver driver;
    public static Properties prop;

    public Testbase(){
        try{
            prop = new Properties();
            FileInputStream ip = new FileInputStream("C:\\Users\\admin\\eclipseworkspace\\InsideFPVEcom\\src\\main\\java\\com\\qa\\config\\config.properties");
            prop.load(ip);
        }
        catch(FileNotFoundException e) {
            e.printStackTrace();
        }
        catch(IOException e) {
            e.printStackTrace();
        }
    }

    public static void initilization() {

        String Browsers = prop.getProperty("browser");

        if(Browsers.equals("chrome")) {
            WebDriverManager.chromedriver().setup();
            ChromeOptions op = new ChromeOptions();
            op.addArguments("--disable-notifcations");
            op.addArguments("--disable-gpu");
            op.addArguments("--disable-extensions");
            op.addArguments("--no-sandbox");
            op.addArguments("--disable-dev-shm-usage");
            op.addArguments("--remote-allow-origins=*");
            driver = new ChromeDriver(op);
        }
        else if(Browsers.equals("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

       // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
      //  driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));

        driver.get(prop.getProperty("url"));
    }

}
