package com.example.administrador.encal.Fragments;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AutoCompleteTextView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
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

    private RadioGroup p103_rg1;
    private RadioButton p103_rb1;
    private RadioButton p103_rb2;
    private RadioButton p103_rb3;
    private RadioButton p103_rb4;
    private RadioButton p103_rb5;
    private RadioButton p103_rb6;
    private EditText p103_edt1;

    private RadioGroup p104_rg1;
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
        p101_txt1 = (TextView) view.findViewById(R.id.sec100_p101_txt1);
        p101_act1 = (AutoCompleteTextView) view.findViewById(R.id.sec100_p101_atc1);
        p101_edt1 = (EditText) view.findViewById(R.id.sec100_p101_edt1);

        p102_ck1 = (CheckBox) view.findViewById(R.id.sec100_p102_ck1);
        p102_ck2 = (CheckBox) view.findViewById(R.id.sec100_p102_ck2);
        p102_ck3 = (CheckBox) view.findViewById(R.id.sec100_p102_ck3);
        p102_ck4 = (CheckBox) view.findViewById(R.id.sec100_p102_ck4);
        p102_txt1 = (TextView) view.findViewById(R.id.sec100_p102_txt1);
        p102_txt2 = (TextView) view.findViewById(R.id.sec100_p102_txt2);
        p102_txt3 = (TextView) view.findViewById(R.id.sec100_p102_txt3);
        p102_txt4 = (TextView) view.findViewById(R.id.sec100_p102_txt4);
        p102_act1 = (AutoCompleteTextView) view.findViewById(R.id.sec100_p102_act1);
        p102_act2 = (AutoCompleteTextView) view.findViewById(R.id.sec100_p102_act2);
        p102_act3 = (AutoCompleteTextView) view.findViewById(R.id.sec100_p102_act3);
        p102_act4 = (AutoCompleteTextView) view.findViewById(R.id.sec100_p102_act4);

        p103_rg1 = (RadioGroup) view.findViewById(R.id.sec100_p103_rg);
        p103_edt1 = (EditText) view.findViewById(R.id.edtEspecifique_p103);

        p104_rg1 = (RadioGroup) view.findViewById(R.id.sec100_p104_rg);

        p105_edt1 = (EditText) view.findViewById(R.id.sec100_p105_edt1);



        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        //-----Pregunta2

        p102_ck1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b){
                    p102_act1.setEnabled(true);
                }
                else p102_act1.setEnabled(false);
            }
        });

        p102_ck2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b){
                    p102_act2.setEnabled(true);
                }
                else p102_act2.setEnabled(false);
            }
        });
        p102_ck3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b){
                    p102_act3.setEnabled(true);
                }
                else p102_act3.setEnabled(false);
            }
        });

        p102_ck4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b){
                    p102_act4.setEnabled(true);
                }
                else p102_act4.setEnabled(false);
            }
        });


        //----pregunta3
        p103_rg1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

                switch (i) {
                    case R.id.sec100_p103_rb1:   p103_edt1.setVisibility(View.GONE);break;
                    case R.id.sec100_p103_rb2:   p103_edt1.setVisibility(View.GONE);break;
                    case R.id.sec100_p103_rb3:   p103_edt1.setVisibility(View.GONE);break;
                    case R.id.sec100_p103_rb4:   p103_edt1.setVisibility(View.GONE);break;
                    case R.id.sec100_p103_rb5:   p103_edt1.setVisibility(View.GONE);break;
                    case R.id.sec100_p103_rb6:   p103_edt1.setVisibility(View.VISIBLE);break;
                }
            }
        });


        //---pregunta4
        p104_rg1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

                switch (i) {
                    case R.id.sec100_p104_rb1:   break;
                    case R.id.sec100_p104_rb2:   break;
                }
            }
        });




    }
}