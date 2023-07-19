package tests.Web;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import webInterface.pages.computerdatabase.CreateSection;
import webInterface.pages.computerdatabase.MainSection;
import webInterface.singletonSession.Session;

public class TestBaseP5 {
   protected CreateSection createSection= new CreateSection();
   protected MainSection mainSection= new MainSection();

    public void alertAnswer(boolean accept){
        Session.getSession("chrome").dismissAlert(accept);
    }

    @BeforeEach
    public void openBrowser(){
        Session.getSession("chrome").goTo("http://computer-database.gatling.io/computers");
    }

    @AfterEach
    public void closeBrowser(){
        Session.getSession("chrome").closeBrowser();
    }
}
