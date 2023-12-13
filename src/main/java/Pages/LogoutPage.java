package Pages;

import Base.BaseClass;
import Utilies.HelperClass;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

public class LogoutPage extends BaseClass {
    final private By logoutButton = By.xpath("//div[3]/div/ul/li[15]/a");

    public LogoutPage(){
        PageFactory.initElements(HelperClass.getDriver(),this);
    }

    public void logout() {
        clickOn(logoutButton);
    }

    public String getLogoutMessage(){ return switchToAlertAndGetMessage(true);}
}
