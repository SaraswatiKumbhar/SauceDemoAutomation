# SauceDemo Selenium Automation

Selenium WebDriver automation project for the SauceDemo e-commerce application using Java, TestNG, Maven, and Page Object Model (POM).

## Project Overview

This project automates an end-to-end purchase flow on the SauceDemo application.

### Automated Test Scenario

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

## Project Structure

```text
SauceDemoAutomation
│
├── src
│   ├── main
│   │   └── java
│   │
│   └── test
│       ├── java
│       │   ├── pages
│       │   │   ├── LoginPage.java
│       │   │   ├── InventoryPage.java
│       │   │   ├── CartPage.java
│       │   │   └── CheckoutPage.java
│       │   │
│       │   ├── BaseTest.java
│       │   └── E2EPurchaseTest.java
│       │
│       └── resources
│           ├── testng.xml
│           └── log4j2.xml
│
├── pom.xml
├── .gitignore
└── README.md


Framework Structure

The project follows the Page Object Model (POM) design pattern.

Page Classes
LoginPage
InventoryPage
CartPage
CheckoutPage
Test Classes
BaseTest
E2EPurchaseTest
Key Features
Selenium WebDriver browser automation
Page Object Model implementation
Reusable page classes
TestNG test execution
Maven dependency management
Log4j2 logging
End-to-end purchase automation
Git and GitHub version control
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

Selenium WebDriver – Browser automation
TestNG – Test execution
Maven – Dependency management
Page Object Model – Maintainable and reusable automation
Log4j2 – Logging
Git & GitHub – Version control
Author

Saraswati Kumbhar

Software Testing Fresher | QA Engineer

Skills

Manual Testing | Selenium | Java | API Testing | SQL | TestNG | Postman
