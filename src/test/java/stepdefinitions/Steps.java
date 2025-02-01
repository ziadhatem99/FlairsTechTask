package stepdefinitions;

import Base.BaseTest;
import Pages.CartPage;
import Pages.HomePage;
import io.cucumber.java.en.*;
import Pages.RegisterPage;
import org.testng.Assert;

import java.net.MalformedURLException;

public class Steps extends BaseTest{
    private RegisterPage registerPage;
    private HomePage homePage;
    private CartPage cartPage;
    @Given("I open the app")
    public void i_open_the_app() throws MalformedURLException {
        BaseTest.setup("android");
        registerPage = new RegisterPage(driver);
        homePage = new HomePage(driver);
        cartPage = new CartPage(driver);
    }

    @When("I enter username")
    public void iEnterUsername(String userName) {
        registerPage.enterUsername(userName);
    }

    @And("I choose country")
    public void iChooseCountry() {
        registerPage.chooseEgypt();
    }

    @And("I tap on let's go")
    public void iTapOnLetSGo() {
        registerPage.clickLetsShop();
    }

    @And("I add two products")
    public void iAddTwoProducts() {
        homePage.addTwoProductsToCart();
    }

    @And("I click on cart")
    public void iClickOnCart() {
        homePage.clickCart();
    }

    @And("I check the products exist")
    public void iCheckTheProductsExist() {
        Assert.assertTrue(cartPage.getFirstElementPrice().isDisplayed(), "Product not found!");
        Assert.assertTrue(cartPage.getSecondElementPrice().isDisplayed(), "Product not found!");
    }

    @Then("I validate the total price is right")
    public void iValidateTheTotalPriceIsRight() {
        String price1Text = cartPage.getFirstElementPrice().getText();
        String price2Text = cartPage.getSecondElementPrice().getText();
        String totalPriceText = cartPage.getTotalPrice().getText();
        double price1 = Double.parseDouble(price1Text.replace("$", ""));
        double price2 = Double.parseDouble(price2Text.replace("$", ""));
        double total = Double.parseDouble(totalPriceText.replace("$", ""));
        double sumOfPrices = price1 + price2;
        Assert.assertEquals(sumOfPrices, total, "The total price does not match the sum of the product prices.");
    }
}
