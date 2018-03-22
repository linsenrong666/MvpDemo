package com.linsr.mvpdemo.data;


/**
 * Description
 *
 * @author linsenrong on 2018/3/12 11:14
 */

public interface MainDataSource {
    interface OnGetListCallback{
        void onSuccess(String aa);
        void onFailed();
    }
    void getList(OnGetListCallback onGetListCallback);
}
