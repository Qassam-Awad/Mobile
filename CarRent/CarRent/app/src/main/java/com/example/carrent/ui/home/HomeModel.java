package com.example.carrent.ui.home;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HomeModel extends ViewModel {
    private final MutableLiveData<String> mText;

    public HomeModel(MutableLiveData<String> mText) {
        this.mText = mText;
    }
    public LiveData<String> getText() {
        return mText;
    }
}
