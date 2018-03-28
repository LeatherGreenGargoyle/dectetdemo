package com.example.andrewtran.dectetdemo.Games.Quincunx;

import com.example.andrewtran.dectetdemo.BaseClasses.BasePresenterView;
import com.example.andrewtran.dectetdemo.Models.Card;

import java.util.List;

/**
 * Created by andrewtran on 3/20/18.
 * Handle view logic for Quincunx.
 */

public interface QuincunxPresenterView extends BasePresenterView {

    void addToHand(Card card);

    void highlight(Card card);

    void place(Card card, int atX, int atY);

    void set(List<Card> hand);

    void showConfirmMove();

    void showConfirmRestart();

    void show(int score);
}
