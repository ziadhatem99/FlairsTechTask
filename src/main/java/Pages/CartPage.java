package Pages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CartPage {
    private final AppiumDriver driver;

    public CartPage(AppiumDriver driver) {
        this.driver = driver;
    }
    private final By FirstElementPrice = By.xpath("(//*[@resource-id='com.androidsample.generalstore:id/productPrice'])[1]");
    private final By SecondElementPrice = By.xpath("(//*[@resource-id='com.androidsample.generalstore:id/productPrice'])[2]");
    private final By totalPrice = By.xpath("");

    public WebElement getFirstElementPrice(){
        WebElement element = driver.findElement(FirstElementPrice);
        return element;
    }
    public WebElement getSecondElementPrice(){
        WebElement element = driver.findElement(SecondElementPrice);
        return element;
    }
    public WebElement getTotalPrice(){
        WebElement element = driver.findElement(totalPrice);
        return element;
    }
}
