package tests.Web;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Pregunt3 extends TestBaseP3{

    @Test
    public void verifyPregunta3Sucess(){

        mainPage.loginButton.click();

        loginSection.emailTxtBox.setText("selenium2023@upb.com");
        loginSection.pwdTxtBox.setText("12345");
        loginSection.loginButton.click();

        Assertions.assertTrue(menuSection.logoutButton.isControlDisplayed(),
                "ERROR!! login was not successfully, review credentials");


    }

}
