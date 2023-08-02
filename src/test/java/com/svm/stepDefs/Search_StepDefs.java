package com.svm.stepDefs;

import com.svm.pages.BasePage;
import com.svm.utilities.BrowserUtils;
import com.svm.utilities.ConfigurationReader;
import com.svm.utilities.Driver;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;

public class Search_StepDefs extends BasePage {

    BasePage basepage = new BasePage();
    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

    @Given("nutzer auf der Hauptseite")
    public void nutzer_auf_der_hauptseite() {
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
        BrowserUtils.sleep(2);
    }
    @When("nutzer klickt alle cookies akzeptieren")
    public void nutzer_klickt_alle_cookies_akzeptieren() {

            BrowserUtils.sleep(2);
            basepage.cookies.click();

    }
    @Given("nutzer klickt auf tarifeAngebote")
    public void nutzer_klickt_auf_tarife_angebote() {
        BrowserUtils.sleep(2);
        basepage.tarifAngebote.click();

    }
    @Given("nutzer klickt auf MWasser")
    public void nutzer_klickt_auf_m_wasser() {
        BrowserUtils.sleep(2);
        basepage.MWasser.click();

    }
    @Given("nutzer klickt auf trinkWasserAnalyse")
    public void nutzer_klickt_auf_trink_wasser_analyse() {
        BrowserUtils.sleep(2);
        basepage.trinkWasserAnalyse.click();
    }

    @Then("nutzer scrollt runter und hoch")
    public void nutzer_scrollt_runter_und_hoch() {
        for (int i = 0; i < 3; i++) {
            BrowserUtils.sleep(2);
            js.executeScript("window.scrollBy(0,2000)");
        }
        for (int i = 0; i < 3; i++) {
            BrowserUtils.sleep(2);
            js.executeScript("window.scrollBy(0,-2000)");
        }

    }
    @Then("nutzer kehrt auf die Hauptseite zurück")
    public void nutzer_kehrt_auf_die_hauptseite_zurück() {
        BrowserUtils.sleep(2);
        Driver.getDriver().navigate().back();


    }
    @Then("nutzer sollte die Bereiche {string} sehen")
    public void nutzer_sollte_die_bereiche_sehen(String expectedTitle) {

        BrowserUtils.sleep(1);
        String actualTitle = Driver.getDriver().getTitle();
        BrowserUtils.sleep(1);

        Assert.assertEquals(expectedTitle,actualTitle);

    }


}
