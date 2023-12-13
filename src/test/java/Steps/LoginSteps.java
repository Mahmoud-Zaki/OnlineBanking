package Steps;

import Definitions.LoginDefinitions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class LoginSteps {
    private final LoginDefinitions loginDefinitions = new LoginDefinitions();

    @Given("Go to Login page")
    public void goToLoginPage() {
        loginDefinitions.goToLoginPage();
    }

    @When("Enter username as {string} and password as {string}")
    public void enterUsernameAndPassword(String username, String password) {
        loginDefinitions.enterUsernameAndPassword(username,password);
    }

    @Then("Verify that welcome message is displayed")
    public void verifyThatWelcomeMessageIsDisplayed() {
        Assert.assertEquals(loginDefinitions.getActualWelcomeMessage(),loginDefinitions.expectedWelcomeMessage);
    }

    @Then("Verify that error message is displayed")
    public void verifyThatErrorMessageIsDisplayed() {
        Assert.assertTrue(loginDefinitions.getActualErrorMessage().contains(loginDefinitions.expectedErrorMessage));
    }
}