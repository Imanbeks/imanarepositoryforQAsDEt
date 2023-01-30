package org.facebook.intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class Waits extends BaseTest{
    @Test
    public void testExplicitwait(){
        driver.navigate().to("https://demoqa.com/dynamic-properties");
        WebElement enableAfter = driver.findElement(By.id("enableAfter"));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(enableAfter)).click();


        wait.until(ExpectedConditions.attributeContains(By.id("colorChange"),
                "class", "text-danger"));
        WebElement colorChange = driver.findElement(By.id("colorChange"));
        colorChange.click();
    }
    @Test
    public void test2(){
        driver.navigate().to("https://demoqa.com/dynamic-properties");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("visibleAfter"))).click();
    }
    @Test
    public void EtsyTest(){
        driver.navigate().to("https://www.etsy.com/");

        WebElement click1 = driver.findElement(By.xpath("//button[@class='wt-btn wt-btn--small wt-btn--transparent wt-mr-xs-1 inline-overlay-trigger signin-header-action select-signin']"));
        click1.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("join-neu-overlay-title")));
        WebElement emailcheck = driver.findElement(By.id("join_neu_email_field"));
        emailcheck.sendKeys("imanstalbekov@gmail.com");
        WebElement passwordcheck = driver.findElement(By.id("join_neu_password_field"));
        passwordcheck.sendKeys("Imanbek228");
        WebElement Signinbox = driver.findElement(By.xpath("//button[@class='wt-btn wt-btn--primary wt-width-full']"));
        Signinbox.click();
    }
}
