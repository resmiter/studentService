package com.example.studentservice.ui.visitStatistics;

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

public class VisitStatisticsFragment extends Fragment {

    private VisitStatisticsViewModel visitStatisticsViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        visitStatisticsViewModel =
                ViewModelProviders.of(this).get(VisitStatisticsViewModel.class);
        View root = inflater.inflate(R.layout.fragment_group_visit_statistics, container, false);
        final TextView textView = root.findViewById(R.id.text_group_visit_statistic);
        visitStatisticsViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}