package com.linsr.mvpdemo.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.annotation.Nullable;
import android.util.Log;

import com.linsr.mvpdemo.aidl.IMyAidlInterface;

/**
 * Description
 *
 * @author linsenrong on 2018/3/13 11:06
 */

public class MyService extends Service {

    @Override
    public void onCreate() {
        super.onCreate();
        Log.d("===", "===MyService curr[" + Thread.currentThread().getId() + "]");
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        Log.e("===", String.format("on bind,intent = %s", intent.toString()));
        return new MyBinder();
    }

    class MyBinder extends IMyAidlInterface.Stub {


        @Override
        public int add(int i1, int i2) throws RemoteException {
            return i1+i2;
        }
    }
}
