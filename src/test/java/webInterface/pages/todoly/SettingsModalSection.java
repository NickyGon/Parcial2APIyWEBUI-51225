package webInterface.pages.todoly;


import org.openqa.selenium.By;
import webInterface.controls.Button;
import webInterface.controls.TextBox;

public class SettingsModalSection {
    public TextBox fullName=new TextBox(By.id("FullNameInput"));
    public Button submit=new Button(By.xpath("//div[contains(@class,'buttonpane')]//button//span[text()='Ok']"));
}
