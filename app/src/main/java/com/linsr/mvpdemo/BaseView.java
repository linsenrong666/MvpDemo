package com.linsr.mvpdemo;

/**
 * Description
 *
 * @author linsenrong on 2018/3/12 10:59
 */

public interface BaseView<T> {
    void setPresenter(T presenter);
}
