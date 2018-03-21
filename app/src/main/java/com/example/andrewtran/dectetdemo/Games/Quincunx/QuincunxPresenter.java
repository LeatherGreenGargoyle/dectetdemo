package com.example.andrewtran.dectetdemo.Games.Quincunx;

/**
 * Created by andrewtran on 3/20/18.
 * Handle game logic for Quincunx.
 */

abstract public class QuincunxPresenter {

    abstract void onDrawClick();

    abstract void onHandCardClick();

    abstract void onConfirmMoveClick();

    abstract void onSpotClick(int atX, int atY);

    abstract void onRestartClick();

    abstract void onRestartConfirmClick();
}
