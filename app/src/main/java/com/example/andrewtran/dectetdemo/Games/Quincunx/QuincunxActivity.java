package com.example.andrewtran.dectetdemo.Games.Quincunx;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.andrewtran.dectetdemo.Models.Card;

import java.util.List;

import javax.inject.Inject;

/**
 * Created by andrewtran on 3/20/18.
 *
 * Implementation of QuincunxPresenterView.
 */

public class QuincunxActivity extends AppCompatActivity implements QuincunxPresenterView {

    @Inject
    QuincunxPresenter mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mPresenter.onAttachView(this);
    }

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
    public void set(List<Card> hand) {

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

    @Override
    public void initialize() {

    }

    @Override
    public void exit() {

    }
}
