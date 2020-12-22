package com.seankang;


import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;


public class ContactAndroidAppTest {
    private AndroidDriver driver;


    @BeforeTest
    public void setup() throws MalformedURLException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities
                .setCapability
                        ("platformName", "Android");

        desiredCapabilities
                .setCapability
                        ("platformVersion", "26"); // LG phone

        desiredCapabilities
                .setCapability
                        ("deviceName", "LG G6");

        desiredCapabilities
                .setCapability
                        ("automationName", "UIAutomator2");
        desiredCapabilities
                .setCapability
                        (MobileCapabilityType.UDID, "LGUS997a603b2bc");
        desiredCapabilities
                .setCapability
                        ("udid", "LGUS997a603b2bc");
        desiredCapabilities
                .setCapability(
                        "ensureWebviewsHavePages", true);
        desiredCapabilities
                .setCapability
                        ("appPackage", "com.android.contacts");
        //desiredCapabilities
        // .setCapability(MobileCapabilityType
        // .App, "com.android.contacts");
        desiredCapabilities
                .setCapability
                        ("appActivity",
                                "com.android.contacts.activities.DialtactsActivity");

        URL remoteUrl = new URL("http://127.0.0.1:4723/wd/hub");
        driver = new AndroidDriver(remoteUrl, desiredCapabilities);
        driver.manage().timeouts()
                .implicitlyWait(20, TimeUnit.SECONDS);
    }


    @Test
    public void sampleTest() throws InterruptedException {
        //Adding new contact
/*        driver.findElementByAccessibilityId
                ("add new contact")
                .click();*/
        //clicking on OK button
        WebElement element=driver
                .findElementById
                        ("com.android.contacts:id/tabText");
        element.click();
/*
        WebElement addFAB=driver
                .findElementById
                        ("com.android.contacts:id/floating_action_button_container");
        addFAB.click();*/

        /*
        WebElement elementName=driver
                .findElementById
                        ("2ead8907-fae0-467c-ae46-43db49cc38c3");
        elementName.click();
        elementName.sendKeys("Hello");
*/
        // 35aaeed3-23eb-4e4a-a077-2f41cf42eb69
/*        //Updating the firstname
        driver.findElementByXPath(
                "/hierarchy/android.widget." +
                        "FrameLayout/android.view" +
                        ".ViewGroup/android.widget" +
                        ".FrameLayout[2]/android" +
                        ".widget.FrameLayout/android.widget" +
                        ".ScrollView/android.widget" +
                        ".LinearLayout/android.widget" +
                        ".LinearLayout[2]/android.widget" +
                        ".LinearLayout/android.widget" +
                        ".LinearLayout/android.widget" +
                        ".LinearLayout/" +
                        "android.widget.EditText")
                .sendKeys("Hello");
        //updating phone number
        driver
                .findElementByXPath("//android.widget" +
                        ".EditText[@text='Phone']")
                .sendKeys("1234567890");
        //updating email id
        driver
                .findElementByXPath("//android.widget" +
                        ".EditText[@text='Email']")
                .sendKeys("xyz@gmail.com");
        //save the contact
        driver
                .findElementById("com.android" +
                        ".contacts" +
                        ":id/menu_save")
                .click();
        WebDriverWait wait=new WebDriverWait(driver,30);
        WebElement el=driver
                .findElementByXPath("//android.view" +
                        ".View[@content-desc=\"Hello\"]");

        wait.until(ExpectedConditions
                .visibilityOfAllElements(el));

        Assert.assertEquals(el
                .getAttribute("content-desc"),"Hello");
        Assert.assertEquals(driver
                .findElementByXPath("\t\n" +
                        "//android.widget" +
                        ".RelativeLayout[@content-desc=" +
                        "\"Call Mobile 1 234-567-890\"]" +
                        "/android.widget.TextView[1]")
                .getText(),"1 234-567-890");
        Assert.assertEquals(driver.
                findElementByXPath("//android.widget" +
                        ".RelativeLayout[@content-desc" +
                        "=\"Email Home xyz@gmail.com\"]" +
                        "/android.widget.TextView[1]\n")
                .getText(),"xyz@gmail.com");*/

    }



    @AfterTest
    public void tearDown(){
        driver.quit();
    }



}
