package com.example.carrent.ui.about_us;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
//ABOUT US
public class AboutUsModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public AboutUsModel() {
        mText = new MutableLiveData<>();
        mText.setValue("About Us");
    }

    public LiveData<String> getText() {
        return mText;
    }
}