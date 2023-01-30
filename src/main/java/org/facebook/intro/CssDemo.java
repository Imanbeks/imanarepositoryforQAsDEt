package org.facebook.intro;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.security.Key;
import java.util.List;

public class CssDemo extends BaseTest {
    @Test
    public void cssTest() {
        driver.get("https://www.amazon.com/");
        driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("Iphone", Keys.ENTER);

        WebElement appleText = driver.findElement(By.cssSelector("li[id='p_89/Apple']"));
        System.out.println(appleText.getText());

        WebElement seeMore = driver.findElement(By.xpath("(//span[@class='a-expander-prompt'])[12]"));
        seeMore.click();


        List<WebElement> allBrands = driver.findElements(By.xpath("//div[@id='brandsRefinements']"));
        int count = 0;
        for (WebElement e : allBrands) {
            count++;
            if (e.getText().contains("Nokia")) {
                e.click();
                break;
            }

        }
//        WebElement Nokia = driver.findElement(By.xpath("(//span[@class='a-size-base a-color-base'])[35]"));
//        Nokia.click();
// //li[contains(@id, 'p_89']) and position()<=span
    }
}
