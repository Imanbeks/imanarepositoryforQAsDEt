package org.facebook.intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class HomeWorkWebTables extends BaseTest{
    @Test
    public void test1(){
        driver.get("https://demoqa.com/webtables");
        WebElement addBox = driver.findElement(By.id("addNewRecordButton"));
        addBox.click();
        WebElement Firstname = driver.findElement(By.xpath("//*[@id=\"firstName\"]"));
        Firstname.sendKeys("Iman");
        //Helper.pause(1000);
        WebElement Lastname = driver.findElement(By.xpath("//*[@id=\"lastName\"]"));
        Lastname.sendKeys("Stalbekov");
        //Helper.pause(1000);
        WebElement emailname = driver.findElement(By.xpath("//*[@id=\"userEmail\"]"));
        emailname.sendKeys("imanstalbekov@gmail.com");
       // Helper.pause(1000);
        WebElement Agename = driver.findElement(By.xpath("//*[@id=\"age\"]"));
        Agename.sendKeys("21");
       // Helper.pause(1000);
        WebElement Salaryname = driver.findElement(By.xpath("//*[@id=\"salary\"]"));
        Salaryname.sendKeys("250000");
       // Helper.pause(1000);
        WebElement Departmentname = driver.findElement(By.xpath("//*[@id=\"department\"]"));
        Departmentname.sendKeys("ShefBrat");
       // Helper.pause(1000);
        WebElement SubmitBox = driver.findElement(By.id("submit"));
        SubmitBox.click();

        List<WebElement> allTable = driver.findElements(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[3]"));

        for (WebElement e : allTable){
            System.out.println(e.getText());
        }




    }
}
