package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class MainPageValidator extends TestBase {


    @Test
    public void searchObjectsInMainField(){
        driver.findElement(By.name("search_query")).click();
        driver.findElement(By.name("search_query")).clear();
        driver.findElement(By.name("search_query")).click();
        driver.findElement(By.name("search_query")).sendKeys("New music 2021");
        driver.findElement(By.name("search_query")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("(//a[@id='endpoint']/paper-item)[16]")).click();
}
}
