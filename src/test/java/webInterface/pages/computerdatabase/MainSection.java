package webInterface.pages.computerdatabase;

import org.openqa.selenium.By;
import webInterface.controls.Button;
import webInterface.controls.Label;

public class MainSection {
    public Button addComputer= new Button(By.xpath("//a[@href=\"/computers/new\"]"));

    public Label message= new Label(By.xpath("//div[contains(@class,'alert-message') and contains(text(),'Skillzy')]"));

    public void setMessage(String name){
        message= new Label(By.xpath("//div[contains(@class,'alert-message') and contains(text(),'"+name+"')]"));
    }


}
