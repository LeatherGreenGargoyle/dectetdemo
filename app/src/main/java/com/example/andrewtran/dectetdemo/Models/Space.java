package com.example.andrewtran.dectetdemo.Models;

/**
 * Created by andrewtran on 3/7/18.
 */

public interface Space {

    CardImpl takeCard();
    void placeCard(CardImpl card);
}
