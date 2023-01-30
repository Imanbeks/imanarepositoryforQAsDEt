package org.facebook.intro;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class SeleniumExeption extends BaseTest {


    @Test
    public void demo1() {
        // NosuchELementExeption:

        browserHelper.openURL("https://demoqa.com/text-box");
        driver.findElement(By.id("userName1")).sendKeys("HelloWorld");
    }

    @Test
    public void noSuchWindowExeption() {
        // noSuchWIndowExeption
        browserHelper.openURL("https://demoqa.com/text-box");

        browserHelper.switchToWindow(5);
    }

    @Test
    public void noSuchFrameExceptionTest() {
        browserHelper.openURL("https://demoqa.com/text-box");
        driver.switchTo().frame(5);

    }

    @Test
    public void noSuchAlertException() {
        //noSuchAlertException
        browserHelper.openURL("https://demoqa.com/text-box");
        alertHelper.acceptAlert();
    }

    @Test
    public void InvalidSelectorException() {
        // org.openga.selenium.InvalidSelectorException
        browserHelper.openURL("https://demoqa.com/text-box");
        driver.findElement(By.xpath("(//button[@type='button'][100]"));
    }
    @Test
    public void noSuchSessionExceptionTest(){
        driver.quit();
        browserHelper.openURL("https://demoqa.com/text-box");
    }

    @Test
    public void staleElementReferenceExceptionTest(){
        // устаревшая ссылка на элемент: элемент не прикрепен к документу страницы
        browserHelper.openURL("https://www.amazon.com/");
        driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("Iphone", Keys.ENTER);
        List<WebElement> allBrands = driver.findElements(By.xpath("//div[@id='brandsRefinements']//ul/li/span/a"));
        int count = 0;
        for (WebElement e : allBrands) {
            count++;
            if (e.getText().contains("SAMSUNG")) {
                driver.findElement(By.xpath("(//div[@id='brandsRefinements']//ul/li/span/a/div/label/i)" + "[" + count + "]")).click();

            }
        }

        }
    @Test
    public void timeOutExceptionTest() {
        //
        browserHelper.openURL("https://demoqa.com/dynamic-properties");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        wait.until(ExpectedConditions.elementToBeClickable(By.id("enableAfter"))).click();

    }
    @Test
    public void test(){
        //element not Interactable
        browserHelper.openURL("https://demoqa.com/text-box");
        driver.findElement(By.id("submit")).sendKeys("Iman");
    }
    @Test
    public void test2(){
        // element not interactable exeception
        // если один элемент перекрывает другой(если нету доступа)(не закрыв одно окошко хотим кликнуть другое)
        //
        browserHelper.openURL("https://demoqa.com/radio-button");
        driver.findElement(By.id("noRadio")).sendKeys("saas"); //если кнопка дисайблед
    }

    @Test
    public void nosuchAttributeException() {
        //Причина в случае если мы пытаемся получить значение но атрибут неверный

        browserHelper.openURL("https://demoqa.com/text-box");
        driver.findElement(By.id("userName")).getAttribute("name");

    }




}
