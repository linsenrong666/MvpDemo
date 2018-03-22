package com.linsr.mvpdemo.service;

import android.app.IntentService;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.util.Log;

/**
 * Description
 *
 * @author linsenrong on 2018/3/14 16:37
 */

public class MyIntentService extends IntentService {
    /**
     * Creates an IntentService.  Invoked by your subclass's constructor.
     *
     * @param name Used to name the worker thread, important only for debugging.
     */
    public MyIntentService(String name) {
        super(name);
    }

    public MyIntentService() {
        super("aa");
        Log.d("===", "===MyIntentService curr[" + Thread.currentThread().getId() + "]");
    }

    @Override
    protected void onHandleIntent(@Nullable Intent intent) {
        Log.d("===", "===onHandleIntent curr[" + Thread.currentThread().getId() + "]");
    }
}
