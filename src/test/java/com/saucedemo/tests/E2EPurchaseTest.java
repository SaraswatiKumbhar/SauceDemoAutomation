package com.saucedemo.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.saucedemo.base.BaseTest;
import com.saucedemo.pages.CartPage;
import com.saucedemo.pages.CheckoutPage;
import com.saucedemo.pages.InventoryPage;
import com.saucedemo.pages.LoginPage;

public class E2EPurchaseTest extends BaseTest {

    LoginPage loginPage;
    InventoryPage inventoryPage;
    CartPage cartPage;
    CheckoutPage checkoutPage;

    String username = "standard_user";
    String password = "secret_sauce";
    String firstName = "Saraswati";
    String lastName = "Kumbhar";
    String postalCode = "411001";

    @BeforeMethod
    public void loginToApplication() {

        loginPage = new LoginPage(driver, wait);
        inventoryPage = new InventoryPage(driver, wait);
        cartPage = new CartPage(driver, wait);
        checkoutPage = new CheckoutPage(driver, wait);

        loginPage.login(username, password);

        inventoryPage.waitForPage();

        Assert.assertTrue(inventoryPage.isInventoryDisplayed());
    }

    @Test
    public void buyOneProduct() {

        inventoryPage.addProductToCart(0);

        Assert.assertEquals(inventoryPage.getCartItemCount(), 1);

        inventoryPage.clickCartIcon();

        cartPage.waitForPage();

        Assert.assertEquals(cartPage.getCartItemCount(), 1);

        cartPage.clickCheckout();

        checkoutPage.enterCustomerDetails(
                firstName,
                lastName,
                postalCode
        );

        checkoutPage.clickContinue();

        Assert.assertTrue(checkoutPage.isOverviewDisplayed());

        checkoutPage.clickFinish();

        Assert.assertTrue(checkoutPage.isOrderConfirmed());

        Assert.assertEquals(
                checkoutPage.getConfirmationMessage(),
                "Thank you for your order!"
        );

        loginPage.logout();

        Assert.assertTrue(loginPage.isLoginPageDisplayed());
    }

    @Test
    public void buyTwoProducts() {

        inventoryPage.addProductToCart(0);

        inventoryPage.addProductToCart(1);

        Assert.assertEquals(
                inventoryPage.getCartItemCount(),
                2
        );

        inventoryPage.clickCartIcon();

        cartPage.waitForPage();

        Assert.assertEquals(
                cartPage.getCartItemCount(),
                2
        );

        cartPage.clickCheckout();

        checkoutPage.enterCustomerDetails(
                firstName,
                lastName,
                postalCode
        );

        checkoutPage.clickContinue();

        Assert.assertTrue(checkoutPage.isOverviewDisplayed());

        checkoutPage.clickFinish();

        Assert.assertTrue(checkoutPage.isOrderConfirmed());

        Assert.assertEquals(
                checkoutPage.getConfirmationMessage(),
                "Thank you for your order!"
        );

        loginPage.logout();

        Assert.assertTrue(loginPage.isLoginPageDisplayed());
    }

    @Test
    public void removeOneProductAndBuy() {

        inventoryPage.addProductToCart(0);

        inventoryPage.addProductToCart(1);

        Assert.assertEquals(
                inventoryPage.getCartItemCount(),
                2
        );

        inventoryPage.clickCartIcon();

        cartPage.waitForPage();

        cartPage.removeItemFromCart(1);

        Assert.assertEquals(
                cartPage.getCartItemCount(),
                1
        );

        cartPage.clickCheckout();

        checkoutPage.enterCustomerDetails(
                firstName,
                lastName,
                postalCode
        );

        checkoutPage.clickContinue();

        Assert.assertTrue(checkoutPage.isOverviewDisplayed());

        checkoutPage.clickFinish();

        Assert.assertTrue(checkoutPage.isOrderConfirmed());

        Assert.assertEquals(
                checkoutPage.getConfirmationMessage(),
                "Thank you for your order!"
        );

        loginPage.logout();

        Assert.assertTrue(loginPage.isLoginPageDisplayed());
    }
}