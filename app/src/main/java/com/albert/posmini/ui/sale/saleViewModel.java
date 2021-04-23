package com.albert.posmini.ui.sale;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class saleViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public saleViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is SALE fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}