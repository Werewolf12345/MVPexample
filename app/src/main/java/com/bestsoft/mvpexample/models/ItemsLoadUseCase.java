package com.bestsoft.mvpexample.models;

import java.util.List;

import javax.inject.Inject;

import io.reactivex.Single;

public class ItemsLoadUseCase {
    @Inject
    ItemsRepository itemsRepository;

    @Inject
    public ItemsLoadUseCase() {
    }

    public Single<List<Item>> execute() {
        return itemsRepository.getItems();
    }
}
