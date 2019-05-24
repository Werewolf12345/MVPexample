package com.bestsoft.mvpexample.models;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Base64;

import com.bestsoft.mvpexample.api.ItemsApi;
import com.bestsoft.mvpexample.api.RetrofitClientInstance;

import java.util.List;

import javax.inject.Inject;

import io.reactivex.Single;

public class ItemsRepository {
    @Inject
    public ItemsRepository() {
    }

    public Single<List<Item>> getItems() {
        return RetrofitClientInstance.getRetrofitInstance().create(ItemsApi.class)
                .getItems();
    }

    public static Bitmap getBitmapFromString(String stringPicture) {
        byte[] decodedString = Base64.decode(stringPicture, Base64.DEFAULT);
        return BitmapFactory.decodeByteArray(decodedString, 0, decodedString.length);
    }
}
