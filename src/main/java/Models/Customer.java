package Models;

import java.util.Map;

public class Customer {
    public final String name;
    public final Boolean maleGender;
    public final String dateOfBirth;
    public final String address;
    public final String city;
    public final String state;
    public final String pin;
    public final String telephoneNumber;
    public final String email;
    public final String password;

    public Customer(Map<String,String> customerData){
        this.name = customerData.get("customerName");
        this.maleGender = customerData.get("gender").equals("male");
        this.dateOfBirth = customerData.get("dateOfBirth");
        this.address = customerData.get("address");
        this.city = customerData.get("city");
        this.state = customerData.get("state");
        this.pin = customerData.get("pin");
        this.telephoneNumber = customerData.get("mobileNumber");
        this.email = customerData.get("email");
        this.password = customerData.get("password");
    }
}