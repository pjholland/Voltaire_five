package com.paulholland.tests.homepage;

import com.paulholland.Basetest;
import org.junit.AfterClass;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: paulholland
 * Date: 17/02/2014
 * Time: 15:11
 * To change this template use File | Settings | File Templates.
 */
public class UserCanVisitHomepageTest extends Basetest {



    @Test

    public void userVisitsHomepage (){


        getDriver().get("http://www.ikea.com/gb/en/");



    }

    @AfterClass
    public static  void tearDown() {
            getDriver().quit();


    }





}
