package com.example.a333333.ui.dashboard;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.a333333.R;
import com.example.a333333.connection;
import com.example.a333333.databinding.FragmentDashboardBinding;

public class DashboardFragment extends Fragment {

    public DashboardFragment(){
        //Empty Constructor
    }

@Override


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        DashboardViewModel dashboardViewModel =
                new ViewModelProvider(this).get(DashboardViewModel.class);
        View view = inflater
                .inflate(R.layout.fragment_dashboard, container, false);
        connection(view);
        return view;

    }


    private void connection(View view){
        ImageButton btn = (ImageButton) view.findViewById(R.id.connectionButton);

            btn.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View view) {



                }
            });






    }



}