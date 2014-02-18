package com.paulholland.tests;


import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class driverIsTheKing {


    @Test
    public void testApp() throws InterruptedException {

        WebDriver driver = new FirefoxDriver();

        driver.get("http://www.ikea.com/gb/en/");


        Thread.sleep(2000);

        driver.findElement(By.id("mainPadding"));

        String[] myarray = new String[] {"", "",};

      




                driver.close();
    }

}
