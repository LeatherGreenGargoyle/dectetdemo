package com.example.andrewtran.dectetdemo.Games.Quincunx;

import com.example.andrewtran.dectetdemo.BaseClasses.BasePresenter;

/**
 * Created by andrewtran on 3/20/18.
 * Handle game logic for Quincunx.
 */

abstract public class QuincunxPresenter extends BasePresenter<QuincunxPresenterView> {

    public abstract void onDrawClick();

    abstract void onHandCardClick();

    abstract void onConfirmMoveClick();

    abstract void onSpotClick(int atX, int atY);

    abstract void onRestartClick();

    abstract void onRestartConfirmClick();
}
