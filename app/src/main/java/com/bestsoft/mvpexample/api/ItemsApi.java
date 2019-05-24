package com.bestsoft.mvpexample.api;

import com.bestsoft.mvpexample.models.Item;

import java.util.List;

import io.reactivex.Single;
import retrofit2.http.GET;

public interface ItemsApi {
    @GET("/items")
    Single<List<Item>> getItems();
}
