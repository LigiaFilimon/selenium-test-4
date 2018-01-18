package org.fasttrackit.search;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleSearchTest {

    @Test
public void SimpleSearchWithOneKeyword(){
        System.setProperty("webdriver.chrome.driver",
                "/Users/Darius/Documents/webdrivers/chromedriver");
    WebDriver driver = new ChromeDriver();

    driver.get("https://fasttrackit.org/selenium-test/");
//driver.findElement(By.name("q")).sendKeys("vase"+ Keys.ENTER);//
        //driver.findElement(By.className("input-text")).sendKeys("vase"+Keys.ENTER);//
        driver.findElement(By.tagName("input")).sendKeys("vase"+Keys.ENTER);
//cel mai bine e sa cautam dupa id//
    }




}
