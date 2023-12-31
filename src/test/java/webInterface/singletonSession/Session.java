package webInterface.singletonSession;
import org.openqa.selenium.WebDriver;
import webInterface.factoryBrowser.FactoryBrowser;

public class Session {

    private static Session session = null;
    private WebDriver browser;
    private Session(String browser){
        this.browser = FactoryBrowser.make(browser).create();
    }

    public static Session getSession(String browName){
        if (session==null){
            session=new Session(browName);
        }
        return session;
    }

    public void closeBrowser(){
        session=null;
        browser.quit();
    }

    public void dismissAlert(boolean yes){
        if (yes){
            browser.switchTo().alert().accept();
        } else {
            browser.switchTo().alert().dismiss();
        }
    }

    public void goTo(String url){
        browser.get(url);
    }

    public WebDriver getBrowser(){
        return browser;
    }
}
