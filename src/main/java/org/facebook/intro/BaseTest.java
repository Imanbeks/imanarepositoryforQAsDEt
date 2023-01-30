package org.facebook.intro;

import com.beust.ah.A;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.facebook.BrowserHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

public class BaseTest {
    WebDriver driver;
    BrowserHelper browserHelper;

    AlertHelper alertHelper;

    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup(); // Configure ChromeDriver to connect browser

        driver = new ChromeDriver(); // Creating instance of ChromeDriver
        driver.manage().window().maximize(); // Maximizing window
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); // Driver will wait 20 secs
        browserHelper = new BrowserHelper(driver);
        alertHelper = new AlertHelper(driver);
    }


    @AfterClass
    public void exits() throws InterruptedException {
        Thread.sleep(30000);
        driver.close();
        driver.quit();
    }
}

