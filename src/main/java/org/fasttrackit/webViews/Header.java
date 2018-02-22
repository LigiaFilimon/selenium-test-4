package org.fasttrackit.webViews;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Header {

@FindBy(id="search")
    private WebElement searchField;

    public WebElement getSearchField() {
        return searchField;
    }

    public void search (String keyword) {
        searchField.sendKeys("vase"+ Keys.ENTER);
    }


    public WebElement getLanguageDropDownList() {
        return LanguageDropDownList;
    }

    @FindBy(id = "select-language")
    private WebElement LanguageDropDownList;











}





