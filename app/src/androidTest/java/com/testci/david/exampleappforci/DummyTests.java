package com.testci.david.exampleappforci;

import android.test.ActivityUnitTestCase;

/**
 * Created by David on 3/12/2016.
 */
public class DummyTests extends ActivityUnitTestCase<MainActivity> {
    public DummyTests(){
        super(MainActivity.class);
    }

    public void test_dummyTestOk() {
        assertEquals(1, 1);
    }

    public void test_dummyTestFails() {
        assertEquals(1,0);
    }

}
