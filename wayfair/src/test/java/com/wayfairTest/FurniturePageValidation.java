package com.wayfairTest;

import com.wayfair.FurniturePage;
import com.wayfair.WayFairHomPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pnt.automation.base.TestBase;

public class FurniturePageValidation extends TestBase {
    @Test
    public void validUserBeingAbleToClickOnLivingRoomFurniture() {
        WayFairHomPage wayFairHomPage = PageFactory.initElements(driver, WayFairHomPage.class);
        FurniturePage furniturePage = PageFactory.initElements(driver, FurniturePage.class);
        wayFairHomPage.clickOnFurnitureButton();
        furniturePage.clickOnLivingRoomFurniture();
    }

    @Test
    public void validUserBeingAbleToClickOnBedRoomFurniture() {
        WayFairHomPage wayFairHomPage = PageFactory.initElements(driver, WayFairHomPage.class);
        FurniturePage furniturePage = PageFactory.initElements(driver, FurniturePage.class);
        wayFairHomPage.clickOnFurnitureButton();
        furniturePage.clickOnBedroomFurniture();
    }

    @Test
    public void validUserBeingAbleToClickOnKitchenAndDinningFurniture() {
        WayFairHomPage wayFairHomPage = PageFactory.initElements(driver, WayFairHomPage.class);
        FurniturePage furniturePage = PageFactory.initElements(driver, FurniturePage.class);
        wayFairHomPage.clickOnFurnitureButton();
        furniturePage.clickOnKitchenAndDinningFurniture();
    }


    @Test
    public void validUserBeingAbleToClickOnOfficeFurniture() {
        WayFairHomPage wayFairHomPage = PageFactory.initElements(driver, WayFairHomPage.class);
        FurniturePage furniturePage = PageFactory.initElements(driver, FurniturePage.class);
        wayFairHomPage.clickOnFurnitureButton();
        furniturePage.clickOnOfficeFurnitureFurniture();
    }

    @Test
    public void validUserBeingAbleToClickOnBathroomFurniture() {
        WayFairHomPage wayFairHomPage = PageFactory.initElements(driver, WayFairHomPage.class);
        FurniturePage furniturePage = PageFactory.initElements(driver, FurniturePage.class);
        wayFairHomPage.clickOnFurnitureButton();
        furniturePage.clickOnBathroomFurnitureFurniture();
    }

}
