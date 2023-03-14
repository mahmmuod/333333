package com.example.a333333.ui.tool;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ToolViewModel extends ViewModel{
    private final MutableLiveData<String> mText;

    public ToolViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Survey");
    }

    public LiveData<String> getText() {
        return mText;
    }
}

