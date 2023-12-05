package com.tutorialsninja.testsuite;

import com.tutorialsninja.pages.ComponentsPage;
import com.tutorialsninja.pages.DeskTopPage;
import com.tutorialsninja.pages.HomePage;
import com.tutorialsninja.pages.LaptopAndNoteBooksPage;
import com.tutorialsninja.testbase.BaseTest;
import org.testng.annotations.Test;

public class TopMenuTest extends BaseTest {


    HomePage homePage = new HomePage();

    DeskTopPage deskTopPage = new DeskTopPage();

   LaptopAndNoteBooksPage laptopAndNoteBooksPage = new LaptopAndNoteBooksPage();

   ComponentsPage componentsPage = new ComponentsPage();

    @Test
    public void verifyUserShouldNavigateToDesktopsPageSuccessfully() {
        //Mouse hover on “Desktops” Tab and click
        homePage.MouseHoverOnDesktopsTab();

        //call selectMenu method and pass the menu = “Show All Desktops”
        homePage.SelectShowAllDesktops();

        //Verify the text ‘Desktops’
       deskTopPage.verifyDesktopsText();
    }

    @Test
    public void verifyUserShouldNavigateToLaptopsAndNotebooksPageSuccessfully(){
        //2.1 Mouse hover on “Laptops & Notebooks” Tab and click
        homePage.MouseHoverOnLaptopNotebooksTab();
        //2.2 call selectMenu method and pass the menu = “Show All Laptops & Notebooks”
        homePage.SelectShowAllLaptopsNotebooks();
        //2.3 Verify the text ‘Laptops & Notebooks’
        laptopAndNoteBooksPage.verifyLaptopAndNoteBookText();
    }
    @Test
    public void verifyUserShouldNavigateToComponentsPageSuccessfully(){
        //3.1 Mouse hover on “Components” Tab and click
        homePage.MouseHoverOnComponentsTab();
        //3.2 call selectMenu method and pass the menu = “Show All Components”
        homePage.SelectShowAllComponents();
        //3.3 Verify the text ‘Components’
       componentsPage.verifyComponentsText();
    }


















}
