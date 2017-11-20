package com.example.administrador.encal.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AutoCompleteTextView;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import com.example.administrador.encal.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment1_s100 extends Fragment {
    private TextView p101_txt1;
    private AutoCompleteTextView p101_act1;
    private EditText p101_edt1;

    private CheckBox p102_ck1;
    private CheckBox p102_ck2;
    private CheckBox p102_ck3;
    private CheckBox p102_ck4;
    private TextView p102_txt1;
    private TextView p102_txt2;
    private TextView p102_txt3;
    private TextView p102_txt4;
    private AutoCompleteTextView p102_act1;
    private AutoCompleteTextView p102_act2;
    private AutoCompleteTextView p102_act3;
    private AutoCompleteTextView p102_act4;

    private RadioButton p103_rb1;
    private RadioButton p103_rb2;
    private RadioButton p103_rb3;
    private RadioButton p103_rb4;
    private RadioButton p103_rb5;
    private RadioButton p103_rb6;
    private EditText p103_edt1;

    private RadioButton p104_rb1;
    private RadioButton p104_rb2;

    private  EditText p105_edt1;




    public Fragment1_s100() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment1_s100, container, false);


        return view;
    }

}
