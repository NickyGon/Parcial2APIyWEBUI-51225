package webInterface.pages.todoly;


import org.openqa.selenium.By;
import webInterface.controls.Button;

public class MenuSection {

    public Button logoutButton = new Button(By.xpath("//a[text()='Logout']"));

    public Button settings= new Button(By.xpath("//div[contains(@class,\"HeaderMenuLine\")]//a[text()='Settings']"));




}
