package webInterface.pages.todoly;


import org.openqa.selenium.By;
import webInterface.controls.Button;
import webInterface.controls.TextBox;

public class LoginSection {
    public TextBox emailTxtBox = new TextBox(By.id("ctl00_MainContent_LoginControl1_TextBoxEmail"));
    public TextBox pwdTxtBox = new TextBox(By.id("ctl00_MainContent_LoginControl1_TextBoxPassword"));
    public Button loginButton = new Button(By.id("ctl00_MainContent_LoginControl1_ButtonLogin"));
}
