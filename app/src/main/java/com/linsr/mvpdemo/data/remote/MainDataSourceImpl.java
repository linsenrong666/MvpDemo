package com.linsr.mvpdemo.data.remote;

import com.linsr.mvpdemo.bean.MainPojo;
import com.linsr.mvpdemo.data.MainDataSource;

import java.util.List;

/**
 * Description
 *
 * @author linsenrong on 2018/3/12 11:16
 */

public class MainDataSourceImpl implements MainDataSource {

    @Override
    public void getList(OnGetListCallback getListCallback) {
        String aa = "aaaa";
        getListCallback.onSuccess(aa);
    }

}
