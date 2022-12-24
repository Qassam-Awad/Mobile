package com.example.carrent.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.RecyclerView;

import com.example.carrent.ui.home.HomeFragment;

public class HomeFragment extends Fragment {
//    private FragmentHomeBinding binding;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        HomeModel homeModel =
                new ViewModelProvider(this).get(HomeModel.class);
//        binding = FragmentHomeBinding.inflate(inflater,container,false);
//        View root = binding.getRoot();
//        final RecyclerView recyclerView =binding.carRec;
//        homeModel.getText().observe(getViewLifecycleOwner(), RecyclerView::set);
//        return  root;
        return null;

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
//        binding = null;
    }
}
