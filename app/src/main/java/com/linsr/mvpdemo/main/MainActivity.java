package com.linsr.mvpdemo.main;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.linsr.mvpdemo.R;

/**
 * Description
 *
 * @author linsenrong on 2018/3/12 10:45
 */

public class MainActivity extends AppCompatActivity implements MainContact.View {

    private MainContact.Presenter mPresenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mPresenter =new MainPresenter(this,null);
    }

    @Override
    public void setPresenter(MainContact.Presenter presenter) {
        mPresenter = presenter;
    }

    @Override
    public void successToast() {
        Toast.makeText(this, "hahaha", Toast.LENGTH_SHORT).show();
    }
}
