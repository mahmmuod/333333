package com.example.a333333.ui.survey;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SurveyViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public SurveyViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Survey");
    }

    public LiveData<String> getText() {
        return mText;
    }
}