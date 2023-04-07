package com.example.music;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class FragMenu2 extends Fragment {
    //创建一个View
    private View zj;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        zj = inflater.inflate(R.layout.frag2_layout, null);
        return zj;
    }
}