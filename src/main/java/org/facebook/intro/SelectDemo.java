package org.facebook.intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class SelectDemo extends BaseTest{
    @Test
    public void test1(){
        driver.navigate().to("https://demoqa.com/select-menu");
        WebElement checkiman = driver.findElement(By.id(""));
    }
}
