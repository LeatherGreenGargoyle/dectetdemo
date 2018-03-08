package com.example.andrewtran.dectetdemo.Models;

import com.example.andrewtran.dectetdemo.Models.Board.Orientation;

import java.util.Stack;

/**
 * Created by andrewtran on 3/6/18.
 * A SpaceImpl on a Board
 */

public class SpaceImpl implements Space {

     boolean mIsEmpty;
     Stack<CardImpl> mStack;
     @Orientation int mOrientation;

     public SpaceImpl(int orientation) {
          mOrientation = orientation;
     }

    @Override
    public CardImpl takeCard() {
        return mStack.pop();
    }

    @Override
    public void placeCard(CardImpl card) {
        mStack.push(card);
    }
}
