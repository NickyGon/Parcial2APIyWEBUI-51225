package webInterface.pages.todoist;


import org.openqa.selenium.By;
import webInterface.controls.Button;

public class MainPage {
    public Button loginButton = new Button(By.xpath("//div//ul//a[@href=\"/auth/login\"]"));

    public Button signupButton = new Button(By.xpath("//div//ul//a[@href=\"/auth/login\"]"));
}
