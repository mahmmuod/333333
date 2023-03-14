package com.example.a333333.ui.device;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.a333333.R;

public class DeviceFragment extends Fragment {

    public DeviceFragment(){
        //Empty Constructor
    }

@Override


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        DeviceViewModel deviceViewModel =
                new ViewModelProvider(this).get(DeviceViewModel.class);
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