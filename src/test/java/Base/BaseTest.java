package Base;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.MalformedURLException;
import java.net.URL;

public class BaseTest {
    public static AppiumDriver driver;

    public static void setup(String platform) throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();

        if (platform.equalsIgnoreCase("android")) {
            caps.setCapability("platformName", "Android");
            caps.setCapability("appium:automationName", "UiAutomator2");
            caps.setCapability("appium:udid", "R3CR50GKABE");
            caps.setCapability("appium:appPackage", "com.androidsample.generalstore");
            caps.setCapability("appium:appActivity", ".SplashActivity");
            caps.setCapability("app", System.getProperty("user.dir") + "/src/test/resources/General-Store.apk");

            driver = new AppiumDriver(new URL("http://127.0.0.1:4723"), caps);
        }
    }

    public static void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
