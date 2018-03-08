package com.example.andrewtran.dectetdemo.Models;

import com.example.andrewtran.dectetdemo.Models.Board.Orientation;

import java.util.List;

/**
 * Created by andrewtran on 3/6/18.
 * A Space on a Board
 */

public class Space {

     boolean mIsEmpty;
     List<Card> mStack;
     @Orientation int mOrientation;

     public Space(int orientation) {
          mOrientation = orientation;
     }

     public void placeCard(Card card) {

     }
}
