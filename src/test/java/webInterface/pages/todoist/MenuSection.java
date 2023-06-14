package webInterface.pages.todoist;


import org.openqa.selenium.By;
import webInterface.controls.Button;
import webInterface.controls.Label;

public class MenuSection {

    public String projectName="";
    public Button profile= new Button(By.id(":r2:"));

    public Label emaillabel = new Label(By.xpath("//div[contains(@style,'--popover')]//div//p[contains(text(),'@')]"));

    //Para el examen

    public Button settings= new Button(By.xpath("//div//span[@class=\"user_menu_label\" and text()=\"Settings\"]"));

    public Button logOut= new Button(By.xpath("//button//span[@class=\"user_menu_label\" and text()=\"Log out\"]"));

    //Para la práctica personal, no para calificar
    public Button projectLab = new Button(By.xpath("//div[@id='left_menu']//a[@href=\"/app/projects\"]"));

    public Button createProjectLab=new Button(By.xpath("//*[@id=\"left_menu_inner\"]/div[1]/div[1]/div/div[1]/button"));

    public Button newProjectLab=new Button(By.xpath("(//ul[@id=\"projects_list\"]//li//span[contains(text(),'"+projectName+"')])[last()]"));

    public Button newProjectOptions=new Button(By.xpath("(//div//a[contains(@aria-label,'"+projectName+"')]//following-sibling::span[@data-project-actions]//button)[last()]"));

    public Button editProjectOption=new Button(By.xpath("//div[contains(@class,'popper')]//li//div[text()=\"Edit project\"]"));

    public Button deleteProjectOption=new Button(By.xpath("//div[contains(@class,'popper')]//li//div[text()=\"Delete project\"]"));


    public void setEmail(String host) {
        emaillabel = new Label(By.xpath("//div[contains(@style,'--popover')]//div//p[text()='"+host+"']"));
    }

    public void setNewprojectName(String projName){
        newProjectLab=new Button(By.xpath("(//ul[@id=\"projects_list\"]//li//span[contains(text(),'"+projName+"')])[last()]"));
    }
}
