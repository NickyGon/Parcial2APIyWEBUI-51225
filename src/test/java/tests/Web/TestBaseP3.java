package tests.Web;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import webInterface.pages.todoly.*;
import webInterface.singletonSession.Session;

public class TestBaseP3 {
    protected MainPage mainPage= new MainPage();
    protected LoginSection loginSection = new LoginSection();
    protected MenuSection menuSection = new MenuSection();
    protected ProjectSection projectSection= new ProjectSection();

    public void alertAnswer(boolean accept){
        Session.getSession("chrome").dismissAlert(accept);
    }

    @BeforeEach
    public void openBrowser(){
        Session.getSession("chrome").goTo("http://todo.ly/");
    }

    @AfterEach
    public void closeBrowser(){
        Session.getSession("chrome").closeBrowser();
    }
}
