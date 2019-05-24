package com.bestsoft.mvpexample.di;

import com.bestsoft.mvpexample.App;

import dagger.Component;
import dagger.android.AndroidInjectionModule;
import dagger.android.AndroidInjector;

@Component(modules = {AndroidInjectionModule.class, MyApplicationModule.class})
public interface MyApplicationComponent extends AndroidInjector<App> {
}

