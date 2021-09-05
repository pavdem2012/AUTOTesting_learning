import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {
    public WebDriver driver;
    public String baseUrl;

    @Before
    public void before(){
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver=new ChromeDriver();
        baseUrl = "https://ya.ru";
        driver.manage().window().maximize();
    }
    @Test
    public void first(){
        driver.get(baseUrl);
        driver.findElement(By.id("text")).sendKeys("Где деньги");
        driver.findElement(By.className("search2__button")).click();
        driver.findElement(By.xpath("//ul/li[2]/div[1]/a/span")).click();
        driver.findElement(By.className("serp-header__logo")).click();
    }

    @After
    public void quit(){
        driver.quit();
    }
}
