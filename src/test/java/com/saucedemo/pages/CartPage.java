package com.saucedemo.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CartPage {

    WebDriver driver;
    WebDriverWait wait;

    // Cart page
    By cartPage = By.id("cart_contents_container");

    // Products in cart
    By cartItems = By.className("cart_item");

    // Remove buttons
    By removeButtons = By.cssSelector("button[data-test^='remove']");

    // Checkout button
    By checkoutButton = By.id("checkout");

    public CartPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    // Wait for Cart Page
    public void waitForPage() {
        wait.until(
            ExpectedConditions.visibilityOfElementLocated(cartPage)
        );
    }

    // Get number of products in cart
    public int getCartItemCount() {
        return driver.findElements(cartItems).size();
    }

    // Remove product from cart
    public void removeItemFromCart(int index) {

        List<WebElement> buttons = wait.until(
            ExpectedConditions.visibilityOfAllElementsLocatedBy(removeButtons)
        );

        buttons.get(index).click();
    }

    // Click Checkout
    public void clickCheckout() {

        wait.until(
            ExpectedConditions.elementToBeClickable(checkoutButton)
        ).click();
    }
}