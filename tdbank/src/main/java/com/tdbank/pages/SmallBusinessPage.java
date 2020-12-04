package com.tdbank.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import pnt.automation.base.TestBase;

public class SmallBusinessPage extends TestBase {

    @FindBy(xpath = "(//p[text()='Checking Accounts'])[1]")
    private WebElement checkingAccount;


    @FindBy(xpath = "(//p[text()='Loans & Lines of Credit'])[1]")
    private WebElement loansAndLinesOfCredit;

    @FindBy(xpath = "(//p[text()='Credit Cards'])[1]")
    private WebElement creditCards;

    @FindBy(xpath = "(//p[text()='Healthcare Professionals'])[1]")
    private WebElement healthcareProfessionals;

    @FindBy(xpath = "(//p[text()='Merchant Solutions'])[1]")
    private WebElement merchantSolutions;


    public void clickOnCheckingAccount() {
        checkingAccount.click();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.td.com/us/en/small-business/checking-accounts/");
    }

    public void clickOnLoansAndLinesOfCredit() {
        sleepFor(3);
        loansAndLinesOfCredit.click();
        sleepFor(3);
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.td.com/us/en/small-business/loans-lines-of-credit/");
    }

    public void clickOnCreditCards() {
        creditCards.click();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.td.com/us/en/personal-banking/credit-cards/business-solutions-credit-card/");
    }

    public void clickOnHealthcareProfessionals() {
        healthcareProfessionals.click();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.td.com/us/en/small-business/healthcare-practice-solution/");
    }

    public void clickOnMerchantSolutions() {
        merchantSolutions.click();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.td.com/us/en/small-business/merchant-solutions/");
    }

}
