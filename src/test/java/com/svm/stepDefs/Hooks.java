package com.svm.stepDefs;


import com.svm.utilities.BrowserUtils;
import com.svm.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

    @Before
    public void setUp() {
        System.out.println("SET UP BEFORE EACH SCENARIO");
    }
    @After
    public void tearDown(Scenario scenario)  {
        if(scenario.isFailed()){
            final byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot,"image/png","screenshot");
        }
        BrowserUtils.sleep(3);
        Driver.closeDriver();
    }

}
