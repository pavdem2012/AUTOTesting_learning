import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MyTest extends Settings {


    String baseUrl = "https://demoqa.com/text-box";


    @Test
    public void test() throws InterruptedException {
        open(baseUrl);
        WebElement element = driver.findElement(By.id("userName"));
        element.sendKeys("блабла");
        WebElement element1 = driver.findElement(By.id("userEmail"));
        element1.sendKeys("test@test.com");
        WebElement element2 = driver.findElement(By.id("currentAddress"));
        element2.sendKeys("ул. Бутырский Вал\nпл. Пречистинские Ворота\nБольшой Козихинский пер.\n" +
                "ул. Академика Миллионщикова\nул. Генерала Белова\nул. Космонавта Волкова");
        WebElement element3 = driver.findElement(By.id("permanentAddress"));
        element3.sendKeys("ул. Бутырский Вал\nпл. Пречистинские Ворота\nБольшой Козихинский пер.\n" +
                "ул. Академика Миллионщикова\nул. Генерала Белова\nул. Космонавта Волкова");
        WebElement submitKey = driver.findElement(By.id("submit"));
        submitKey.click();
        Thread.sleep(2000);
    }

}
