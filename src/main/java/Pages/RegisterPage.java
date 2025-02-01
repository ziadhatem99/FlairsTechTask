package Pages;

import io.appium.java_client.*;
import org.openqa.selenium.By;

public class RegisterPage {
    private final AppiumDriver driver;
    public RegisterPage(AppiumDriver driver) {
        this.driver = driver;
    }
    private final By dropDownButton = By.id("com.androidsample.generalstore:id/spinnerCountry");
    private final By usernameField = By.id("com.androidsample.generalstore:id/nameField");
    private final By letsGoBtn = By.id("com.androidsample.generalstore:id/btnLetsShop");
    public void chooseEgypt(){
        driver.findElement(dropDownButton).click();
        driver.findElement(MobileBy.AndroidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\"Egypt\"))"
        )).click();
    }
    public void enterUsername(String username) {
        driver.findElement(usernameField).sendKeys(username);
    }

    public void clickLetsShop(){
        driver.findElement(letsGoBtn).click();
    }
}
