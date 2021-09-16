import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CityLgCity extends Settings {
    @Test
    public void setCity() {
        String city = "Омск";
        open("https://lgcity.ru");
        driver.findElement(By.id("header-title-user-location")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Укажите свой город')]/../..")));
        driver.findElement(By.id("input-user-locate")).clear();
        driver.findElement(By.id("input-user-locate")).sendKeys(city);
        driver.findElement(By.id("btn-save-user-locate")).click();
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[contains(text(),'Укажите свой город')]/../..")));
        String cityInHeader = driver.findElement(By.id("header-title-user-location")).getText();
        Assert.assertEquals(city, cityInHeader);
    }

    @Test
    public void setPopularCity() {
        open("https://lgcity.ru");
        driver.findElement(By.id("header-title-user-location")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Укажите свой город')]/../..")));
        driver.findElement(By.xpath("//div[@class='locate__popular-list']/a")).click();
        String popularCity = driver.findElement(By.xpath("//div[@class='locate__popular-list']/a")).getText();
        String attr = driver.findElement(By.id("input-user-locate")).getAttribute("value");
        Assert.assertEquals(popularCity,attr);
        driver.findElement(By.id("btn-save-user-locate")).click();
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[contains(text(),'Укажите свой город')]/../..")));
        String cityInHeader = driver.findElement(By.id("header-title-user-location")).getText();
        Assert.assertEquals(popularCity, cityInHeader);
    }

    @Test
    public void closePopup() {
        String city = "Омск";
        open("https://lgcity.ru");
        String cityInHeader = driver.findElement(By.id("header-title-user-location")).getText();
        driver.findElement(By.id("header-title-user-location")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Укажите свой город')]/../..")));
        driver.findElement(By.id("input-user-locate")).clear();
        driver.findElement(By.id("input-user-locate")).sendKeys(city);
        driver.findElement(By.xpath("//div[@class='locate__title-icon-box js-popup-close']")).click();
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[contains(text(),'Укажите свой город')]/../..")));
        Assert.assertNotEquals(cityInHeader, city);
    }
    @Test
    public void automaticSetCity() throws InterruptedException {

        open("https://lgcity.ru");
        String city = "Воронеж";
        driver.findElement(By.id("header-title-user-location")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Укажите свой город')]/../..")));
        driver.findElement(By.id("input-user-locate")).clear();
        driver.findElement(By.id("input-user-locate")).sendKeys(city);
        driver.findElement(By.id("btn-save-user-locate")).click();
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[contains(text(),'Укажите свой город')]/../..")));
        String cityInHeader = driver.findElement(By.id("header-title-user-location")).getText();
        Assert.assertEquals(city, cityInHeader);
        driver.findElement(By.id("header-title-user-location")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Укажите свой город')]/../..")));
        driver.findElement(By.id("input-user-locate")).clear();
        driver.findElement(By.xpath("//a[@class='locate__input-auto']")).click();
        driver.findElement(By.id("btn-save-user-locate")).click();
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[contains(text(),'Укажите свой город')]/../..")));
        cityInHeader = driver.findElement(By.id("header-title-user-location")).getText();
        Assert.assertNotEquals(cityInHeader, city);
    }
}
