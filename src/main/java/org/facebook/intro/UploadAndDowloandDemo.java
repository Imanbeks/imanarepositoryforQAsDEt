package org.facebook.intro;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class UploadAndDowloandDemo extends BaseTest{
    @Test
    public void test1(){
        driver.navigate().to("https://demoqa.com/upload-download");
        driver.findElement(By.id("uploadFile")).sendKeys("C://Users//User//Pictures//Screenshots//Снимок экрана_20221130_021736.png");
        Helper.pause(5000);
    }

}
