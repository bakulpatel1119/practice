package org.example;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest extends Utils {
    BrowserSelector browserSelector = new BrowserSelector();

    @BeforeTest
    public void openBrowser() {
        browserSelector.setupBrowser();
    }

    @AfterTest
    public void closeBrowser()
    {
        //browserSelector.closeTheBrowser();
    }
}
