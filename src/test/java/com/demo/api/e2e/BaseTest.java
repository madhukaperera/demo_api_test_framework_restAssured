package com.demo.api.e2e;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.asserts.SoftAssert;

public class BaseTest {

    protected SoftAssert softAssert = new SoftAssert();

    @BeforeClass
    public void beforeClassParent() {

    }

    @AfterClass
    public void afterClassParent() {

    }
}
