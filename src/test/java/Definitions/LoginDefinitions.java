package Definitions;

import Pages.LoginPage;
import Pages.HomePage;
import Utilies.HelperClass;

public class LoginDefinitions {

    private final LoginPage loginPage = new LoginPage();
    private final HomePage homePage = new HomePage();
    public String expectedWelcomeMessage = "Welcome To Manager's Page of Guru99 Bank";
    public String expectedErrorMessage = "User or Password is not valid";

    public void goToLoginPage(){
        HelperClass.openPage("https://www.demo.guru99.com/V4/");
    }

    public void enterUsernameAndPassword(String username, String password){
        loginPage.fillFields(username,password);
        loginPage.login();
    }

    public String getActualWelcomeMessage(){ return homePage.getWelcomeMessage();}

    public String getActualErrorMessage(){ return loginPage.getErrorMessage();}
}