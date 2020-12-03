package com.tdbank.data;

import org.testng.annotations.DataProvider;


public class DataProviders {


//    @DataProvider(name = "searchData")
//    public Object [] getSearchData(){
//        return new Object[]{"Java books","Selenium books","Data structure books"};
//    }

    @DataProvider(name = "credentials")
    public Object[][] getCredentials() {
        return new Object[][]{{"testuser001", "testpass001"}, {"testuser002", "testpass002"}, {"testuser003", "testpass003"}};
    }
}

//    WebDriver webDriver = new WebDriver();
//webDriver.set(new RemoteWebDriver(
//        new URL("https://tafatlyes:81b590a4-d403-43f3-a79d-84fe1d009331@ondemand.us-west-1.saucelabs.com:443/wd/hub")
//        ))
