package com.example.andrewtran.dectetdemo.Games.Quincunx;

import com.example.andrewtran.dectetdemo.Models.Card;

import javax.inject.Inject;

/**
 * Created by andrewtran on 3/20/18.
 *
 * Implementation of QuincunxPresenterView.
 */

public class QuincunxActivity implements QuincunxPresenterView {

    @Inject
    QuincunxPresenter mPresenter;

    @Override
    public void addToHand(Card card) {

    }

    @Override
    public void highlight(Card card) {

    }

    @Override
    public void place(Card card, int atX, int atY) {

    }

    @Override
    public void setHand() {

    }

    @Override
    public void showConfirmMove() {

    }

    @Override
    public void showConfirmRestart() {

    }

    @Override
    public void show(int score) {

    }
}
