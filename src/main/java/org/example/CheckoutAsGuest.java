package org.example;

import org.openqa.selenium.By;

public class CheckoutAsGuest extends Utils {

    private By _checkoutAsGuest = By.xpath("//input[@value='Checkout as Guest']");

    public void clickOnCheckoutAsGuest()
    {
        clickOnElement(_checkoutAsGuest);
    }
}
