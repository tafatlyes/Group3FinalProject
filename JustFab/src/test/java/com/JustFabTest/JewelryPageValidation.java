package com.JustFabTest;

import com.JustFab.pages.AccessoriesPage;
import com.JustFab.pages.HomePage;
import com.JustFab.pages.JewelryPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pnt.automation.base.TestBase;

public class JewelryPageValidation extends TestBase {

    @Test
    public void validateUserCanClickJewelryStyleButton() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        AccessoriesPage accessoriesPage = PageFactory.initElements(driver, AccessoriesPage.class);
        JewelryPage jewelryPage = PageFactory.initElements(driver, JewelryPage.class);
        homePage.clickAccessoriesButton();
        accessoriesPage.clickJewelryButton();
        jewelryPage.clickJewelryStyleButton();
    }
    @Test
    public void validateUserCanClickBraceletCheckBox(){
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        AccessoriesPage accessoriesPage = PageFactory.initElements(driver, AccessoriesPage.class);
        JewelryPage jewelryPage = PageFactory.initElements(driver, JewelryPage.class);
        homePage.clickAccessoriesButton();
        accessoriesPage.clickJewelryButton();
        jewelryPage.clickJewelryStyleButton();
        jewelryPage.clickBraceletCheckBox();
    }
    @Test
    public void validateUserCanClickEarringsCheckBox(){
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        AccessoriesPage accessoriesPage = PageFactory.initElements(driver, AccessoriesPage.class);
        JewelryPage jewelryPage = PageFactory.initElements(driver, JewelryPage.class);
        homePage.clickAccessoriesButton();
        accessoriesPage.clickJewelryButton();
        jewelryPage.clickJewelryStyleButton();
        jewelryPage.clickEarringsCheckBox();
    }
    @Test
    public void validateUserCanClickPriceLowToHighButton() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        AccessoriesPage accessoriesPage = PageFactory.initElements(driver, AccessoriesPage.class);
        JewelryPage jewelryPage = PageFactory.initElements(driver, JewelryPage.class);
        homePage.clickAccessoriesButton();
        accessoriesPage.clickJewelryButton();
        jewelryPage.clickJewelryStyleButton();
        jewelryPage.clickPriceLowToHighButton();
    }

}
