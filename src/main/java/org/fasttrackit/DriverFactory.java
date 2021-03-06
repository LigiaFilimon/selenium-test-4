package org.fasttrackit;

import org.fasttrackit.webViews.AppConfig;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.concurrent.TimeUnit;

public class DriverFactory {

    public static WebDriver getWebDriver(String browser) {
        WebDriver driver;

        switch (browser) {
            default:
                System.out.println("Using default browser: Chrome");
            case "chrome":
                System.setProperty("webdriver.chrome.driver",
                        "/Users/Darius/Documents/webdrivers/chromedriver");
                driver = new ChromeDriver();
                break;
            case "firefox":
                System.setProperty("webdriver.firefox.marionette",
                        "/Users/Darius/Documents/webdrivers/geckodriver");
                driver = new FirefoxDriver();
                break;
            case "ie":
System.setProperty("webdriver.ie.driver", AppConfig.getIeDriverPath());
                driver = new InternetExplorerDriver();
                break;

        }

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        return driver;


    }
}
