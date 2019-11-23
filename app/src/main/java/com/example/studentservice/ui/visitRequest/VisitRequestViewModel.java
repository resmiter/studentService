package com.example.studentservice.ui.visitRequest;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class VisitRequestViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public VisitRequestViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is slideshow fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}