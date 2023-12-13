package Utilies;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.bouncycastle.jcajce.provider.asymmetric.ec.KeyPairGeneratorSpi;
import org.jetbrains.annotations.NotNull;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.*;

import java.time.Duration;

public class HelperClass {
    private static HelperClass helperClass;
    private static WebDriver driver;

    private HelperClass() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
    }

    public static void openPage(@NotNull String url) { driver.get(url);}

    public static WebDriver getDriver() {
        return driver;
    }

    public static void setUpDriver() {
        if (helperClass==null) {helperClass = new HelperClass();}
    }


    public static void tearDown() {
        if(driver!=null) {
            driver.close();
            driver.quit();
        }
        helperClass = null;
    }
}
