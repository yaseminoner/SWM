package com.svm.pages;

import com.svm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    public BasePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//span[text()='Alle akzeptieren']")
    public  WebElement cookies;
    @FindBy(xpath = "(//span[text()='Tarife & Angebote'])[1]")
    public WebElement tarifAngebote;

    @FindBy(xpath="(//span[text()='M/Wasser'])[1]")
    public WebElement MWasser;

    @FindBy(xpath = "//span[text()='Trinkwasseranalyse']")
    public  WebElement trinkWasserAnalyse;
}
