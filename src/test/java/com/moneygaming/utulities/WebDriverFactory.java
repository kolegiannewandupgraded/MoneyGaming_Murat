package com.moneygaming.utulities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverFactory {

    //task:
    //write a static method that takes a string paramater name: browserType
    //based on the value of paramater
    //it will set up the browser and
    //the method will return chrome driver or firefox driver
    //name pf the method : getDriver

    public static WebDriver getDriver (String browserType){

        WebDriver driver = null;

        switch (browserType.toLowerCase()){

            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;
        }
        return driver;
    }

}
