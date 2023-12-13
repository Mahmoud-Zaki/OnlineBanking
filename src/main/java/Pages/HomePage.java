package Pages;

import Base.BaseClass;
import Utilies.HelperClass;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BaseClass {
    final private By welcomeMessage = By.xpath("//table/tbody/tr[2]/td/marquee");

    public HomePage(){
        PageFactory.initElements(HelperClass.getDriver(),this);
    }

    public String getWelcomeMessage(){ return getText(welcomeMessage);}
}