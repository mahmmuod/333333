package com.example.a333333.ui.survey;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.a333333.databinding.FragmentSurveyBinding;

public class SurveyFragment extends Fragment {

    private FragmentSurveyBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        SurveyViewModel surveyViewModel = new ViewModelProvider(this).get(SurveyViewModel.class);

        binding = FragmentSurveyBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}