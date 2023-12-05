package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;

public class LaptopAndNoteBooksPage extends Utility {


    By laptopAndNoteBookText = (By.linkText("Laptops & Notebooks"));
    By selectPriceHighLow =(By.xpath("//select[@id='input-sort']"));
    By ArrangeHighToLowOrder = (By.xpath("//p[@class= 'price']"));
    By ProductMacBook = (By.linkText("MacBook"));
    By MacBookText = (By.linkText("MacBook"));
    By AddToCartButton = (By.xpath("//button[@id='button-cart']"));
    By SuccessMessage = (By.xpath("//div[@class='alert alert-success alert-dismissible']"));
    By shoppingCartLink = (By.xpath("//a[contains(text(),'shopping cart')]"));


    // Verify the text ‘Laptops & Notebooks’
    public void verifyLaptopAndNoteBookText() {
        assertVerifyText(laptopAndNoteBookText, "Laptops & Notebooks",
                "Laptops & Notebooks text is not found");
    }

    public void selectPriceHighLow(String text){
        selectByVisibleTextFromDropDown(selectPriceHighLow,text);
    }

    public void verifyArrangeHighToLowOrder(){
        verifyListProduct(ArrangeHighToLowOrder);
    }

    public void clickOnProductName(){
        clickOnElement(ProductMacBook);
    }
    public void verifyMacBookText(){
        assertVerifyText(MacBookText,"MacBook","MacBook text is not found");
    }

    public void clickOnAddToCartButton(){
        clickOnElement(AddToCartButton);
    }

    public void verifySuccessMessage(){
        assertVerifyText(SuccessMessage,"Success: You have added MacBook to your " +
                "shopping cart!\n×","Success message is not found ");
    }

    public void clickOnShoppingCard(){
        clickOnElement(shoppingCartLink);
    }
}
