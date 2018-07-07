package com.youtube.dryrun.testmvparchitecture.ui.home;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.youtube.dryrun.testmvparchitecture.R;
import com.youtube.dryrun.testmvparchitecture.ui.base.BaseActivity;

public class HomeActivity extends BaseActivity implements HomeMvpView {


    public static Intent getStartIntent(Context context){
        Intent intent = new Intent(context, HomeActivity.class);
        return intent;
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        setUp();
    }

    @Override
    protected void setUp() {

    }


}
