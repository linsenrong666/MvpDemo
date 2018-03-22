package com.linsr.mvpdemo.main;

import com.linsr.mvpdemo.bean.MainPojo;
import com.linsr.mvpdemo.data.MainDataSource;

import java.util.List;

/**
 * Description
 *
 * @author linsenrong on 2018/3/12 10:46
 */

public class MainPresenter implements MainContact.Presenter {

    private MainContact.View mView;
    private MainDataSource mMainDataSource;

    public MainPresenter(MainContact.View view, MainDataSource dataSource) {
        mView = view;
        mMainDataSource = dataSource;
        view.setPresenter(this);
    }

    @Override
    public void start() {
        mMainDataSource.getList(new MainDataSource.OnGetListCallback() {
            @Override
            public void onSuccess(String aa) {

            }

            @Override
            public void onFailed() {

            }
        });
    }
}
