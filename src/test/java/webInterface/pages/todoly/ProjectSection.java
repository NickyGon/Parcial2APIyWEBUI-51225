package webInterface.pages.todoly;


import org.openqa.selenium.By;
import webInterface.controls.Button;
import webInterface.controls.TextBox;

public class ProjectSection {


    public Button projectAddButton = new Button(By.id("NewProjNameButton"));
    public TextBox projectName = new TextBox(By.id("NewProjNameInput"));

    public Button proyectButton= new Button(By.xpath("//td[text()='Add New Project']"));
    public Button projectNameLab = new Button(By.xpath("(//li//td[text()='"+" "+"'])[last()]"));

    public Button projectMenu=new Button(By.xpath("//div[@style=\"display: block;\"]/img"));

    public Button editOption=new Button(By.xpath("//ul[contains(@style,'block')]//a[text()='Edit']"));

    public TextBox editTextBox= new TextBox(By.xpath("//td/div/input[@id=\"ItemEditTextbox\"]"));

    public Button actualize= new Button(By.xpath("//td/div/img[@id=\"ItemEditSubmit\"]"));

    public Button deleteOption=new Button(By.id("ProjShareMenuDel"));

    public void enterName(String newName,boolean update){
        projectNameLab=new Button(By.xpath("(//li//td[text()='"+newName+"'])[last()]"));
        if (update){
            editTextBox.clearSetText(newName);
        } else {
            projectName.setText(newName);
        }
    }

}
