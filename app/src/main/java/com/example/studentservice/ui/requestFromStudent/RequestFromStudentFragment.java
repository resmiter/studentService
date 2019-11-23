package com.example.studentservice.ui.requestFromStudent;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.studentservice.R;

public class RequestFromStudentFragment extends Fragment {

    private RequestFromStudentViewModel requestFromStudentViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        requestFromStudentViewModel =
                ViewModelProviders.of(this).get(RequestFromStudentViewModel.class);
        View root = inflater.inflate(R.layout.fragment_requests_from_students, container, false);
        final TextView textView = root.findViewById(R.id.text_request_from_student);
        requestFromStudentViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}