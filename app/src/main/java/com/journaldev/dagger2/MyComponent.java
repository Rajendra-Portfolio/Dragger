package com.journaldev.dagger2;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by anupamchugh on 06/11/17.
 */

@Singleton
@Component(modules = {SharedPrefModule.class})
public interface MyComponent {
    void inject(MainActivity activity);
}
