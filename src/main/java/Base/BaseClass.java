package Base;

import Utilies.HelperClass;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BaseClass {
    WebDriver driver = HelperClass.getDriver();
    WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(60));
    public void clickOn(By element){
        wait.until(ExpectedConditions.presenceOfElementLocated(element)).click();
    }
    public void sendKeys(By element,String text){
        wait.until(ExpectedConditions.presenceOfElementLocated(element)).sendKeys(text);
    }

    public String getText(By element){
        return wait.until(ExpectedConditions.presenceOfElementLocated(element)).getText();
    }

    public String switchToAlertAndGetMessage(boolean acceptAlert){
        wait.until(ExpectedConditions.alertIsPresent());
        Alert alert = driver.switchTo().alert();
        String message = alert.getText();
        if (acceptAlert) { alert.accept(); }
        else { alert.dismiss(); }
        return message;
    }

//    checkIfElementPresent(){}
//
//    scrollTo(){}
//
//    hoverOn(){}
//
//    switchTo(){}
}
