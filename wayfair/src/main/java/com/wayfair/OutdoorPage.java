package com.wayfair;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import pnt.automation.base.TestBase;
import pnt.automation.extent.ExtentTestManager;


public class OutdoorPage extends TestBase {
    @FindBy(xpath = "//a[text()='Outdoor & Patio Furniture']")
    private WebElement outdoorAndPatioFurniture;

    @FindBy(xpath = "//a[text()='Outdoor Shades']")
    private WebElement outdoorShades;

    @FindBy(xpath = "//a[text()='Outdoor Heating & Cooling']")
    private WebElement outdoorHeatingAndCooling;

    @FindBy(xpath = "//a[text()='Garden']")
    private WebElement gardenButton;

    @FindBy(xpath = "//a[text()='Hot Tubs & Saunas']")
    private WebElement hotTubsAndSaunas;

    @FindBy(xpath = "//a[text()='Outdoor Recreation']")
    private WebElement outdoorRecreation;

    @FindBy(xpath = "//a[text()='Outdoor Lighting']")
    private WebElement outdoorLighting;

    @FindBy(xpath = "//a[text()='Shop Outdoor']")
    private WebElement shopOutdoor;

    public void clickOnOutdoorAndPatioFurniture() {
        outdoorAndPatioFurniture.click();
        sleepFor(2);
        String currentUrl = TestBase.driver.getCurrentUrl();
        String expectedUrl = "https://www.wayfair.com/outdoor/cat/outdoor-patio-furniture-c33338.html";
        Assert.assertTrue(currentUrl.contains(expectedUrl));
        ExtentTestManager.log("Verified The Url is accurate");
    }


    public void clickOnOutdoorOutdoorShades() {
        outdoorShades.click();
        sleepFor(2);
        String currentUrl = TestBase.driver.getCurrentUrl();
        String expectedUrl = "https://www.wayfair.com/outdoor/cat/outdoor-shades-c1860512.html";
        Assert.assertTrue(currentUrl.contains(expectedUrl));
        ExtentTestManager.log("Verified The Url is accurate");
    }

    public void clickOnOutdoorHeatingAndCooling() {
        outdoorHeatingAndCooling.click();
        sleepFor(2);
        String currentUrl = TestBase.driver.getCurrentUrl();
        String expectedUrl = "https://www.wayfair.com/outdoor/cat/outdoor-heating-cooling-c215961.html";
        Assert.assertTrue(currentUrl.contains(expectedUrl));
        ExtentTestManager.log("Verified The Url is accurate");
    }

    public void clickOnOutdoorGardenButton() {
        gardenButton.click();
        sleepFor(2);
        String currentUrl = TestBase.driver.getCurrentUrl();
        String expectedUrl = "https://www.wayfair.com/outdoor/cat/garden-c489047.html";
        Assert.assertTrue(currentUrl.contains(expectedUrl));
        ExtentTestManager.log("Verified The Url is accurate");
    }

    public void clickOnOutdoorHotTubsAndSaunas() {
        hotTubsAndSaunas.click();
        sleepFor(2);
        String currentUrl = TestBase.driver.getCurrentUrl();
        String expectedUrl = "https://www.wayfair.com/outdoor/cat/hot-tubs-saunas-c435141.html";
        Assert.assertTrue(currentUrl.contains(expectedUrl));
        ExtentTestManager.log("Verified The Url is accurate");
    }

    public void clickOnOutdoorRecreation() {
        outdoorRecreation.click();
        String currentUrl = TestBase.driver.getCurrentUrl();
        String expectedUrl = "https://www.wayfair.com/outdoor/cat/outdoor-recreation-c216001.html";
        Assert.assertTrue(currentUrl.contains(expectedUrl));
        ExtentTestManager.log("Verified The Url is accurate");
    }

    public void clickOnOutdoorLighting() {
        outdoorLighting.click();
        sleepFor(2);
        String currentUrl = TestBase.driver.getCurrentUrl();
        String expectedUrl = "https://www.wayfair.com/lighting/cat/outdoor-lighting-c45346.html";
        Assert.assertTrue(currentUrl.contains(expectedUrl));
        ExtentTestManager.log("Verified The Url is accurate");
    }

    public void clickOnOutdoorShopOutdoor() {
        shopOutdoor.click();
        sleepFor(2);
        String currentUrl = TestBase.driver.getCurrentUrl();
        String expectedUrl = "https://www.wayfair.com/outdoor/cat/outdoor-c32334.html";
        Assert.assertTrue(currentUrl.contains(expectedUrl));
        ExtentTestManager.log("Verified The Url is accurate");
    }

}
