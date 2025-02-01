package Pages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class HomePage {
    private final AppiumDriver driver;
    public HomePage(AppiumDriver driver) {
        this.driver = driver;
    }
    private final By firstAddToCart = By.xpath("(//android.widget.TextView[@text='ADD TO CART'])[1]");
    private final By secondAddToCart = By.xpath("(//android.widget.TextView[@text='ADD TO CART'])[2]");
    private final By viewCartBtn = By.id("com.androidsample.generalstore:id/appbar_btn_cart");

    public void addTwoProductsToCart(){
        driver.findElement(firstAddToCart).click();
        driver.findElement(secondAddToCart).click();
    }
    public void clickCart(){
        driver.findElement(viewCartBtn).click();
    }
}
