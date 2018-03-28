package com.example.andrewtran.dectetdemo.Games.Quincunx;

import android.support.annotation.NonNull;

import com.example.andrewtran.dectetdemo.Models.Card;
import com.example.andrewtran.dectetdemo.Models.DeckImpl;
import com.example.andrewtran.dectetdemo.R;
import com.example.andrewtran.dectetdemo.Utils.ResourceInteractor;

import java.util.List;

/**
 * Created by andrewtran on 3/20/18.
 * <p>
 * Implementation of QuincunxPresenter.
 */

public class QuincunxPresenterImpl extends QuincunxPresenter {

    static final int STARTING_HAND_SIZE = 8;

    @NonNull
    private final ResourceInteractor mResources;

    private List<Card> mHand;
    private DeckImpl mDeck;
    private Card mSelected;

    public QuincunxPresenterImpl(@NonNull ResourceInteractor resources) {
        mResources = resources;
    }

    @Override
    public void onAttachView(@NonNull QuincunxPresenterView presenterView) {
        super.onAttachView(presenterView);

        mDeck = new DeckImpl(mResources.getStringArray(R.array.card_suits),
                mResources.getIntArray(R.array.card_ranks),
                mResources.getStringArray(R.array.card_names));

        mHand = mDeck.drawCards(STARTING_HAND_SIZE);
        presenterView.set(mHand);
    }

    @Override
    void onDrawClick() {
        Card newCard = mDeck.drawCard();
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
