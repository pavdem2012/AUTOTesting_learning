import org.junit.Test;
import org.openqa.selenium.By;

public class CheckBoxTest  extends Settings{
        String baseUrl = "https://demoqa.com/checkbox";


    @Test
    public void testCheckBox() throws InterruptedException {
        open(baseUrl);
        driver.findElement(By.className("rct-checkbox")).click();
        Thread.sleep(500);
        driver.findElement(By.className("rct-checkbox")).click();
        Thread.sleep(500);
        driver.findElement(By.xpath("//button[@aria-label=\"Expand all\"]")).click();
        Thread.sleep(500);
        driver.findElement(By.xpath("//button[@aria-label=\"Collapse all\"]")).click();
        Thread.sleep(500);
        driver.findElement(By.xpath("//span[contains(text(),'Home')]/ancestor::span/button")).click();
        Thread.sleep(500);
        driver.findElement(By.xpath("//label[@for='tree-node-desktop']/preceding-sibling::button")).click();
        Thread.sleep(500);
        driver.findElement(By.xpath("//label[@for='tree-node-documents']/preceding-sibling::button")).click();
        Thread.sleep(500);
        driver.findElement(By.xpath("//label[@for='tree-node-downloads']/preceding-sibling::button")).click();
        Thread.sleep(500);
        driver.findElement(By.xpath("//label[@for='tree-node-workspace']/preceding-sibling::button")).click();
        Thread.sleep(500);
        driver.findElement(By.xpath("//label[@for='tree-node-office']/preceding-sibling::button")).click();
        Thread.sleep(500);
        driver.findElement(By.xpath("//span[contains(text(),'Excel File.doc')]/preceding-sibling::span[@class='rct-checkbox']")).click();
        Thread.sleep(500);
        driver.findElement(By.xpath("//span[contains(text(),'Word File.doc')]/preceding-sibling::span[@class='rct-checkbox']")).click();
        Thread.sleep(500);
        driver.findElement(By.xpath("//span[contains(text(),'General')]/preceding-sibling::span[@class='rct-checkbox']")).click();
        Thread.sleep(500);
        driver.findElement(By.xpath("//span[contains(text(),'Classified')]/preceding-sibling::span[@class='rct-checkbox']")).click();
        Thread.sleep(500);
        driver.findElement(By.xpath("//span[contains(text(),'Private')]/preceding-sibling::span[@class='rct-checkbox']")).click();
        Thread.sleep(500);
        driver.findElement(By.xpath("//span[contains(text(),'Public')]/preceding-sibling::span[@class='rct-checkbox']")).click();
        Thread.sleep(500);
        driver.findElement(By.xpath("//span[contains(text(),'Veu')]/preceding-sibling::span[@class='rct-checkbox']")).click();
        Thread.sleep(500);
        driver.findElement(By.xpath("//span[contains(text(),'Angular')]/preceding-sibling::span[@class='rct-checkbox']")).click();
        Thread.sleep(500);
        driver.findElement(By.xpath("//span[contains(text(),'React')]/preceding-sibling::span[@class='rct-checkbox']")).click();
        Thread.sleep(500);
        driver.findElement(By.xpath("//span[contains(text(),'Commands')]/preceding-sibling::span[@class='rct-checkbox']")).click();
        Thread.sleep(500);
        driver.findElement(By.xpath("//span[contains(text(),'Notes')]/preceding-sibling::span[@class='rct-checkbox']")).click();
        Thread.sleep(500);
        driver.findElement(By.xpath("//span[contains(text(),'Downloads')]/preceding-sibling::span[@class='rct-checkbox']")).click();
        Thread.sleep(500);
        driver.findElement(By.xpath("//span[contains(text(),'Office')]/preceding-sibling::span[@class='rct-checkbox']")).click();
        Thread.sleep(500);
        driver.findElement(By.xpath("//span[contains(text(),'WorkSpace')]/preceding-sibling::span[@class='rct-checkbox']")).click();
        Thread.sleep(500);
        driver.findElement(By.xpath("//span[contains(text(),'Documents')]/preceding-sibling::span[@class='rct-checkbox']")).click();
        Thread.sleep(500);
        driver.findElement(By.xpath("//span[contains(text(),'Documents')]/preceding-sibling::span[@class='rct-checkbox']")).click();
        Thread.sleep(500);
        driver.findElement(By.xpath("//span[contains(text(),'Desktop')]/preceding-sibling::span[@class='rct-checkbox']")).click();
        Thread.sleep(500);
        driver.findElement(By.xpath("//span[contains(text(),'Home')]/preceding-sibling::span[@class='rct-checkbox']")).click();
        Thread.sleep(500);
        driver.findElement(By.xpath("//span[contains(text(),'Home')]/preceding-sibling::span[@class='rct-checkbox']")).click();
        Thread.sleep(500);
    }
    }


