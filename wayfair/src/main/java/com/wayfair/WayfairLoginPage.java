package com.wayfair;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pnt.automation.base.TestBase;

public class WayfairLoginPage extends TestBase {


    @FindBy(xpath = "//input[@type='email']")
    private WebElement emailAddressBar;

    @FindBy(xpath = "//input[@type='password']")
    private WebElement PassWord;

    @FindBy(xpath = "//button[@data-codeception-id='login-continue-button']")
    private WebElement signInContinue;


    public void typeEmailOnEmailAddressField() {
        emailAddressBar.sendKeys("shoquesilkshine@gmail.com");
        sleepFor(1);
        PassWord.sendKeys("shoque0951");
        sleepFor(2);
        signInContinue.submit();

    }


}





