package webInterface.pages.todoist;


import org.openqa.selenium.By;
import webInterface.controls.Button;
import webInterface.controls.TextBox;

public class LoginSection {
    public TextBox emailTxtBox = new TextBox(By.xpath("//input[@type='email']"));
    public TextBox pwdTxtBox = new TextBox(By.xpath("//input[@type='password']"));
    public Button loginButton = new Button(By.xpath("//button[@type='submit']"));
}
