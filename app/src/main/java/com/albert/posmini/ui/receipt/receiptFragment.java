package com.albert.posmini.ui.receipt;

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

public class receiptFragment extends Fragment {

    private receiptViewModel receiptViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        receiptViewModel =
                new ViewModelProvider(this).get(receiptViewModel.class);
        View root = inflater.inflate(R.layout.fragment_receipt, container, false);
        final TextView textView = root.findViewById(R.id.text_receipt);
        receiptViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}