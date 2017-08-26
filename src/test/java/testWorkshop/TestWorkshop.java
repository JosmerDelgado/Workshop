package testWorkshop;

import io.appium.java_client.android.AndroidDriver;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by josmer on 8/26/17.
 */
public class TestWorkshop {

    @Test
    public void test1() throws MalformedURLException {
        String device = "";
        String appPackage = "";
        String appActivity = "";
        AndroidDriver driver;
        WebDriverWait wait;
        DesiredCapabilities capabilities2 = new DesiredCapabilities();

        capabilities2.setCapability("appium-version", "1.6.3");
        capabilities2.setCapability("platformName", "Android");
        capabilities2.setCapability("newCommandTimeout", "3000");
        capabilities2.setCapability("deviceName", device );
        capabilities2.setCapability("udid",device);
        capabilities2.setCapability("appPackage", appPackage);
        capabilities2.setCapability("appActivity",appActivity);

        driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities2);
        wait = new WebDriverWait(driver, 20);



    }
}
