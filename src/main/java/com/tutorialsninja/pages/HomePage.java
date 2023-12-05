package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {

    By DesktopsTab = (By.linkText("Desktops"));
    By SelectShowAllDesktops = (By.linkText("Show AllDesktops"));

    By LaptopNotebooksTab = (By.linkText("Laptops & Notebooks"));
    By selectShowAllLaptopsNotebooks = (By.linkText("Show AllLaptops & Notebooks"));

    By ComponentsTab = (By.linkText("Components"));
    By SelectShowAllComponents = (By.linkText("Show AllComponents"));

    By MyAccountLink = (By.xpath("//span[contains(text(),'My Account')]"));
    By selectLogin = (By.xpath("//ul[@class='dropdown-menu dropdown-menu-right']//a[normalize-space()='Login']"));
    By selectRegister = (By.xpath("//ul[@class='dropdown-menu dropdown-menu-right']//a[normalize-space()='Register']"));


    // Mouse hover on “Desktops” Tab and click
    public void MouseHoverOnDesktopsTab(){

        mouseHoverToElement(DesktopsTab);
    }

    // call selectMenu method and pass the menu = “Show All Desktops”
    public void SelectShowAllDesktops(){

        mouseHoverToElementAndClick(SelectShowAllDesktops);
    }

    // Mouse hover on “Laptops & Notebooks” Tab and click
    public void MouseHoverOnLaptopNotebooksTab(){
        mouseHoverToElement(LaptopNotebooksTab);
    }

    // call selectMenu method and pass the menu = “Show All Laptops & Notebooks”
    public void SelectShowAllLaptopsNotebooks(){
        mouseHoverToElementAndClick(selectShowAllLaptopsNotebooks);
    }

    // Mouse hover on “Components” Tab and click
    public void MouseHoverOnComponentsTab (){
        mouseHoverToElement(ComponentsTab);
    }

    // call selectMenu method and pass the menu = “Show All Components”
    public void SelectShowAllComponents(){
        mouseHoverToElementAndClick(SelectShowAllComponents);
    }


    public void clickOnMyAccountLink(){
        clickOnElement(MyAccountLink);
    }
    public void selectLogin(){
        mouseHoverToElementAndClick(selectLogin);
    }
    public void selectRegister(){
        mouseHoverToElementAndClick(selectRegister);
    }
}
