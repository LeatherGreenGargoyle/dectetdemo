package com.example.andrewtran.dectetdemo.Games.Quincunx;

import com.example.andrewtran.dectetdemo.AppComponent;

import dagger.Component;

/**
 * Created by andrewtran on 3/20/18.
 *
 * Quincunx component interface for Dagger functionality.
 */

@QuincunxScope
@Component(dependencies = AppComponent.class, modules = {QuincunxModule.class})
interface QuincunxComponent {

    void inject(QuincunxActivity activity);
}
