import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TestForm extends Settings {

            String baseUrl = "https://demoqa.com/automation-practice-form";


        @Test
        public void testCheckBox() throws InterruptedException {
            open(baseUrl);
/*            driver.findElement(By.cssSelector("#firstName")).sendKeys("John");
            driver.findElement(By.cssSelector("#lastName")).sendKeys("Silver");
            driver.findElement(By.cssSelector("#userEmail")).sendKeys("pirate@tortuga.car");
            driver.findElement(By.xpath("//label[@for='gender-radio-1']")).click();
            driver.findElement(By.id("userNumber")).sendKeys("0000000000");
            driver.findElement(By.id("dateOfBirthInput")).click();
*//*            Select rows = new Select(driver.findElement(By.xpath("//select[@class=\"react-datepicker__month-select\"]")));
            rows.selectByValue("2");
            Select rows1 = new Select(driver.findElement(By.xpath("//select[@class=\"react-datepicker__year-select\"]")));
            rows1.selectByValue("1975");*//*
            driver.findElement(By.cssSelector(".react-datepicker__month-select")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//option[@value = '2']")).click();
            Thread.sleep(2000);
            driver.findElement(By.cssSelector(".react-datepicker__year-select")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//option[@value = '1975']")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//div[@class = 'react-datepicker__day react-datepicker__day--016 react-datepicker__day--weekend']")).click();
            Thread.sleep(2000);
            driver.findElement(By.cssSelector("#subjectsInput")).sendKeys("e");
            Thread.sleep(1000);
            driver.findElement(By.xpath("//div[contains(@class, 'subjects-auto-complete__menu')]/div[5]")).click();
            driver.findElement(By.cssSelector("#subjectsInput")).sendKeys("e");
            Thread.sleep(1000);
            driver.findElement(By.xpath("//div[contains(@class, 'subjects-auto-complete__menu')]/div[3]")).click();
            driver.findElement(By.xpath("//label[@for='hobbies-checkbox-2']")).click();
            driver.findElement(By.cssSelector("#subjectsInput")).sendKeys("e");
            Thread.sleep(1000);
            driver.findElement(By.xpath("//div[contains(@class, 'subjects-auto-complete__menu')]/div[1]")).click();
            driver.findElement(By.id("uploadPicture")).sendKeys("C:\\Users\\Qasquad1\\IdeaProjects\\demenchuk.p\\1.jpg");
            driver.findElement(By.id("currentAddress")).sendKeys("пр. Строителей, 23,\n Новосибирск,\n Новосибирская обл., 630128");
            Thread.sleep(1000);
            String attr = driver.findElement(By.id("react-select-4-input")).getAttribute("visibility:");
            System.out.println("ПРОВЕРКА: " + attr);*/
            driver.findElement(By.xpath("//div[@class=' css-yk16xz-control']")).click();
            Thread.sleep(2000);
            WebElement value = driver.findElement(By.xpath("//div[contains(@class, 'css-26l3qy-menu')]/div/div"));
            value.click();
        }

    }

