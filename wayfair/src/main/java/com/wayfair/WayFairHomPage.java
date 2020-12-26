package com.wayfair;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import pnt.automation.base.TestBase;
import pnt.automation.extent.ExtentTestManager;


public class WayFairHomPage extends TestBase {
    @FindBy(xpath = "//*[@id='SearchBarForm']/input[3]")
    private WebElement searchBar;

    @FindBy(xpath = "//div[@class='BrowseHeaderMinimized-roadsign']")
    private WebElement verifyFirePit;

    @FindBy(xpath = "//*[@id='SearchBarForm']/div[2]/button")
    private WebElement clickOnPhotoButton;

    @FindBy(xpath = "//div[@class='pl-DropZone']")
    private WebElement dropZone;


    @FindBy(xpath = "//span[text()='Sign In']")
    private WebElement signInButton;

    @FindBy(xpath = "//h1[@data-enzyme-id='AuthHeaderTitle']")
    private WebElement validationForSignIn;

    @FindBy(xpath = "//span[@data-enzyme-id='MyAccountContent']")
    private WebElement mouseHoverMyAccountAndOrder;

    @FindBy(xpath = "//span[text()='My Orders']")
    private WebElement selectMyOrders;

    @FindBy(xpath = "(//span[text()='Lists & Registry'])[1]")
    private WebElement selectListAndRegistry;

    @FindBy(xpath = "//span[@data-enzyme-id='MyAccountContent']")
    private WebElement clickOnMyAccountAndOrder;

    @FindBy(xpath = "//span[@data-enzyme-id='MyAccountContent-subtitle']")
    private WebElement signInButtonUnderMyAccount;

    @FindBy(xpath = "//a[@data-codeception-id='store-nav-item-projects']")
    private WebElement mouseHoverOnListsAndRegistry;

    @FindBy(xpath = "(//a[@class='MyAccountLinkCard'])[8]")
    private WebElement selectLists;

    @FindBy(xpath = "//a[@class='DepartmentItem-link DepartmentItem-link--holiday']")
    private WebElement holidayButton;

    @FindBy(xpath = "//span[@class='DepartmentDropdown-iconContainer']")
    private WebElement hanukkahButton;

    @FindBy(xpath = "(//a[text()='Pet'])[1]")
    private WebElement petButton;

    @FindBy(xpath = "//a[text()='Dog Beds']")
    private WebElement dogBedsButton;

    @FindBy(xpath = "//*[@id='store_nav']/nav/ul/li[1]/a")
    private WebElement Furniture;

    @FindBy(xpath = "(//a[@class='DepartmentItem-link'])[2]")
    private WebElement outdoorButton;


    public void typeOnSearchBar() {
        searchBar.sendKeys("Fire Pit");
        sleepFor(2);
        searchBar.submit();
        sleepFor(2);
        verifyFirePit.isDisplayed();
        ExtentTestManager.log("Verified That fire pits header on top left of the page");
    }

    public void clickOnPhotoButton() {
        clickOnPhotoButton.click();
//        sleepFor(2);
//        dropZone.submit();
//        dropZone.getLocation();
//        ExtentTestManager.log("Validate drag a photo here section open");
    }


    public void signInAndClick() {
        signInButton.click();
        validationForSignIn.getAttribute("Enter your email address to sign in or to create an account");
        Assert.assertTrue(validationForSignIn.isDisplayed());
        ExtentTestManager.log("Verified The Message displays On Header.");

    }

    public void mouseHoverMyAccountAndOrder() {
        Actions actions = new Actions(driver);
        actions.moveToElement(mouseHoverMyAccountAndOrder).build().perform();
        sleepFor(2);
        selectMyOrders.click();
        validationForSignIn.getAttribute("Enter your email address to sign in or to create an account");
        ExtentTestManager.log("Verified The Message displays On Header.");
    }

    public void mouseHoverToListAndRegistry() {
        Actions actions = new Actions(driver);
        actions.moveToElement(mouseHoverMyAccountAndOrder).build().perform();
        selectListAndRegistry.click();
        sleepFor(2);
        String currentUrl = TestBase.driver.getCurrentUrl();
        String expectedUrl = "https://www.wayfair.com/plan";
        Assert.assertTrue(currentUrl.contains(expectedUrl));
        ExtentTestManager.log("Verified The Url is accurate");
    }


    public void mouseHoverToListAndRegistry2() {
        Actions actions = new Actions(driver);
        actions.moveToElement(mouseHoverOnListsAndRegistry).build().perform();
        sleepFor(2);
        selectLists.click();
        String currentUrl = TestBase.driver.getCurrentUrl();
        String expectedUrl = "https://www.wayfair.com/plan";
        Assert.assertTrue(currentUrl.contains(expectedUrl));
        ExtentTestManager.log("Verified The Url is accurate");
    }


    public void hoverHolidayButtonAndClick() {
        holidayButton.click();
        String currentUrl = TestBase.driver.getCurrentUrl();
        String expectedUrl = "https://www.wayfair.com/holiday/christmas";
        Assert.assertTrue(currentUrl.contains(expectedUrl));
        ExtentTestManager.log("Verified The Url is accurate");
        holidayButton.getAttribute("Christmas");

//        Actions actions = new Actions(driver);
//        actions.moveToElement(holidayButton).build().perform();
//        sleepFor(2);
//        hanukkahButton.click();
//        List<WebElement> links = (List<WebElement>) driver.findElement(By.xpath(""));
//        int total_count = links.size();
//        for (int i = 0; i < total_count; i++) {
//            WebElement element = links.get(i);
//            String text = element.getAttribute("innerHTML");
//            Logger.getLogger("link name is " + text);
//            sleepFor(2);
//            navigateToURL("https://www.wayfair.com/");
//            String currentUrl = TestBase.driver.getCurrentUrl();
//            String expectedUrl = "";
//            Assert.assertTrue(currentUrl.contains(expectedUrl));
//            ExtentTestManager.log("Verified The Url is accurate");
    }


    public void mouseHoverOnPetAndClickOnDogBeds() {
        Actions actions = new Actions(driver);
        actions.moveToElement(petButton).build().perform();
        sleepFor(2);
        dogBedsButton.click();
        sleepFor(2);
        String currentUrl = TestBase.driver.getCurrentUrl();
        String expectedUrl = "https://www.wayfair.com/pet/cat/dog-beds-c409475.html";
        Assert.assertTrue(currentUrl.contains(expectedUrl));
        ExtentTestManager.log("Verified The Url is accurate");

    }

    public void clickOnFurnitureButton() {
        Furniture.click();
        sleepFor(2);
        String currentUrl = TestBase.driver.getCurrentUrl();
        String expectedUrl = "https://www.wayfair.com/furniture/cat/furniture-c45974.html";
        Assert.assertTrue(currentUrl.contains(expectedUrl));
        ExtentTestManager.log("Verified The Url is accurate");
    }

    public void clickOnOutdoorButton() {
        outdoorButton.click();
        sleepFor(2);
        String currentUrl = TestBase.driver.getCurrentUrl();
        String expectedUrl = "https://www.wayfair.com/outdoor/cat/outdoor-c32334.html";
        Assert.assertTrue(currentUrl.contains(expectedUrl));
        ExtentTestManager.log("Verified The Url is accurate");
    }


}

