package com.saucedemo.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InventoryPage {

    WebDriver driver;
    WebDriverWait wait;

    By inventoryPage = By.className("inventory_container");
    By addToCartButtons = By.cssSelector("button[data-test^='add-to-cart']");
    By cartBadge = By.className("shopping_cart_badge");
    By cartIcon = By.className("shopping_cart_link");

    public InventoryPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public void waitForPage() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(inventoryPage));
    }

    public boolean isInventoryDisplayed() {
        return driver.findElement(inventoryPage).isDisplayed();
    }

    public void addProductToCart(int productNumber) {

        List<WebElement> buttons = wait.until(
                ExpectedConditions.visibilityOfAllElementsLocatedBy(addToCartButtons));

        WebElement button = buttons.get(productNumber);

        wait.until(ExpectedConditions.elementToBeClickable(button));

        button.click();

        // Wait until cart badge is updated
        wait.until(ExpectedConditions.visibilityOfElementLocated(cartBadge));
    }

    public int getCartItemCount() {
        try {
            return Integer.parseInt(driver.findElement(cartBadge).getText());
        } catch (Exception e) {
            return 0;
        }
    }

    public void clickCartIcon() {

        WebElement cart = wait.until(
                ExpectedConditions.elementToBeClickable(cartIcon));

        cart.click();
    }
}