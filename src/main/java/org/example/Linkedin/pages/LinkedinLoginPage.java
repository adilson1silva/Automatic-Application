package org.example.Linkedin.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LinkedinLoginPage {
    private final WebDriver driver;
    private static final String LINKEDIN_LOGIN_URL = "https://www.linkedin.com/";

    @FindBy(id = "email")
    private WebElement emailImput;

    @FindBy(id = "pass")
    private WebElement passwordImput;

    @FindBy(name = "login")
    private WebElement loginBooton;

    public LinkedinLoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public  void open(){
        driver.get(LINKEDIN_LOGIN_URL);
    }

    public void typeEmail(String email){
        emailImput.clear();
        emailImput.sendKeys(email);
    }

    public void typePassword(String password){
        passwordImput.clear();
        passwordImput.sendKeys(password);
    }

    public void clickLoginBooton(){
        loginBooton.click();
    }
}
