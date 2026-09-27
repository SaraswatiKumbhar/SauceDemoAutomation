# SauceDemo Selenium Automation

## Project Overview

This project is a Selenium WebDriver automation framework developed to automate functional test scenarios for the SauceDemo e-commerce web application.

The project follows the Page Object Model (POM) design pattern to improve code reusability, maintainability, and readability.

## Application Under Test

SauceDemo  
https://www.saucedemo.com/

## Technologies & Tools

- Java
- Selenium WebDriver
- TestNG
- Maven
- Page Object Model (POM)
- Eclipse
- Git
- GitHub
- Log4j2

## Framework Structure

The project is organized using the Page Object Model.

### Page Classes

- LoginPage
- InventoryPage
- CartPage
- CheckoutPage

### Test Classes

- BaseTest
- E2EPurchaseTest

## Automated Test Scenario

The automation covers an end-to-end purchase flow:

1. Launch the SauceDemo application.
2. Login with valid credentials.
3. Verify the inventory page.
4. Select a product.
5. Add the product to the cart.
6. Navigate to the cart.
7. Proceed to checkout.
8. Enter customer information.
9. Complete the purchase.
10. Verify the order confirmation.

## Project Structure

SauceDemoAutomation
│
├── src
│   ├── main
│   │   └── java
│   │
│   └── test
│       ├── java
│       │   └── pages
│       │       ├── LoginPage.java
│       │       ├── InventoryPage.java
│       │       ├── CartPage.java
│       │       └── CheckoutPage.java
│       │
│       └── resources
│           ├── testng.xml
│           └── log4j2.xml
│
├── pom.xml
├── .gitignore
└── README.md

How to Run the Project
Prerequisites

Make sure the following are installed:

Java JDK
Eclipse IDE
Maven
Google Chrome
Steps
Clone the repository.
Import the project into Eclipse as a Maven project.
Update Maven dependencies.
Configure the required browser/WebDriver setup.
Run the TestNG test suite.
Review the test execution results.
Test Framework

The framework uses:

Selenium WebDriver – browser automation
TestNG – test execution
Maven – dependency management
Page Object Model – maintainable and reusable automation
Log4j2 – logging
Git & GitHub – version control
Key Features
Page Object Model implementation
Reusable page classes
End-to-end test automation
TestNG test execution
Maven dependency management
Logging using Log4j2
Git and GitHub version control
Author

Saraswati Kumbhar

Software Testing Fresher | QA Engineer

Skills: Manual Testing | Selenium | Java | API Testing | SQL | TestNG | Postman
