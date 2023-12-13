package Pages;

import Base.BaseClass;
import Utilies.HelperClass;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

public class NewCustomerPage extends BaseClass {
    final private By newCustomerButton = By.xpath("//div[3]/div/ul/li[2]/a");
    final private By customerNameField = By.name("name");
    final private By maleGender = By.xpath("//tr[5]/td[2]/input[1]");
    final private By femaleGender = By.xpath("//tr[5]/td[2]/input[2]");
    final private By dateOfBirth = By.id("dob");
    final private By addressField = By.name("addr");
    final private By cityField = By.name("city");
    final private By stateField = By.name("state");
    final private By pinField = By.name("pinno");
    final private By telephoneNumberField = By.name("telephoneno");
    final private By emailField = By.name("emailid");
    final private By passwordField = By.name("password");
    final private By submitButton = By.name("sub");
    final private By successfulMessage = By.xpath("//*[@id=\"customer\"]/tbody/tr[1]/td/p");
    final private By id = By.xpath("//*[@id=\"customer\"]/tbody/tr[4]/td[2]");

    public NewCustomerPage(){
        PageFactory.initElements(HelperClass.getDriver(),this);
    }

    public void openNewCustomerPage() { clickOn(newCustomerButton); }

    public void enterName(String name){ sendKeys(customerNameField,name); }

    public void chooseGender(Boolean male){
        if (male) clickOn(maleGender);
        else clickOn(femaleGender);
    }

    public void selectDateOfBirth(String date){ sendKeys(dateOfBirth,date);}

    public void enterAddress(String address){ sendKeys(addressField,address); }

    public void enterCity(String city){ sendKeys(cityField,city); }

    public void enterState(String state){ sendKeys(stateField,state); }

    public void enterPIN(String pin){ sendKeys(pinField,pin); }

    public void enterTelephoneNumber(String telephoneNumber){ sendKeys(telephoneNumberField,telephoneNumber); }

    public void enterEmail(String email){ sendKeys(emailField,email); }

    public void enterPassword(String password){ sendKeys(passwordField,password); }

    public void submit(){ clickOn(submitButton); }

    public String getSuccessfulMessage() {
        return getText(successfulMessage);
    }

    public String getErrorMessage() { return switchToAlertAndGetMessage(true);}
}