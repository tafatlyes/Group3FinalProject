package com.wayfair;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pnt.automation.base.TestBase;

public class HomePageFooter extends TestBase {

    // xpath rules
    //tagName[text()='______'] ---> text
    //tagName[@attribute='_____'] --->id/class/aria-label etc
//-----------------------------------------
    //     //a[text()='Sign in']
    //      //a[text()='register']
    //      //tagName[text()='______']
    //      (//a[text()='Sign in'])[1]

    @FindBy(xpath = "//a[text()='About Wayfair']")
    private WebElement aboutWayfair;

    @FindBy(xpath = " //a[text()='Wayfair Professional']")
    private WebElement wayfairProfessional;

    @FindBy(xpath = "//a[text()='Gift Cards']")
    private WebElement wayfairGiftCard;

    @FindBy(xpath = "(//a[text()='Wayfair Credit Card'])[2]")
    private WebElement wayfairCreditCard;

    @FindBy(xpath = "//a[text()='Careers']")
    private WebElement Careers;

    @FindBy(xpath = "//a[text()='Sell on Wayfair']")
    private WebElement SellOnWayfair;

    @FindBy(xpath = "//a[text()='Investor Relations']")
    private WebElement investorRelation;

    @FindBy(xpath = "//a[text()='Advertise With Us']")
    private WebElement advertiseWithUs;


    public void clickOnAboutWayfair() {
        aboutWayfair.click();
    }

    public void wayfairProfessional() {
        wayfairProfessional.click();
    }

    public void clickOnFooterGiftCard() {

        wayfairGiftCard.click();
    }

    public void clickOnWayfairCreditCard() {
        wayfairCreditCard.click();
    }

    public void clickOnFooterCareers() {
        Careers.click();
    }

    public void clickOnFooterSellOnWayfair() {
        SellOnWayfair.click();
    }

    public void clickOnInvestorRelation() {
        investorRelation.click();
    }

    public void clickOnAdvertiseWithUs() {
        advertiseWithUs.click();
    }

}
