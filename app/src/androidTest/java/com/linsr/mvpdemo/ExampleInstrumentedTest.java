package com.linsr.mvpdemo;

import android.content.Context;
import android.content.Intent;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;

import com.linsr.mvpdemo.service.MyIntentService;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {
    @Test
    public void useAppContext() throws Exception {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getTargetContext();

        assertEquals("com.linsr.mvpdemo", appContext.getPackageName());
    }

    @Test
    public void aa() {
        Context appContext = InstrumentationRegistry.getTargetContext();
        appContext.startService(new Intent(appContext, MyIntentService.class));
    }

}
