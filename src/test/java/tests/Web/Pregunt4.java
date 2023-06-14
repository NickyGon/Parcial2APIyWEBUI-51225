package tests.Web;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.dataProperties.TodoIstProperties;
import webInterface.singletonSession.Session;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;
import static org.openqa.selenium.support.ui.ExpectedConditions.invisibilityOfElementLocated;

public class Pregunt4 extends TestBaseP4{
    @Test
    public void verifyPregunta4Sucess() throws InterruptedException {
        mainPage.loginButton.click();

        loginSection.emailTxtBox.setText(TodoIstProperties.host);
        loginSection.pwdTxtBox.setText(TodoIstProperties.pwd);
        menuSection.setEmail(TodoIstProperties.host);
        loginSection.loginButton.click();
        Thread.sleep(2000);


        try {
            menuSection.profile.click();
        } catch (Exception e){
            System.out.println("Caught not clickable button");
            WebDriverWait wait= new WebDriverWait(Session.getSession("chrome").getBrowser(), Duration.ofSeconds(5));
            wait.until(ExpectedConditions.and(elementToBeClickable(By.id(":r2:")),invisibilityOfElementLocated(By.xpath("//div[contains(@class,'loading_screen')]"))));
            menuSection.profile.click();
        }
        Thread.sleep(2500);

        Assertions.assertTrue(menuSection.emaillabel.isControlDisplayed(),
                "ERROR!! Login was not successfully, review credentials");

        menuSection.settings.click();
        Thread.sleep(1000);

        try {
            settingsSection.changePass.click();
        } catch (Exception e){
            System.out.println("Caught not clickable button");
            WebDriverWait wait= new WebDriverWait(Session.getSession("chrome").getBrowser(), Duration.ofSeconds(5));
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//form//div//a[@href='/app/settings/account/password']")));
            settingsSection.changePass.click();
        }
        Thread.sleep(5000);
        String newPwd="mimamamemima";
        settingsSection.currentPwd.setText(TodoIstProperties.pwd);
        settingsSection.newPwd.setText(newPwd);
        settingsSection.confirmNewPwd.setText(newPwd);

    }
}
