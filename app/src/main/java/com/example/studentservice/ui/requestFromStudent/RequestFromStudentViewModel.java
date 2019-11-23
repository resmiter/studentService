package com.example.studentservice.ui.requestFromStudent;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class RequestFromStudentViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public RequestFromStudentViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Request from student fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}