package org.example.Linkedin.core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {
    protected static WebDriver driver;
    @BeforeClass
    public static void setUp(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://linkedin.com/");
    }
    @AfterClass
    public static void tearDown(){
        if (driver != null) {
            driver.quit();
        }
    }
}
