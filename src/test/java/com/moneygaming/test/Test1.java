package com.moneygaming.test;

import com.moneygaming.utulities.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test1 {

    @BeforeMethod
    public void setUp(){

    WebDriver driver = WebDriverFactory.getDriver("chrome");
    driver.manage().window().maximize();


    }


    @Test
    public void task1(){

    }



    @AfterMethod
    public void tearDown(){

    }

}
