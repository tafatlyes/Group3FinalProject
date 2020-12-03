package com.wayfair;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pnt.automation.base.TestBase;
import pnt.automation.extent.ExtentTestManager;


public class FurniturePage extends TestBase {
    @FindBy(xpath = "( //a[text()='Living Room Furniture'])[1]")
    private WebElement livingRoomFurniture;

    @FindBy(xpath = "(//a[@class='CategoryNavigationCard-link'])[2]")
    private WebElement bedroomFurniture;

    @FindBy(xpath = "(//a[@class='CategoryNavigationCard-link'])[3]")
    private WebElement kitchenAndDinningFurniture;

    @FindBy(xpath = "(//a[@class='CategoryNavigationCard-link'])[4]")
    private WebElement officeFurniture;

    @FindBy(xpath = "(//a[@class='CategoryNavigationCard-link'])[7]")
    private WebElement bathroomFurniture;

    public void clickOnLivingRoomFurniture() {
        livingRoomFurniture.click();
        sleepFor(2);
        String currentUrl = TestBase.driver.getCurrentUrl();
        String expectedUrl = "https://www.wayfair.com/furniture/cat/living-room-furniture-c45982.html";
        Assert.assertTrue(currentUrl.contains(expectedUrl));
        ExtentTestManager.log("Verified The Url is accurate");


    }

    public void clickOnBedroomFurniture() {
        bedroomFurniture.click();
        sleepFor(2);
        String currentUrl = TestBase.driver.getCurrentUrl();
        sleepFor(1);
        String expectedUrl = "https://www.wayfair.com/furniture/cat/bedroom-furniture-c45984.html";
        Assert.assertTrue(currentUrl.contains(expectedUrl));
        ExtentTestManager.log("Verified The Url is accurate");
    }

    public void clickOnKitchenAndDinningFurniture() {
        kitchenAndDinningFurniture.click();
        sleepFor(2);
        String currentUrl = TestBase.driver.getCurrentUrl();
        String expectedUrl = "https://www.wayfair.com/furniture/cat/kitchen-dining-furniture-c214999.html";
        Assert.assertTrue(currentUrl.contains(expectedUrl));
        ExtentTestManager.log("Verified The Url is accurate");
    }

    public void clickOnOfficeFurnitureFurniture() {
        officeFurniture.click();
        sleepFor(2);
        String currentUrl = TestBase.driver.getCurrentUrl();
        String expectedUrl = "https://www.wayfair.com/furniture/cat/office-furniture-c332627.html";
        Assert.assertTrue(currentUrl.contains(expectedUrl));
        ExtentTestManager.log("Verified The Url is accurate");

    }

    public void clickOnBathroomFurnitureFurniture() {
        bathroomFurniture.click();
        sleepFor(2);
        String currentUrl = TestBase.driver.getCurrentUrl();
        String expectedUrl = "https://www.wayfair.com/furniture/cat/bathroom-furniture-c45985.html";
        Assert.assertTrue(currentUrl.contains(expectedUrl));
        ExtentTestManager.log("Verified The Url is accurate");
    }

}
