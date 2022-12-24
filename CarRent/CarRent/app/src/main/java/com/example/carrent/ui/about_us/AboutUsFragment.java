package com.example.carrent.ui.about_us;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.carrent.ui.about_us.AboutUsFragment;

public class AboutUsFragment extends Fragment {

//    private FragmentAboutUsBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        AboutUsModel aboutUsModel =
                new ViewModelProvider(this).get(AboutUsModel.class);

//        binding = FragmentAboutUsBinding.inflate(inflater, container, false);
//        View root = binding.getRoot();

//        final RelativeLayout textView = binding.textGallery;
//        aboutUsModel.getText().observe(getViewLifecycleOwner(), textView::setGravity);
//        return root;
        return null;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
//        binding = null;
    }
}