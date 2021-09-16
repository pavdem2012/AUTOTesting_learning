import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Settings {
    public WebDriver driver;
    public String baseUrl;

    @Before
    public void Before() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();

    }
            public void open(String baseUrl){
        driver.get(baseUrl);
        driver.findElement(By.id("close-fixedban")).click();
            }
    @After
    public void quit() {
        driver.quit();
    }
}
