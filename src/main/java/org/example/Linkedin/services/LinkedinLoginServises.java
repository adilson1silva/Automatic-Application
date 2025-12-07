
package org.example.Linkedin.services;


import org.example.Linkedin.pages.LinkedinLoginPage;
import org.openqa.selenium.WebDriver;

public class LinkedinLoginServises {
    private final LinkedinLoginPage loginPage;

    public LinkedinLoginServises(WebDriver driver) {
        this.loginPage = new LinkedinLoginPage(driver);
    }

    public void login(String email, String password) {
        loginPage.open();
        loginPage.typeEmail(email);
        loginPage.typePassword(password);
        loginPage.clickLoginBooton();
    }
}
