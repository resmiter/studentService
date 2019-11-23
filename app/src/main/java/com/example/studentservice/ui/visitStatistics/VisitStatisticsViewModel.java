package com.example.studentservice.ui.visitStatistics;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class VisitStatisticsViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public VisitStatisticsViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is share fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}