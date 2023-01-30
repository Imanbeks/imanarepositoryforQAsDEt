package org.facebook.intro;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ActionsDemo extends BaseTest {

    @Test
    public void testRadioButton() throws InterruptedException {
        driver.get("https://demoqa.com/elements");
        WebElement chekBox = driver.findElement(By.xpath("//*[@id=\"item-1\"]"));
        chekBox.click();
        chekBox.isSelected();
        Thread.sleep(3000);
        WebElement chekBox1 = driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/span/button"));
        chekBox1.click();
        Thread.sleep(3000);
        WebElement chekBox2 = driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[1]/span/button"));
        chekBox2.click();
        Thread.sleep(3000);
        WebElement chekBox3 = driver.findElement(By.xpath("(.//span[@class='rct-checkbox'])[3]"));
        chekBox3.click();


//        WebElement yesRadio = driver.findElement(By.xpath(".//label[@for='yesRadio']"));
//        yesRadio.click();
//
//        yesRadio.isSelected();
//        Thread.sleep(3000);
//        Assert.assertTrue( yesRadio.isEnabled());

//        WebElement yesText = driver.findElement(By.xpath("//p[@class='mt-3']"));
//        yesText.getText();
//        String Im = "You have selected Yes1";
//        Assert.assertEquals(yesText.getText(), Im);


    }

    @Test
    public void testRightClick() {
        driver.get("https://demoqa.com/upload-download");
        Actions actions = new Actions(driver);

//       WebElement doubleclicks = driver.findElement(By.id("doubleClickBtn"));
//
//       actions.doubleClick(doubleclicks).perform();
//       Helper.pause(3000);
//       Assert.assertEquals(driver.findElement(By.id("doubleClickMessage")).getText(), "You have done a double click");
//
//       WebElement rightClickBtn = driver.findElement(By.id("rightClickBtn"));
//       actions.contextClick(rightClickBtn).perform();
//       Assert.assertTrue(driver.findElement(By.id("rightClickMessage")).getText().contains("You have done a right click"));
//
////       WebElement clickMeBtn = driver.findElement(By.xpath("//button[text() = 'Click Me']"));
////       actions.click(clickMeBtn).perform();
//
//        Helper.pause(3000);
//       WebElement clickMessage = driver.findElement(By.id("dynamicClickMessage"));
//       Assert.assertEquals(clickMessage.getText(), "You have done a dynamic click");

        WebElement dowlandBtn = driver.findElement(By.id("downloadButton"));

    }
    @Test
    public void testMoveElement(){
        driver.get("https://www.imoving.com");
        WebElement houseTypeSeelectMenu = driver.findElement(By.id("houseTypeSelectList"));
        Select select = new Select(houseTypeSeelectMenu);
        select.selectByValue("1080");
        Helper.pause(3000);
        select.selectByVisibleText("My Apartment");
        Helper.pause(3000);
        select.selectByIndex(3);
        Helper.pause(3000);

    }
}
