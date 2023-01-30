package org.facebook.intro;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class AlertDemo extends BaseTest {

    @Test
    public void testAlert1() {
        driver.get("https://demoqa.com/alerts");

        WebElement alertButton = driver.findElement(By.id("alertButton"));
        alertButton.click();

        Alert alert = driver.switchTo().alert();
        alert.accept();
        Helper.pause(4000);
    }

    @Test
    public void testExplicitWaitAndAlert() {
        driver.get("https://demoqa.com/alerts");
        WebElement alertButton = driver.findElement(By.id("timerAlertButton"));
        alertButton.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5)); // ожидание 5 секун
        wait.until(ExpectedConditions.alertIsPresent()); // ждем до этого момента потом кликает
        Alert alert = driver.switchTo().alert();

        alert.accept();
    }

    @Test
    public void TestCancelOrOk() {
        driver.get("https://demoqa.com/alerts");
        WebElement alertButton = driver.findElement(By.id("confirmButton"));
        alertButton.click();
        Helper.pause(4000);
        Alert alert = driver.switchTo().alert();
        alert.dismiss();
        WebElement TextCancel = driver.findElement(By.id("confirmResult"));
        Assert.assertEquals(TextCancel.getText(), "You selected Cancel");


    }
    @Test
    public void TestPromt() {
        driver.get("https://demoqa.com/alerts");
        WebElement alertButton = driver.findElement(By.id("promtButton"));
        alertButton.click();

        Alert alert = driver.switchTo().alert();
        alert.sendKeys("Salam vsem Musilms");
        alert.accept();
        Helper.pause(4000);


    }
}

