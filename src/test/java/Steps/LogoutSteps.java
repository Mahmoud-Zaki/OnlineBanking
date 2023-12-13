package Steps;

import Definitions.LogoutDefinitions;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class LogoutSteps {
    private final LogoutDefinitions logoutDefinitions = new LogoutDefinitions();

    @When("Click on Logout")
    public void clickOnLogout() {
        logoutDefinitions.clickOnLogout();
    }

    @Then("Verify that logout message is displayed")
    public void verifyThatLogoutMessageIsDisplayed() {
        Assert.assertTrue(logoutDefinitions.getActualLogoutMessage().contains(logoutDefinitions.expectedLogoutMessage));
    }
}