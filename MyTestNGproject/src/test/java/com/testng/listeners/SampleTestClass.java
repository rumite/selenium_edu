package com.testng.listeners;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SampleTestClass {

    @Test
    public void testOne() {
        System.out.println("Test One");
    }

    @Test (dataProvider = "dataProvider")
    public void testGetData(String s) {
        System.out.println("Test getData method, input = " + s);
    }

    @DataProvider
    public Object[] dataProvider() {
        return new Object[] {"A", "B"};
    }

    @Test
    public void testThree() {
        Assert.assertEquals(5, 7);
    }

    @Test
    public void skippedTest() {
        System.out.println("Should be skipped");
        throw new SkipException(null);
    }
}
