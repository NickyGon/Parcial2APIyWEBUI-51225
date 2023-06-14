package webInterface.pages.todoist;

import org.openqa.selenium.By;
import webInterface.controls.Button;
import webInterface.controls.TextBox;

public class SettingsSection {

    public Button changePass= new Button(By.xpath("//form//div//a[@href='/app/settings/account/password']"));

    public TextBox currentPwd=new TextBox(By.xpath("//span[text()='Current password']//parent::node()//parent::node()/parent::node()//input"));

    public TextBox newPwd=new TextBox(By.xpath("//span[text()='New password']//parent::node()//parent::node()/parent::node()//input"));

    public TextBox confirmNewPwd=new TextBox(By.xpath("//span[text()='Confirm new password']//parent::node()//parent::node()/parent::node()//input"));

    public Button changeButton = new Button(By.xpath("//footer//button[@type='submit']"));

    public Button close= new Button(By.xpath("//form//header//button[@aria-label='Close settings']"));




}
