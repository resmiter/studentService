package com.example.studentservice.ui.visitRequest;

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

public class VisitRequestFragment extends Fragment {

    private VisitRequestViewModel visitRequestViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        visitRequestViewModel =
                ViewModelProviders.of(this).get(VisitRequestViewModel.class);
        View root = inflater.inflate(R.layout.fragment_visit_requests, container, false);
        final TextView textView = root.findViewById(R.id.text_visit_requests);
        visitRequestViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}