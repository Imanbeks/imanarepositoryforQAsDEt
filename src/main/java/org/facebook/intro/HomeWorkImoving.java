package org.facebook.intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

public class HomeWorkImoving extends BaseTest {
    @Test
    public void HomeWork() {

        driver.get("https://www.imoving.com");
        WebElement houseTypeSeelectMenu = driver.findElement(By.id("houseTypeSelectList"));
        Select select = new Select(houseTypeSeelectMenu);
        select.selectByValue("1080");
        Helper.pause(3000);
        WebElement moveSizeMenu = driver.findElement(By.id("hp-nav-select-house"));
        Select select2 = new Select(moveSizeMenu);
        select2.selectByVisibleText("Just a few Items");
        Helper.pause(3000);
        WebElement clickQuotes = driver.findElement(By.xpath("//button[@class='btn btn-white quickQuoteLink']"));
        clickQuotes.click();
        WebElement Continue = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div/a[2]"));
        Continue.click();
        Helper.pause(3000);
        WebElement GotIT = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div/a"));
        GotIT.click();
        WebElement Ok1 = driver.findElement(By.id("closeTutorial"));
        Ok1.click();

        Actions action = new Actions(driver);
        WebElement bedImageContainer = driver.findElement(By.xpath("//div[@class='13']//figure"));
        action.moveToElement(bedImageContainer).build().perform();
        driver.findElement(By.xpath("//div[@class='13']//a[@class='btn btn-blue'][normalize-space()='Add to Inventory']")).click();
        Helper.pause(3000);
        WebElement bedImageContainer1 = driver.findElement(By.xpath("//div[@class='12']//figure"));
        action.moveToElement(bedImageContainer1).build().perform();
        driver.findElement(By.xpath("//div[@class='12']//a[@class='btn btn-blue'][normalize-space()='Add to Inventory']")).click();
        Helper.pause(3000);

        WebElement bedImageContainer3 = driver.findElement(By.xpath("//div[@class='14']//figure"));
        action.moveToElement(bedImageContainer3).build().perform();
        driver.findElement(By.xpath("//div[@class='14']//a[@class='btn btn-blue'][normalize-space()='Add to Inventory']")).click();
        Helper.pause(3000);

        WebElement inputBox = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div[1]/div[1]/div[1]/div[1]/a/div/span[1]"));
        Assert.assertEquals(inputBox.getText(), "3 items");

        WebElement JustBox = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div[2]/div[1]/div[1]"));
        JustBox.click();
        WebElement PlusBox = driver.findElement(By.xpath("(//span[@class=\"roomPanelIcon quantity-plus1\"])[1]"));
        PlusBox.click();

        WebElement Dressertext = driver.findElement(By.xpath("//*[@id=\"room9510_0\"]/div[1]/ul/li[2]/h3[1]"));
        Assert.assertEquals(Dressertext.getText(), "Dresser");
        Helper.pause(3000);

        WebElement BedText = driver.findElement(By.xpath("//*[@id=\"room9510_0\"]/div[2]/ul/li[2]/h3[1]"));
        Assert.assertEquals(BedText.getText(), "Bed (All parts included)");
        Helper.pause(3000);

        WebElement TvText = driver.findElement(By.xpath("//*[@id=\"room9510_0\"]/div[3]/ul/li[2]/h3[1]"));
        Assert.assertEquals(TvText.getText(), driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/main/div/div[1]/section/div[2]/div/div[3]/div/div/figure/figcaption")).getText());
        Helper.pause(3000);

        WebElement CompleteBox = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div[1]/div[2]/ul/li[4]"));
        CompleteBox.click();
        Helper.pause(3000);

        WebElement Plusplus = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div/div/ul/li[1]/div[1]/span/button[2]"));
        action.doubleClick(Plusplus).perform();
        Helper.pause(3000);


    }

}
