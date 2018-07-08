package com.youtube.dryrun.testmvparchitecture.ui.home;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;

import com.youtube.dryrun.testmvparchitecture.R;
import com.youtube.dryrun.testmvparchitecture.ui.base.BaseActivity;
import com.youtube.dryrun.testmvparchitecture.ui.login.LoginActivity;
import com.youtube.dryrun.testmvparchitecture.ui.login.LoginMvpPresenter;
import com.youtube.dryrun.testmvparchitecture.ui.login.LoginMvpView;

import javax.inject.Inject;

public class HomeActivity extends BaseActivity implements HomeMvpView, View.OnClickListener {

    @Inject
    HomeMvpPresenter<HomeMvpView> mPresenter;

    Button btnLogout;

    public static Intent getStartIntent(Context context){
        Intent intent = new Intent(context, HomeActivity.class);
        return intent;
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        getActivityComponent().inject(this);
        setUp();
        mPresenter.onAttach(HomeActivity.this);
    }


    @Override
    public void openLoginActivity() {
        Intent intent = LoginActivity.getStartIntent(this);
        startActivity(intent);
        finish();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_logout:
                mPresenter.attemptLogout();
                break;
        }
    }

    @Override
    protected void setUp() {
        btnLogout = findViewById(R.id.btn_logout);
        btnLogout.setOnClickListener(this);
    }
}
