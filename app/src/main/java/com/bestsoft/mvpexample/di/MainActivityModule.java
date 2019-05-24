package com.bestsoft.mvpexample.di;

import com.bestsoft.mvpexample.contracts.MainAppContract;
import com.bestsoft.mvpexample.models.ItemsLoadUseCase;
import com.bestsoft.mvpexample.presenters.MainPresenter;

import dagger.Module;
import dagger.Provides;

@Module
public class MainActivityModule {
    @Provides
    MainPresenter provideMainPresenter(MainAppContract.MainView view, ItemsLoadUseCase itemsLoadUseCase) {
        return new MainPresenter(view, itemsLoadUseCase);
    }
}
