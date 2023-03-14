package com.example.a333333.ui.project;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ProjectViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public ProjectViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Project");
    }

    public LiveData<String> getText() {
        return mText;
    }
}