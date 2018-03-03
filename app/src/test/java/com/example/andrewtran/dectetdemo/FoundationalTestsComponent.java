package com.example.andrewtran.dectetdemo;

import dagger.Component;

/**
 * Created by andrewtran on 3/3/18.
 */

@FoundationalTestsScope
@Component(dependencies = MainApp.class, modules = FoundationalTestsModule.class)
public interface FoundationalTestsComponent {

    void inject(FoundationalTests foundationalTests);
}
