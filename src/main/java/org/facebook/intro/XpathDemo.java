package org.facebook.intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class XpathDemo {

    WebDriver driver;



    @BeforeClass
    public void setUp(){
        WebDriverManager.chromedriver().setup(); // Configure ChromeDriver to connect browser

        driver = new ChromeDriver(); // Creating instance of ChromeDriver
        driver.manage().window().maximize(); // Maximizing window
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); // Driver will wait 20 secs
        driver.get("https://demoqa.com/text-box");

    }
    @Test
    public void testDemo1() {
        WebElement nameText = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/form/div[2]/div[1]/label"));
        String expectedEmailText = "Email";
        String expectedFullName = "Full Name";
        Assert.assertEquals(nameText.getText(), expectedEmailText);
        WebElement nameText2 = driver.findElement(By.xpath("//label[@id='userName-label'] "));
        Assert.assertTrue(expectedFullName.contains(nameText2.getText()));


    }

    @Test
    public void xpathTest2(){
        WebElement userName = driver.findElement(By.xpath("//input[@id='userName']"));
        userName.sendKeys("Test123");
        System.out.println("Result is : " +userName.getAttribute("value"));
        Assert.assertEquals(userName.getAttribute("value"), "Test123");
    }

    @AfterClass
    public void exits(){
        driver.close();
        driver.quit();
    }
}
