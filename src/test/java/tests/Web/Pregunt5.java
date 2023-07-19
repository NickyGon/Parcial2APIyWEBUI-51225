package tests.Web;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.dataProperties.TodoIstProperties;
import webInterface.singletonSession.Session;

import javax.xml.crypto.Data;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;
import java.util.Date;

import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;
import static org.openqa.selenium.support.ui.ExpectedConditions.invisibilityOfElementLocated;

public class Pregunt5 extends TestBaseP5{
    @Test
    public void verifyPregunta5Sucess() throws InterruptedException {
        String name= "Arble"+new Date().getTime();
        String company="OMRON";
        String intro="2020-10-10";
        Date date = Calendar.getInstance().getTime();
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String dis= dateFormat.format(date);
        mainSection.addComputer.click();
       Thread.sleep(1000);

       createSection.name.setText(name);
       createSection.setCreate(company);
        Thread.sleep(1000);
        mainSection.setMessage(name);
       createSection.introduced.setText(intro);
        Thread.sleep(1000);

       createSection.discontinued.setText(dis);
        Thread.sleep(1000);
       createSection.listClick.click();
        Thread.sleep(1000);
       createSection.getCompany.click();
        Thread.sleep(1000);
        createSection.listClick.click();

        Thread.sleep(1000);

       createSection.create.click();

        Thread.sleep(3000);

        Assertions.assertTrue(mainSection.message.isControlDisplayed(),
                "ERROR!! Computer "+name+" was not created!!");
    }
}
