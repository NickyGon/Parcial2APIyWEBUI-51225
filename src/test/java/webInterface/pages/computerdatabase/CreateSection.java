package webInterface.pages.computerdatabase;

import org.openqa.selenium.By;
import webInterface.controls.Button;
import webInterface.controls.Label;
import webInterface.controls.TextBox;

public class CreateSection {

    public TextBox name= new TextBox(By.xpath("//input[@id='name']"));

    public TextBox introduced= new TextBox(By.xpath("//input[@id='introduced']"));

    public TextBox discontinued= new TextBox(By.xpath("//input[@id='discontinued']"));

    public Button listClick= new Button(By.xpath("//select[@id='company']"));

    public Button getCompany= new Button(By.xpath("//option[text()=\"Apple Inc.\"]"));

    public Button create= new Button(By.xpath("//input[@type='submit']"));

    public void setCreate(String name){
        getCompany= new Button(By.xpath("//option[text()='"+name+"']"));
    }

}
