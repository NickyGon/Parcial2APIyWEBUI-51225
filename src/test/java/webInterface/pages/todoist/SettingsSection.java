package webInterface.pages.todoist;

import org.openqa.selenium.By;
import webInterface.controls.Button;
import webInterface.controls.TextBox;

public class SettingsSection {

    public Button changePass= new Button(By.xpath("//form//div//a[@href='/app/settings/account/password']"));

    public TextBox currentPwd=new TextBox(By.xpath("//input[@id='element-5']"));

    public TextBox newPwd=new TextBox(By.xpath("//input[@id='element-8']"));

    public TextBox confirmNewPwd=new TextBox(By.xpath("//input[@id='element-11']"));

    public Button changeButton = new Button(By.xpath("//footer//button[@type='submit']"));

    public Button close= new Button(By.xpath("//form//header//button[@aria-label='Close settings']"));




}
