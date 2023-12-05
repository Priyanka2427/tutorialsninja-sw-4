package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;

public class ComponentsPage extends Utility {

    By ComponentsText = (By.xpath("//h2[contains(text(),'Components')]"));


    // 3.3 Verify the text ‘Components’

    public void verifyComponentsText(){
        assertVerifyText(ComponentsText,"Components","Components text is not found");

    }
















}
