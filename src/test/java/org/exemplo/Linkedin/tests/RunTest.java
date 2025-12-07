package org.exemplo.Linkedin.tests;

import org.example.Linkedin.core.BaseTest;
import org.example.Linkedin.pages.LinkedinLoginPage;
import org.example.Linkedin.services.LinkedinLoginServises;
import org.testng.annotations.Test;

public class RunTest extends BaseTest {
    @Test
    public void testLoginComCredenciaisInvalidos(){
        LinkedinLoginServises loginPageService = new LinkedinLoginServises(driver);

        loginPageService.login("emailTest@hotmail.com", "passTest");

    }
}
