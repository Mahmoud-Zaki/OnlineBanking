package Definitions;

import Pages.LogoutPage;

public class LogoutDefinitions {
    private final LogoutPage logoutPage = new LogoutPage();
    public String expectedLogoutMessage = "You Have Succesfully Logged Out!!";

    public void clickOnLogout(){
        logoutPage.logout();
    }

    public String getActualLogoutMessage(){
        return logoutPage.getLogoutMessage();
    }
}