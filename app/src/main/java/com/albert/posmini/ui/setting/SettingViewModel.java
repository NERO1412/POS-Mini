package com.albert.posmini.ui.setting;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SettingViewModel extends ViewModel {

    private MutableLiveData<String> mtext;

    public SettingViewModel() {
        mtext = new MutableLiveData<>();
        mtext.setValue("This is SETTING fragment");
    }

    public LiveData<String> getText() {
        return mtext;
    }
}