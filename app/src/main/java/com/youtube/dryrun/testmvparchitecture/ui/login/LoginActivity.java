package com.youtube.dryrun.testmvparchitecture.ui.login;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.youtube.dryrun.testmvparchitecture.R;
import com.youtube.dryrun.testmvparchitecture.data.AppDataManager;
import com.youtube.dryrun.testmvparchitecture.ui.base.BaseActivity;
import com.youtube.dryrun.testmvparchitecture.ui.home.HomeActivity;

import javax.inject.Inject;

public class LoginActivity extends BaseActivity implements LoginMvpView {

    @Inject
    LoginMvpPresenter<LoginMvpView> mPresenter;

    EditText etPassword, etEmail;

    public static Intent getStartIntent(Context context) {
        Intent intent = new Intent(context, LoginActivity.class);
        return intent;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        getActivityComponent().inject(this);

        setUp();
//        mPresenter = new LoginPresenter<>(null);
        mPresenter.onAttach(LoginActivity.this);
    }


    private void onFbClick(View view){
        mPresenter.onFacebookLoginClick();
    }

    private void onGoogleClick(View view){
        mPresenter.onGoogleLoginClick();
    }

    private void onServerLoginClick(View view){
        mPresenter.attemptLogin(etEmail.getText().toString().trim(),
                etPassword.getText().toString().trim());
    }

    @Override
    protected void setUp() {
        etPassword = findViewById(R.id.et_password);
        etEmail = findViewById(R.id.et_email);
    }

    @Override
    public void openMainActivity() {
        Intent intent = HomeActivity.getStartIntent(LoginActivity.this);
        startActivity(intent);
        finish();
    }

    @Override
    protected void onDestroy() {
        mPresenter.onDetach();
        super.onDestroy();
    }
}
