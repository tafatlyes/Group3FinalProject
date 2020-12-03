package com.wayfairTest;

import com.wayfair.WayFairHomPage;
import com.wayfair.WayfairLoginPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pnt.automation.base.TestBase;

public class WayfairLoginPageValidation extends TestBase {


    @Test
    public void validUserBeingAbleToTypeEmailOnTheAddressField() {
        WayFairHomPage wayFairHomPage = PageFactory.initElements(driver, WayFairHomPage.class);
        WayfairLoginPage wayfairLoginPage = PageFactory.initElements(driver, WayfairLoginPage.class);
        wayFairHomPage.signInAndClick();
        sleepFor(2);
        wayfairLoginPage.typeEmailOnEmailAddressField();
    }


}
