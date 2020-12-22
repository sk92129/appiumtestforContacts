package com.seankang;

import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote
        .DesiredCapabilities;
import org.openqa.selenium.support
        .ui.ExpectedConditions;
import org.openqa.selenium.support
        .ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;


public class ContactiPhoneAppTest {
/*

    private IOSDriver driver;
*/

    //@BeforeClass
/*

    @BeforeTest
    public void setup() throws MalformedURLException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities
                .setCapability("platformName", "iOS");
        desiredCapabilities
                .setCapability("platformVersion", "14.2");
        desiredCapabilities
                .setCapability("deviceName", "iPhone 8");
        desiredCapabilities
                .setCapability("automationName", "XCUITest");
        desiredCapabilities
                .setCapability("udid", "C9BF3B5B-2E53-436C-AA8F-71FC410D31F7");
        URL remoteUrl = new URL("http://127.0.0.1:4723/wd/hub");

        driver = new IOSDriver(remoteUrl, desiredCapabilities);
        driver.manage().timeouts()
                .implicitlyWait(20, TimeUnit.SECONDS);
    }
*/

/*

    @Test
    public void sampleTest() {
        //Clciking on the contact app
        MobileElement el1 = (MobileElement) driver
                .findElementByAccessibilityId
                        ("Contacts");
        el1.click();
        //Clicking on Add contact


        MobileElement el2 = (MobileElement) driver
                .findElementByAccessibilityId
                        ("Add");
        el2.click();
        //Sending value to the First Name
        MobileElement el3 = (MobileElement) driver
                .findElementByAccessibilityId
                        ("First name");
        el3.sendKeys("Name1");
        //Sending value to the Last Name
        driver.findElementByAccessibilityId
                ("Last name")
                .sendKeys("Surname");
        //Sending value to the Company
        driver
                .findElementByAccessibilityId
                        ("Company")
                .sendKeys("xyz");
        //Clicking on home
        driver
                .findElementByXPath
                        ("//XCUIElementTypeCell[@name=\"add phone\"]")
                .click();
        //Exmaple of explicit wait. Waiting for the element to be visible
        WebDriverWait wait=new WebDriverWait(driver,30);

        WebElement el= driver
                .findElementByXPath
                        ("//XCUIElementTypeTextField" +
                                "[@name=\"home\"]");
        wait.until(ExpectedConditions
                .visibilityOfAllElements(el));
        el.sendKeys("1234567890");
        //Clcking on Done
        driver
                .findElementByXPath(
                        "//XCUIElementTypeButton" +
                                "[@name=\"Done\"]")
                .click();
        //Asserting the value to verify
        Assert.assertEquals(driver
                .findElementByXPath(
                        "//XCUIElementTypeStaticText" +
                                "[@name=\"Name1 Surname\"]\n")
                .getText(),"Name1 Surname");
        Assert.assertEquals(driver
                .findElementByXPath(
                        "//XCUIElementTypeStaticText" +
                                "[@name=\"xyz\"]")
                .getText(),"xyz");

    }

    @AfterClass
    public void tearDown() {
        //Quiting the driver
        driver.quit();
    }
*/

}
