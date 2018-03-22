package com.linsr.mvpdemo.main;

import com.linsr.mvpdemo.BasePresenter;
import com.linsr.mvpdemo.BaseView;

/**
 * Description
 *
 * @author linsenrong on 2018/3/12 10:46
 */

public interface MainContact {

    interface View extends BaseView<Presenter> {
        void successToast();
    }

    interface Presenter extends BasePresenter {

    }

}
