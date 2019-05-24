package com.bestsoft.mvpexample.contracts;

import com.bestsoft.mvpexample.models.Item;

import java.util.List;

public interface MainAppContract {
    interface MainView {
        void displayItems(List<Item> items);

        void displayProgressBar();

        void hideProgressBar();

        void displayError(Throwable error);
    }

    interface MainPresenter {
        void loadItems();
    }
}
