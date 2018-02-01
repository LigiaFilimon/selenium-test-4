package org.fasttrackit.Cart;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;

public class CartTest {

    @Test
public void addProductToCart(){
        System.setProperty("webdriver.chrome.driver",
                "/Users/Darius/Documents/webdrivers/chromedriver");
    WebDriver driver = new ChromeDriver();

    driver.get("https://fasttrackit.org/selenium-test/");
//driver.findElement(By.name("q")).sendKeys("vase"+ Keys.ENTER);//
        //driver.findElement(By.className("input-text")).sendKeys("vase"+Keys.ENTER);//
        driver.findElement(By.tagName("input")).sendKeys("vase"+Keys.ENTER);
        System.out.println("Pressed enter in search field");

//cel mai bine e sa cautam dupa id, name, class name.pe ultimul loc xpath.//
    driver.findElement(By.xpath("//div[@class ='product-info' and ./descendant::*[text()='Herald Glass Vase']]//button[contains(@class, 'btn-cart')]")).click();
WebElement successMessageContainer = driver.findElement(By.cssSelector("li.success-msg"));
assertThat("product not added to cart",successMessageContainer.getText(), containsString("Herald Glass Vase"));
        // todo: assert that product is present in cart

    }




}
