package com.JustFabTest;

import com.JustFab.pages.AccessoriesPage;
import com.JustFab.pages.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pnt.automation.base.TestBase;

public class AccessoriesPageValidations extends TestBase {

    @Test
    public void validateUserCanClickBagsButton() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.clickAccessoriesButton();
        AccessoriesPage accessoriesPage = PageFactory.initElements(driver, AccessoriesPage.class);
        accessoriesPage.clickBagsButton();
        sleepFor(5);
    }

    @Test
    public void validateUserCanClickBestSellersButton() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        AccessoriesPage accessoriesPage = PageFactory.initElements(driver, AccessoriesPage.class);
        homePage.clickAccessoriesButton();
        accessoriesPage.clickBagsButton();
        accessoriesPage.clickBestSellersButton();
        sleepFor(5);
    }

    @Test
    public void validateUserCanClickTopRatedButton() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        AccessoriesPage accessoriesPage = PageFactory.initElements(driver, AccessoriesPage.class);
        homePage.clickAccessoriesButton();
        accessoriesPage.clickBestSellersButton();
        accessoriesPage.clickTopRatedButton();
        sleepFor(5);
    }

    @Test
    public void validateUserCanClickJewelryButton() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        AccessoriesPage accessoriesPage = PageFactory.initElements(driver, AccessoriesPage.class);
        homePage.clickAccessoriesButton();
        accessoriesPage.clickJewelryButton();
        sleepFor(5);
    }
}