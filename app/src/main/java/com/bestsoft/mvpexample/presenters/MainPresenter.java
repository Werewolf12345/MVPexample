package com.bestsoft.mvpexample.presenters;

import com.bestsoft.mvpexample.contracts.MainAppContract;
import com.bestsoft.mvpexample.models.ItemsLoadUseCase;

import javax.inject.Inject;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

public class MainPresenter extends BasePresenter<MainAppContract.MainView> implements MainAppContract.MainPresenter {
    private final ItemsLoadUseCase itemsLoadUseCase;

    @Inject
    public MainPresenter(MainAppContract.MainView view, ItemsLoadUseCase itemsLoadUseCase) {
        super(view);
        this.itemsLoadUseCase = itemsLoadUseCase;
    }

    @Override
    public void loadItems() {
        view.displayProgressBar();
        addDisposable(itemsLoadUseCase.execute()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(items -> {
                    view.hideProgressBar();
                    view.displayItems(items);
                }, error -> {
                    view.hideProgressBar();
                    view.displayError(error);
                }));
    }
}
