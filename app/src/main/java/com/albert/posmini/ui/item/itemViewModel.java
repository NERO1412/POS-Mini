package com.albert.posmini.ui.item;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class itemViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public itemViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is ITEM fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}