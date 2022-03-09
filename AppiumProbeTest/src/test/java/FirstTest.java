import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FirstTest {
    public AndroidDriver<WebElement> driver;
    public WebDriverWait wait;
    @Before
    public void setUp() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();

        driver = new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        wait = new WebDriverWait(driver,30);
        capabilities.setCapability("platformVersion", "9");
        capabilities.setCapability("deviceName", "emulator-5554");
        capabilities.setCapability("platformName", "Android");
        /*capabilities.setCapability("deviceUDID", "AKPNU20C12103126");
        capabilities.setCapability("app", "C:/Users/Qasquad1/IdeaProjects/AppiumProbeTest/binary/4361fd80-fd6c-4e6d-acb2-192848aec0d2.apk");
        capabilities.setCapability(MobileCapabilityType.APPLICATION_NAME,"L&G City Stage");
        capabilities.setCapability("noReset", false);
        capabilities.setCapability("fullReset", true);
        capabilities.setCapability("dontStopAppOnReset", true);*/
    }

    @Test
    public void first() throws Exception {
        TouchAction<AndroidTouchAction> holdFinger = new TouchAction<AndroidTouchAction>(driver);
        //holdFinger.press(PointOption.point(1075, 1000)).moveTo(PointOption.point(8,1000)).release().perform();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.TextView[@content-desc = 'L&G City Stage']")));
        driver.findElement(By.xpath("//android.widget.TextView[@content-desc='L&G City Stage']")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.ladygentleman.app:id/cardView")));
        driver.findElement(By.xpath("//android.widget.TextView[@text = 'Каталог']")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.ladygentleman.app:id/toolbar_only_title_container")));
        driver.runAppInBackground(Duration.ofSeconds(-1));
        //driver.terminateApp("com.ladygentleman.app");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.TextView[@content-desc = 'L&G City Stage']")));
        driver.findElement(By.xpath("//android.widget.TextView[@content-desc='L&G City Stage']")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.ladygentleman.app:id/cardView")));
        driver.terminateApp("com.ladygentleman.app");
    }

    @After
    public void after() {
        driver.quit();
    }
}