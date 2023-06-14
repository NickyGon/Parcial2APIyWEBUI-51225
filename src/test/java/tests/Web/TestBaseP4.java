package tests.Web;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import webInterface.pages.todoist.LoginSection;
import webInterface.pages.todoist.MainPage;
import webInterface.pages.todoist.MenuSection;
import webInterface.pages.todoist.SettingsSection;
import webInterface.pages.todoly.ProjectSection;
import webInterface.pages.todoly.SignUpSection;
import webInterface.singletonSession.Session;

public class TestBaseP4 {

    protected MainPage mainPage= new MainPage();
    protected LoginSection loginSection= new LoginSection();
    protected MenuSection menuSection= new MenuSection();

    protected SettingsSection settingsSection= new SettingsSection();

    public void alertAnswer(boolean accept){
        Session.getSession("chrome").dismissAlert(accept);
    }

    @BeforeEach
    public void openBrowser(){
        Session.getSession("chrome").goTo("http://todoist.com/");
    }

    @AfterEach
    public void closeBrowser(){
        Session.getSession("chrome").closeBrowser();
    }
}
