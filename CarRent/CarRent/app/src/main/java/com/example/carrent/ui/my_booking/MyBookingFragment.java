package com.example.carrent.ui.my_booking;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.carrent.ui.my_booking.MyBookingFragment;

public class MyBookingFragment extends Fragment {

//    private FragmentMyBookingBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        MyBookingModel myBookingModel =
                new ViewModelProvider(this).get(MyBookingModel.class);

//        binding = FragmentMyBookingBinding.inflate(inflater, container, false);
//        View root = binding.getRoot();
//
//        final TextView textView = binding.textHome;
//        myBookingModel.getText().observe(getViewLifecycleOwner(), textView::setText);
//        return root;
        return null;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
//        binding = null;
    }
}