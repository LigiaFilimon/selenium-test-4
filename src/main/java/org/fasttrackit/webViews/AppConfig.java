package org.fasttrackit.webViews;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class AppConfig {
private static Properties properties = new Properties();
static {
    String environment =System.getProperty("env", "production");
    InputStream inputStream = AppConfig.class.getClassLoader().getResourceAsStream(environment + "properties");
    try {
        properties.load(inputStream);
    } catch (IOException e) {
        e.printStackTrace();
    }
}
private static String chromeDriverPath= properties.getProperty("chrome.driver.path");
private static long implicitTimeout = Long.parseLong(properties.getProperty("implicit.timeout"));
private static String geckoDriverPath=properties.getProperty("gecko.driver.path");
private static String ieDriverPath =properties.getProperty("ie.driver.path");
private static String siteUrl= String.valueOf(properties.get("site.url"));

    public static String getChromeDriverPath() {
        return chromeDriverPath;
    }

    public static long getImplicitTimeout() {
        return implicitTimeout;
    }

    public static String getGeckoDriverPath() {
        return geckoDriverPath;
    }

    public static String getIeDriverPath() {
        return ieDriverPath;
    }

    public static String getSiteUrl() {
        return siteUrl;
    }
}
