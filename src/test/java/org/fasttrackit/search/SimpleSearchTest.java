package org.fasttrackit.search;

import org.fasttrackit.TestBase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.xml.soap.Text;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;
@RunWith(Parameterized.class)

public class SimpleSearchTest extends TestBase {
private String keyword;
public SimpleSearchTest(String keyword){
    this.keyword = keyword;

}

@Parameterized.Parameters
public static List<String> inputData() {
    return Arrays.asList("vase", "camera");
}
    @Test

    public void SimpleSearchWithOneKeyword() {
        //System.setProperty("webdriver.chrome.driver",
               // "/Users/Darius/Documents/webdrivers/chromedriver");
        //WebDriver driver = new ChromeDriver();

       // driver.get("https://fasttrackit.org/selenium-test/");
//driver.findElement(By.name("q")).sendKeys("vase"+ Keys.ENTER);//
        //driver.findElement(By.className("input-text")).sendKeys("vase"+Keys.ENTER);//
       String keyword = "vase";
        driver.findElement(By.tagName("input")).sendKeys(keyword + Keys.ENTER);
        System.out.println("pressed enter in search field");
//cel mai bine e sa cautam dupa id, name, class name.pe ultimul loc xpath.//

        List<WebElement> productNames = driver.findElements(By.cssSelector("h2.product-name a"));
        System.out.println("stored"+ productNames.size()+ "product names from search results");
        for (WebElement productName : productNames) {
            assertThat("some of the product names do not contain the search keyword",
                    productName.getText(), containsString(keyword.toUpperCase()));
        }


    }


    @Test
    public void SpecialPriceElements() {
        //System.setProperty("webdriver.chrome.driver",
               // "/Users/Darius/Documents/webdrivers/chromedriver");
        driver.get("https://fasttrackit.org/selenium-test/");
        driver.findElement(By.name("q")).sendKeys("vase" + Keys.ENTER);
        String oldPrice = driver.findElement(By.xpath("//p[@class = 'old-price']//span[@class = 'price']")).getText();
        String specialPrice = driver.findElement(By.xpath("//p[@class ='special-price']//span[@class = 'price']")).getText();

    }
}
