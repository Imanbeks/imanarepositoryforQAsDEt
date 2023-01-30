package org.facebook.intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class GlovoTest {
    WebDriver driver;



    @BeforeClass
    public void setUp(){
        WebDriverManager.chromedriver().setup(); // Configure ChromeDriver to connect browser

        driver = new ChromeDriver(); // Creating instance of ChromeDriver
        driver.manage().window().maximize(); // Maximizing window
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); // Driver will wait 20 secs
        driver.get("https://glovoapp.com/kg/ru/?utm_source=google&utm_medium=cpc&utm_campaign=google_search_brandprotection_newusers_KG_Exact_digitalbudget_russian&utm_campaignid=12080853559&utm_adgroupid=114978107023&utm_term=glovo&utm_matchtype=e&utm_device=c&gclid=EAIaIQobChMI38fOjcjE_AIVVPiyCh0gfgA9EAAYASAAEgLzoPD_BwE");

    }
    @Test
            public void TestGlovo() {
        WebElement submitButton = driver.findElement(By.xpath("(//*[@id='user-register'])[2]"));
        submitButton.click();

        WebElement name = driver.findElement(By.xpath("(//div[@id='signup-name'])"));
        name.sendKeys("Test123");
        WebElement email = driver.findElement(By.xpath("(//div[@id='signup-email'])"));
        email.sendKeys("Test@gmail.com");
        WebElement password = driver.findElement(By.xpath("(//div[@id='signup-password'])"));
        name.sendKeys("12345678");

        WebElement Button = driver.findElement(By.xpath("(//*[@id='signup-button'])"));
        Button.click();
    }



    @AfterClass
    public void exits(){
        driver.close();
        driver.quit();
    }
}
