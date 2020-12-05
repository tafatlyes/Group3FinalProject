package com.wayfairTest;

import com.wayfair.OutdoorPage;
import com.wayfair.WayFairHomPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pnt.automation.base.TestBase;

public class OutdoorPageValidation extends TestBase {
    @Test
    public void validUserAbleToClickOnOutdoorAndPatioFurniture() {
        WayFairHomPage wayFairHomPage = PageFactory.initElements(driver, WayFairHomPage.class);
        OutdoorPage outdoorPage = PageFactory.initElements(driver, OutdoorPage.class);
        wayFairHomPage.clickOnOutdoorButton();
        outdoorPage.clickOnOutdoorAndPatioFurniture();

    }

    @Test
    public void validUserAbleToClickOnOutdoorShades() {
        WayFairHomPage wayFairHomPage = PageFactory.initElements(driver, WayFairHomPage.class);
        OutdoorPage outdoorPage = PageFactory.initElements(driver, OutdoorPage.class);
        wayFairHomPage.clickOnOutdoorButton();
        outdoorPage.clickOnOutdoorOutdoorShades();
    }

    @Test
    public void validUserAbleToClickOnOutdoorHeatingAndCooling() {
        WayFairHomPage wayFairHomPage = PageFactory.initElements(driver, WayFairHomPage.class);
        OutdoorPage outdoorPage = PageFactory.initElements(driver, OutdoorPage.class);
        wayFairHomPage.clickOnOutdoorButton();
        outdoorPage.clickOnOutdoorHeatingAndCooling();
    }

    @Test
    public void validUserAbleToClickOnOutdoorGardenButton() {
        WayFairHomPage wayFairHomPage = PageFactory.initElements(driver, WayFairHomPage.class);
        OutdoorPage outdoorPage = PageFactory.initElements(driver, OutdoorPage.class);
        wayFairHomPage.clickOnOutdoorButton();
        outdoorPage.clickOnOutdoorGardenButton();
    }

    @Test
    public void validUserAbleToClickOnOutdoorHotTubsAndSaunas() {
        WayFairHomPage wayFairHomPage = PageFactory.initElements(driver, WayFairHomPage.class);
        OutdoorPage outdoorPage = PageFactory.initElements(driver, OutdoorPage.class);
        wayFairHomPage.clickOnOutdoorButton();
        outdoorPage.clickOnOutdoorHotTubsAndSaunas();
    }

    @Test
    public void validUserAbleToClickOnOutdoorRecreation() {
        WayFairHomPage wayFairHomPage = PageFactory.initElements(driver, WayFairHomPage.class);
        OutdoorPage outdoorPage = PageFactory.initElements(driver, OutdoorPage.class);
        wayFairHomPage.clickOnOutdoorButton();
        outdoorPage.clickOnOutdoorRecreation();
    }

    @Test
    public void validUserAbleToClickOnOutdoorLighting() {
        WayFairHomPage wayFairHomPage = PageFactory.initElements(driver, WayFairHomPage.class);
        OutdoorPage outdoorPage = PageFactory.initElements(driver, OutdoorPage.class);
        wayFairHomPage.clickOnOutdoorButton();
        outdoorPage.clickOnOutdoorLighting();
    }

    @Test
    public void validUserAbleToClickOnOutdoorShopOutdoor() {
        WayFairHomPage wayFairHomPage = PageFactory.initElements(driver, WayFairHomPage.class);
        OutdoorPage outdoorPage = PageFactory.initElements(driver, OutdoorPage.class);
        wayFairHomPage.clickOnOutdoorButton();
        outdoorPage.clickOnOutdoorShopOutdoor();
    }
}
