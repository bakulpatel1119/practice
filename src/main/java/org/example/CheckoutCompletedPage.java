package org.example;

import org.openqa.selenium.By;

public class CheckoutCompletedPage extends Utils {

    private By _checkoutCompletedMessage = By.xpath("//div[@class='section order-completed']/div/strong");

    String expected = "Your order has been completed";

    public void verifyUserSeeCheckoutCompletedMessage()
    {
        assertTextMessage(expected,_checkoutCompletedMessage);
    }

}
