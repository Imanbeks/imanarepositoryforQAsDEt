package org.facebook.intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class FrameAndAlframeDemo extends BaseTest{
    @Test
    public void test1(){
        driver.get("https://demoqa.com/frames");
        driver.switchTo().frame(2);
        WebElement outputText = driver.findElement(By.id("sampleHeading"));
        System.out.println(outputText.getText());
        driver.switchTo().defaultContent();
        driver.switchTo().frame(3);
        WebElement outputText1 = driver.findElement(By.id("sampleHeading"));
        System.err.println(outputText1.getText());
        driver.switchTo().defaultContent();
        WebElement imanText = driver.findElement(By.xpath("//div[@class='pattern-backgound playgound-header']"));
        System.out.println(imanText.getText());


    }
}
