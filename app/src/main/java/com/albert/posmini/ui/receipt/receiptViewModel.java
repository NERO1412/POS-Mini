package com.albert.posmini.ui.receipt;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class receiptViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public receiptViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is RECEIPT fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}