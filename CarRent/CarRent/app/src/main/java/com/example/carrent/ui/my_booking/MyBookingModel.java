package com.example.carrent.ui.my_booking;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MyBookingModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public MyBookingModel() {
        mText = new MutableLiveData<>();
        mText.setValue("My Booking");
    }

    public LiveData<String> getText() {
        return mText;
    }
}