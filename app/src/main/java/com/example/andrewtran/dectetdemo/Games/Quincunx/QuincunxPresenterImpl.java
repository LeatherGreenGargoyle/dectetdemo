package com.example.andrewtran.dectetdemo.Games.Quincunx;

import android.support.annotation.NonNull;

import com.example.andrewtran.dectetdemo.Utils.ResourceInteractor;

/**
 * Created by andrewtran on 3/20/18.
 *
 * Implementation of QuincunxPresenter.
 */

public class QuincunxPresenterImpl extends QuincunxPresenter {

    @NonNull
    private final ResourceInteractor mResources;

    QuincunxPresenterImpl(@NonNull ResourceInteractor resources) {
        mResources = resources;
    }

    @Override
    void onDrawClick() {

    }

    @Override
    void onHandCardClick() {

    }

    @Override
    void onConfirmMoveClick() {

    }

    @Override
    void onSpotClick(int atX, int atY) {

    }

    @Override
    void onRestartClick() {

    }

    @Override
    void onRestartConfirmClick() {

    }
}
