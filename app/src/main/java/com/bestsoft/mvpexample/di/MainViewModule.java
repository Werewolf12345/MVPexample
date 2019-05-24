package com.bestsoft.mvpexample.di;

import com.bestsoft.mvpexample.MainActivity;
import com.bestsoft.mvpexample.contracts.MainAppContract;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class MainViewModule {
    @Binds
    abstract MainAppContract.MainView providesMainView(MainActivity mainActivity);
}
