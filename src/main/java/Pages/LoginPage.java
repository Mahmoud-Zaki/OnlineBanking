package Pages;

import Base.BaseClass;
import Utilies.HelperClass;
import org.jetbrains.annotations.NotNull;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass {

    final private By usernameField = By.name("uid");
    final private By passwordField = By.name("password");
    final private By loginButton = By.name("btnLogin");

    public LoginPage(){
        PageFactory.initElements(HelperClass.getDriver(),this);
    }

    public void fillFields(@NotNull String username,@NotNull String password) {
        sendKeys(usernameField,username);
        sendKeys(passwordField,password);
    }

    public void login() { clickOn(loginButton);}

    public String getErrorMessage() { return switchToAlertAndGetMessage(true);}
}