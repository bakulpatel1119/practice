package org.example;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepdefs {
    RegistrationPage registrationPage = new RegistrationPage();
    RegistrationResultPage registrationResultPage = new RegistrationResultPage();
    HomePage homePage = new HomePage();
    CompareProductsPage compareProductsPage = new CompareProductsPage();
    AppleMacBookPro13 appleMacBookPro13 = new AppleMacBookPro13();
    EmailAFriendAppleMacBook emailAFriendAppleMacBook = new EmailAFriendAppleMacBook();
    NonRegisteredEmailAFriendAppleMac nonRegisteredEmailAFriendAppleMac = new NonRegisteredEmailAFriendAppleMac();
    ComputerPage computerPage = new ComputerPage();
    DesktopsPage desktopsPage = new DesktopsPage();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
    CheckoutAsGuest checkoutAsGuest = new CheckoutAsGuest();
    OnePageCheckout onePageCheckout = new OnePageCheckout();
    CheckoutCompletedPage checkoutCompletedPage = new CheckoutCompletedPage();
    NewsPage newsPage = new NewsPage();
    AboutNopCommerce aboutNopCommerce = new AboutNopCommerce();



    @Given("user is on register page")
    public void userIsOnRegisterPage() {
        homePage.clickOnRegisterButton();
        registrationPage.verifyUserIsOnRegisterPage();
    }

    @When("user enters all registration details")
    public void userEntersAllRegistrationDetails() {
        registrationPage.userEntersRegistrationDetails();
    }

    @And("user clicks on register button")
    public void userClicksOnRegisterButton() {
        registrationPage.clickOnRegisterButton();
    }

    @Then("user should able to register successfully")
    public void userShouldAbleToRegisterSuccessfully() {
        registrationResultPage.verifyUserSeeRegistrationSuccessMessage();
    }


    @Given("user is in the home page")
    public void userIsInTheHomePage() {
        homePage.verifyUserIsInHomePage();
    }

    @When("user compares two products")
    public void userComparesTwoProducts() {
        homePage.compareTwoProducts();
    }

    @Then("user should be able to navigate to products comparison page")
    public void userShouldBeAbleToNavigateToProductsComparisonPage() {
        compareProductsPage.varifyUserSeeCompareProductsMessage();
    }

    @Given("user is in the registration result page")
    public void userIsInTheRegistrationResultPage() {
        homePage.clickOnRegisterButton();
        registrationPage.verifyUserIsOnRegisterPage();
        registrationPage.userEntersRegistrationDetails();
        registrationPage.clickOnRegisterButton();
        registrationResultPage.verifyUserSeeRegistrationSuccessMessage();
    }

    @And("user clicks on continue")
    public void userClicksOnContinue() {
        registrationResultPage.clickOnContinueRegistrationResultPage();
    }

    @And("user sends email to a friend")
    public void userSendsEmailToAFriend() {
        homePage.clickOnAppleMacBook();
        appleMacBookPro13.clickOnEmailAFriendButton();
        emailAFriendAppleMacBook.userEntersEmailAFriendDetails();
    }

    @Then("user should be able to see the email sent message")
    public void userShouldBeAbleToSeeTheEmailSentMessage() {
        emailAFriendAppleMacBook.verifyUserSeeEmailAFriendSentMessage();
    }


    @When("user attempts to send an email to a friend")
    public void userAttemptsToSendAnEmailToAFriend() {
        homePage.clickOnAppleMacBook();
        appleMacBookPro13.clickOnEmailAFriendButton();
        nonRegisteredEmailAFriendAppleMac.userEntersEmailsAFriendDetails();
    }

    @Then("user should be able see error message")
    public void userShouldBeAbleSeeErrorMessage() {
        nonRegisteredEmailAFriendAppleMac.verifyUnregisteredUserWillSeeErrorMessageForEmailAFriend();

    }

    @Given("user is in the desktops page")
    public void userIsInTheDesktopsPage() {
        //click on computer
        homePage.clickOnComputer();
        //click on desktops
        computerPage.clickOnDesktops();
    }

    @When("user follows checkout as a guest")
    public void userFollowsCheckoutAsAGuest() {
        desktopsPage.scrollAndClickAddToCartDigitalStorm();
        //click on shopping cart
        desktopsPage.clickOnShoppingCart();
        //click on Terms and Conditions
        shoppingCartPage.scrollAndClickTermsOfService();
        //click on checkout
        shoppingCartPage.clickOnCheckOut();
        //click on checkout as guest
        checkoutAsGuest.clickOnCheckoutAsGuest();
        //enter guest details
        onePageCheckout.guestEnterDetails();
        //click on continue
        onePageCheckout.clickOnContinueShippingMethod();
    }

    @And("user enters payment details")
    public void userEntersPaymentDetails() {
        //click on credit card payment option
        onePageCheckout.clickOnCreditCardPaymentOption();
        //click on continue payment option
        onePageCheckout.clickOnContinuePaymentOption();
        //enter card details
        onePageCheckout.enterCardDetails();
        //click on continue
        onePageCheckout.clickOnContinueCardDetails();
    }

    @And("user clicks on confirm")
    public void userClicksOnConfirm() {
        onePageCheckout.clickOnConfirm();
    }

    @Then("user should be able to checkout successfully")
    public void userShouldBeAbleToCheckoutSuccessfully() {
        checkoutCompletedPage.verifyUserSeeCheckoutCompletedMessage();
    }

    @Given("user is in the about nopcommerce page")
    public void userIsInTheAboutNopcommercePage() {
        //click on news
        homePage.clickOnNews();
        //click on details
        newsPage.scrollAndClickOnDetails();
    }

    @When("user adds a comment")
    public void userAddsAComment() {
        // enter comment title
        aboutNopCommerce.enterCommentTitle();
        //enter comment
        aboutNopCommerce.enterComment();
    }

    @And("user clicks on new comment")
    public void userClicksOnNewComment()
    {
        //click on new comment
        aboutNopCommerce.clickOnNewComment();
    }

    @Then("verify comment added message is visible")
    public void verifyCommentAddedMessageIsVisible()
    {
        //verify comment added message visible
        aboutNopCommerce.verifyUserAbleToSeeCommentAddedMessage();
    }

    @When("user selects currency to Euro")
    public void userSelectsCurrencyToEuro()
    {
        //change currency to Euro from drop down arrow
        homePage.changeCurrencyToEuro();
    }

    @Then("user should be able to see prices in Euro for all featured products")
    public void userShouldBeAbleToSeePricesInEuroForAllFeaturedProducts()
    {
        //verify euro currency is visible
        homePage.verifyUserAbleToSeeEuroCurrency();
    }

    @Then("user should be able to see add to cart button in all featured products")
    public void userShouldBeAbleToSeeAddToCartButtonInAllFeaturedProducts()
    {
        //verify add to cart button is visible for all the products
        homePage.verifyAddToCartButton();
    }

    @When("user selects price high to low")
    public void userSelectsPriceHighToLow()
    {
        desktopsPage.clickOnSortBy();
        desktopsPage.selectHighToLowPrice();
    }

    @Then("user should be able to see products sorted in price descending order")
    public void userShouldBeAbleToSeeProductsSortedInPriceDescendingOrder() {
    }
}
