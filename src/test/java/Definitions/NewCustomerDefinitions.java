package Definitions;

import Models.Customer;
import Pages.NewCustomerPage;
import io.cucumber.datatable.DataTable;

import java.util.List;
import java.util.Map;

public class NewCustomerDefinitions {
    private final NewCustomerPage newCustomerPage = new NewCustomerPage();
    public String expectedSuccessfulRegisterMessage = "Customer Registered Successfully!!!";
    public String expectedExistEmailMessage = "Email Address Already Exist !!";
    public String expectedFillFieldsMessage = "please fill all fields";

    public void goToNewCustomerPage(){
        newCustomerPage.openNewCustomerPage();
    }

    public void enterDataForCustomer(DataTable dataTable){
        List<Map<String,String>> customersData = dataTable.asMaps(String.class, String.class);
        for(Map<String,String> customers : customersData) {
            Customer customer = new Customer(customers);
            newCustomerPage.enterName(customer.name);
            newCustomerPage.chooseGender(customer.maleGender);
            newCustomerPage.selectDateOfBirth(customer.dateOfBirth);
            newCustomerPage.enterAddress(customer.address);
            newCustomerPage.enterCity(customer.city);
            newCustomerPage.enterState(customer.state);
            newCustomerPage.enterPIN(customer.pin);
            newCustomerPage.enterTelephoneNumber(customer.telephoneNumber);
            newCustomerPage.enterEmail(customer.email);
            newCustomerPage.enterPassword(customer.password);
            newCustomerPage.submit();
        }
    }

    public String getActualSuccessfulRegisterMessage(){
        return newCustomerPage.getSuccessfulMessage();
    }

    public String getActualErrorMessage(){
        return newCustomerPage.getErrorMessage();
    }
}