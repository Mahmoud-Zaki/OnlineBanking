@Smoke_TCs @AddNewCustomer_TCs
Feature: Create New Customer

  Background:
    Given Go to Login page
    When Enter username as "mngr538910" and password as "azYbYsY"

  @AddNewCustomer_TC_01
  Scenario: Create new customer with valid data

    Given Go to new customer page
    When Enter data for customer with the following details:
      |  customerName  |  gender  |  dateOfBirth  |  address  |  city    |  state  |  pin     |  mobileNumber  |  email                    |  password    |
      |  mahmoudzaki   |  male    |  16/04/2000   |  msala    |  fayoum  |  egypt  |  123456  |  01064781948   |  mahmoudmzaki4@gmail.com  |  1234567890  |
    Then Verify that successful message is displayed

  @AddNewCustomer_TC_02
  Scenario Outline: Create customer with invalid data and missing values

    Given Go to new customer page
    When Enter data for customer with the following details:
      | Customer Name  | <customerName> |
      | Gender         | <gender>       |
      | Date of Birth  | <dateOfBirth>  |
      | Address        | <address>      |
      | City           | <city>         |
      | State          | <state>        |
      | PIN            | <pin>          |
      | Mobile Number  | <mobileNumber> |
      | E-mail	       | <email>        |
      | Password	   | <password>     |
    Then Verify that fill fields message is displayed
    Examples:
      |  customerName  |  gender  |  dateOfBirth   |  address  |  city    |  state  |  pin     |  mobileNumber  |  email                    |  password    |
      |  mahmoudzaki4  |  male    |  16/04/2000    |  msala    |  fayoum  |  egypt  |  123456  |  01064781948   |  mahmoudzaki4@gmail.com  |  1234567890  |
      |  mahmoud@zaki  |  male    |  16/04/2000    |  msala    |  fayoum  |  egypt  |  123456  |  01064781948   |  mahmoudzaki4@gmail.com  |  1234567890  |
      |                |  male    |  16/04/2000    |  msala    |  fayoum  |  egypt  |  123456  |  01064781948   |  mahmoudzaki4@gmail.com  |  1234567890  |
      |  \u00A0mahmoudzaki   |  male    |  16/04/2000    |  msala    |  fayoum  |  egypt  |  123456  |  01064781948   |  mahmoudzaki4@gmail.com  |  1234567890  |
      |  mahmoudzaki   |  male    |  16/04/2000    |  msa-la   |  fayoum  |  egypt  |  123456  |  01064781948   |  mahmoudzaki4@gmail.com  |  1234567890  |
      |  mahmoudzaki   |  male    |  16/04/2000    |           |  fayoum  |  egypt  |  123456  |  01064781948   |  mahmoudzaki4@gmail.com  |  1234567890  |
      |  mahmoudzaki   |  male    |  16/04/2000    |  \u00A0msala    |  fayoum  |  egypt  |  123456  |  01064781948   |  mahmoudzaki4@gmail.com  |  1234567890  |
      |  mahmoudzaki   |  male    |  16/04/2000    |  msala    |  fa-youm |  egypt  |  123456  |  01064781948   |  mahmoudzaki4@gmail.com  |  1234567890  |
      |  mahmoudzaki   |  male    |  16/04/2000    |  msala    |          |  egypt  |  123456  |  01064781948   |  mahmoudzaki4@gmail.com  |  1234567890  |
      |  mahmoudzaki   |  male    |  16/04/2000    |  msala    |  fayoum4 |  egypt  |  123456  |  01064781948   |  mahmoudzaki4@gmail.com  |  1234567890  |
      |  mahmoudzaki   |  male    |  16/04/2000    |  msala    |  \u00A0fayoum  |  egypt  |  123456  |  01064781948   |  mahmoudzaki4@gmail.com  |  1234567890  |
      |  mahmoudzaki   |  male    |  16/04/2000    |  msala    |  fayoum  |  egy-pt |  123456  |  01064781948   |  mahmoudzaki4@gmail.com  |  1234567890  |
      |  mahmoudzaki   |  male    |  16/04/2000    |  msala    |  fayoum  |         |  123456  |  01064781948   |  mahmoudzaki4@gmail.com  |  1234567890  |
      |  mahmoudzaki   |  male    |  16/04/2000    |  msala    |  fayoum  |  egypt6 |  123456  |  01064781948   |  mahmoudzaki4@gmail.com  |  1234567890  |
      |  mahmoudzaki   |  male    |  16/04/2000    |  msala    |  fayoum  |  \u00A0egypt  |  123456  |  01064781948   |  mahmoudzaki4@gmail.com  |  1234567890  |
      |  mahmoudzaki   |  male    |  16/04/2000    |  msala    |  fayoum  |  egypt  |  12a456  |  01064781948   |  mahmoudzaki4@gmail.com  |  1234567890  |
      |  mahmoudzaki   |  male    |  16/04/2000    |  msala    |  fayoum  |  egypt  |  12-456  |  01064781948   |  mahmoudzaki4@gmail.com  |  1234567890  |
      |  mahmoudzaki   |  male    |  16/04/2000    |  msala    |  fayoum  |  egypt  |          |  01064781948   |  mahmoudzaki4@gmail.com  |  1234567890  |
      |  mahmoudzaki   |  male    |  16/04/2000    |  msala    |  fayoum  |  egypt  | " 123456"|  01064781948   |  mahmoudzaki4@gmail.com  |  1234567890  |
      |  mahmoudzaki   |  male    |  16/04/2000    |  msala    |  fayoum  |  egypt  |  123456  |  01064m81948   |  mahmoudzaki4@gmail.com  |  1234567890  |
      |  mahmoudzaki   |  male    |  16/04/2000    |  msala    |  fayoum  |  egypt  |  123456  |  01064-81948   |  mahmoudzaki4@gmail.com  |  1234567890  |
      |  mahmoudzaki   |  male    |  16/04/2000    |  msala    |  fayoum  |  egypt  |  123456  |                |  mahmoudzaki4@gmail.com  |  1234567890  |
      |  mahmoudzaki   |  male    |  16/04/2000    |  msala    |  fayoum  |  egypt  |  123456  | " 01064781948" |  mahmoudzaki4@gmail.com  |  1234567890  |
      |  mahmoudzaki   |  male    |  16/04/2000    |  msala    |  fayoum  |  egypt  |  123456  |  01064781948   |                           |  1234567890  |
      |  mahmoudzaki   |  male    |  16/04/2000    |  msala    |  fayoum  |  egypt  |  123456  |  01064781948   |  \u00A0mahmoudzaki4@gmail.com  |  1234567890  |
      |  mahmoudzaki   |  male    |  16/04/2000    |  msala    |  fayoum  |  egypt  |  123456  |  01064781948   |  mahmoudzaki4gmail.com   |  1234567890  |
      |  mahmoudzaki   |  male    |  16/04/2000    |  msala    |  fayoum  |  egypt  |  123456  |  01064781948   |  mahmoudzaki4@gmail.com  |              |

  @AddNewCustomer_TC_03
  Scenario: Create new customer with exists email

    Given Go to new customer page
    When Enter data for customer with the following details:
      |  customerName  |  gender  |  dateOfBirth  |  address  |  city    |  state  |  pin     |  mobileNumber  |  email                    |  password    |
      |  mahmoudzaki   |  male    |  16/04/2000   |  msala    |  fayoum  |  egypt  |  123456  |  01064781948   |  mahmoudmzaki4@gmail.com  |  1234567890  |
    Then Verify that exist email message is displayed