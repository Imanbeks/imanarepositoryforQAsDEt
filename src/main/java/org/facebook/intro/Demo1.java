package org.facebook.intro;

import com.github.javafaker.Faker;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;



public class Demo1 {


    static com.github.javafaker.Faker faker = new Faker();


    public static String genereteFakeName(){
        return faker.name().firstName();
    }
    public static String genereteMail(){
        return faker.internet().emailAddress();
    }
    public static String genereteAddress(){
        return faker.address().fullAddress();
    }
    public static String genereteAddress2(){
        return faker.address().secondaryAddress();
    }





    @Test
    public void testDemo1() {
        WebDriverManager.chromedriver().setup(); // Configure ChromeDriver to connect browser

        WebDriver driver = new ChromeDriver(); // Creating instance of ChromeDriver
        driver.manage().window().maximize(); // Maximizing window
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); // Driver will wait 20 secs


        driver.get("https://demoqa.com/text-box");
        String name = "Iman";
        String email = "imanstalbekov@gmail.com";
        String Address1 = "Aitmatova 1";
        String Address2 = "Manas 1";

        String fakeName = faker.name().firstName();
        String fakeEmail = faker.internet().emailAddress();
        String fakeAddress = faker.address().fullAddress();
        String fakeAddress2 = faker.address().secondaryAddress();

        WebElement fullNameInputField = driver.findElement(By.id("userName"));
        fullNameInputField.sendKeys(fakeName);
        String par = fullNameInputField.getText();



        WebElement userEmail = driver.findElement(By.id("userEmail"));
        userEmail.sendKeys(fakeEmail);

        WebElement currentAddress = driver.findElement(By.id("currentAddress"));
        currentAddress.sendKeys(fakeAddress);

        WebElement permanentAddress = driver.findElement(By.id("permanentAddress"));
        permanentAddress.sendKeys(fakeAddress2);

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,250)", "");

        WebElement submitButton = driver.findElement(By.id("submit"));
        submitButton.click();

        WebElement actualname = driver.findElement(By.id("name"));
        WebElement actualemail = driver.findElement(By.id("email"));
        WebElement actualaddress = driver.findElement(By.className("mb-1")).findElement(By.id("currentAddress"));
        WebElement actualaddress2 = driver.findElement(By.id("name"));
    }


}
