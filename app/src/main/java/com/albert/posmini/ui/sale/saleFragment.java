package com.albert.posmini.ui.sale;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.albert.posmini.R;

public class saleFragment extends Fragment {

    private saleViewModel saleViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        saleViewModel =
                new ViewModelProvider(this).get(saleViewModel.class);
        View root = inflater.inflate(R.layout.fragment_sale, container, false);
        final TextView textView = root.findViewById(R.id.text_sale);
        saleViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}