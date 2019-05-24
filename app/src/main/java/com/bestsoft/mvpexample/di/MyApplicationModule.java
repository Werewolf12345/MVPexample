package com.bestsoft.mvpexample.di;

import com.bestsoft.mvpexample.MainActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class MyApplicationModule {
    @ContributesAndroidInjector(modules = {MainViewModule.class, MainActivityModule.class})
    abstract MainActivity contributeActivityInjector();
}
