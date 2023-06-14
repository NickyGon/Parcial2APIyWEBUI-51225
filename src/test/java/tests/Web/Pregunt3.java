package tests.Web;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Date;

public class Pregunt3 extends TestBaseP3{

    @Test
    public void verifyPregunta3Sucess() throws InterruptedException {

        mainPage.signupButton.click();

        signUpSection.nameTxtBox.setText("Alessandra Mele");
        signUpSection.emailTxtBox.setText("fake"+new Date().getTime()+"@gmail.com");
        signUpSection.pwdTxtBox.setText("12345");
        signUpSection.termsCheckBox.click();
        signUpSection.signUpButton.click();

        Assertions.assertTrue(menuSection.logoutButton.isControlDisplayed(),
                "ERROR!! Sign Up was not successfully, review data!");

        projectSection.proyectButton.click();
        projectSection.enterName("AleProject"+new Date().getTime(),false);
        projectSection.projectAddButton.click();
        Thread.sleep(2000);

        Assertions.assertTrue(projectSection.projectNameLab.isControlDisplayed(),
                "ERROR!! project not created");

    }

}
