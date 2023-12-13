package Steps;

import Definitions.NewCustomerDefinitions;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class NewCustomerSteps {
    private final NewCustomerDefinitions newCustomerDefinitions = new NewCustomerDefinitions();

    @Given("Go to new customer page")
    public void goToNewCustomerPage() {
        newCustomerDefinitions.goToNewCustomerPage();
    }

    @When("Enter data for customer with the following details:")
    public void enterDataForCustomerWithTheFollowingDetails(DataTable dataTable) {
        newCustomerDefinitions.enterDataForCustomer(dataTable);
    }

    @Then("Verify that successful message is displayed")
    public void verifyThatSuccessfulMessageIsDisplayed() {
        Assert.assertEquals(newCustomerDefinitions.getActualSuccessfulRegisterMessage(),newCustomerDefinitions.expectedSuccessfulRegisterMessage);
    }

    @Then("Verify that fill fields message is displayed")
    public void verifyThatFillFieldsMessageIsDisplayed() {
        Assert.assertTrue(newCustomerDefinitions.getActualErrorMessage().contains(newCustomerDefinitions.expectedFillFieldsMessage));
    }

    @Then("Verify that exist email message is displayed")
    public void verifyThatExistEmailMessageIsDisplayed() {
        Assert.assertTrue(newCustomerDefinitions.getActualErrorMessage().contains(newCustomerDefinitions.expectedExistEmailMessage));
    }
}