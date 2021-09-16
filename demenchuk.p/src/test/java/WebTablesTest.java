import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class WebTablesTest  extends Settings{

        String baseUrl = "https://demoqa.com/webtables";

    @Test
    public void testCheckBox() throws InterruptedException {
        open(baseUrl);
        driver.findElement(By.xpath("//select[@aria-label=\"rows per page\"]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//option[@value=\"25\"]")).click();
        Actions scroll = new Actions(driver);
        scroll.moveToElement(driver.findElement(By.xpath("//span[@class=\"-pageInfo\"]"))).perform();
        Thread.sleep(5000);
        Select rows = new Select(driver.findElement(By.xpath("//select[@aria-label=\"rows per page\"]")));
        rows.selectByValue("5");
        for (int i = 0; i < 3; i++) {
            driver.findElement(By.id("addNewRecordButton")).click();
            driver.findElement(By.id("firstName")).sendKeys("John");
            driver.findElement(By.id("lastName")).sendKeys("Smith");
            driver.findElement(By.id("userEmail")).sendKeys("bla@bla.bla");
            driver.findElement(By.id("age")).sendKeys("999");
            driver.findElement(By.id("salary")).sendKeys("9999999999");
            driver.findElement(By.id("department")).sendKeys("Goverment");
            driver.findElement(By.id("submit")).click();
            Thread.sleep(1000);
        }
        driver.findElement(By.xpath("//button[contains(text(),\"Next\")]")).click();
        Thread.sleep(5000);
    }

}
