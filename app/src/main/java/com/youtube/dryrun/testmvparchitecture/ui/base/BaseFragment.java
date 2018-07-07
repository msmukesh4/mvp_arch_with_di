package com.youtube.dryrun.testmvparchitecture.ui.base;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.StringRes;
import android.support.v4.app.Fragment;
import android.view.View;

import com.youtube.dryrun.testmvparchitecture.utils.AppUtils;

public abstract class BaseFragment extends Fragment implements MvpView {

    private BaseActivity mActivity;
    private ProgressDialog mProgressDialog;


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof BaseActivity){
            BaseActivity activity = (BaseActivity) context;
            this.mActivity = activity;
            mActivity.onFragmentAttached();
        }
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        setUp(view);
    }

    // ***** MvpView method starts *****
    @Override
    public void showLoading() {
        hideLoading();
        mProgressDialog = AppUtils.showLoadingDialog(this.getContext());
    }

    @Override
    public void hideLoading() {
        if (mProgressDialog != null && mProgressDialog.isShowing())
            mProgressDialog.cancel();
    }

    @Override
    public void showMessage(String message) {
        if (mActivity != null)
            mActivity.showMessage(message);
    }

    @Override
    public void showMessage(@StringRes int message) {
        if (mActivity != null)
            mActivity.showMessage(message);
    }

    @Override
    public void showError(String error) {
        if (mActivity != null)
            mActivity.showError(error);
    }

    @Override
    public void showError(@StringRes int error) {
        if (mActivity != null)
            mActivity.showError(error);
    }

    @Override
    public void hideKeyboard() {
        if (mActivity != null)
            mActivity.hideKeyboard();
    }
    // ***** MvpView method ends *****

    protected abstract void setUp(View view);

    public BaseActivity getBaseActivity() {
        return mActivity;
    }

    @Override
    public void onDetach() {
        mActivity = null;
        super.onDetach();
    }

    public interface Callback{

        void onFragmentAttached();

        void onFragmentDetached();

    }
}
