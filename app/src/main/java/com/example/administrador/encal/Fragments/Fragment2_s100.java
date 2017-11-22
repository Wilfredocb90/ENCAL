package com.example.administrador.encal.Fragments;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.example.administrador.encal.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment2_s100 extends Fragment {
    private EditText p106_edt1;
    private EditText p106_edt2;
    private EditText p106_edt3;
    private EditText p106_edt4;
    private TextView p106_txt;

    private CheckBox p107_ck1;
    private CheckBox p107_ck2;
    private CheckBox p107_ck3;

    private RadioGroup p108_rg1;

    private CheckBox p109_ck1;
    private CheckBox p109_ck2;
    private CheckBox p109_ck3;
    private CheckBox p109_ck4;
    private CheckBox p109_ck5;
    private CheckBox p109_ck6;
    private EditText p109_edt;

    private CheckBox p110_ck1;
    private CheckBox p110_ck2;
    private CheckBox p110_ck3;
    private CheckBox p110_ck4;
    private CheckBox p110_ck5;
    private CheckBox p110_ck6;
    private CheckBox p110_ck7;
    private EditText p110_edt;

    public Fragment2_s100() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment2_s100, container, false);
        p106_edt1 = (EditText) view.findViewById(R.id.sec100_p106_edt1);
        p106_edt2 = (EditText) view.findViewById(R.id.sec100_p106_edt2);
        p106_edt3 = (EditText) view.findViewById(R.id.sec100_p106_edt3);
        p106_edt4 = (EditText) view.findViewById(R.id.sec100_p106_edt4);
        p106_txt = (TextView) view.findViewById(R.id.sec100_p106_txt1);

        p107_ck1 = (CheckBox) view.findViewById(R.id.sec100_p107_ck1);
        p107_ck2 = (CheckBox) view.findViewById(R.id.sec100_p107_ck2);
        p107_ck3 = (CheckBox) view.findViewById(R.id.sec100_p107_ck3);

        p108_rg1 = (RadioGroup) view.findViewById(R.id.sec100_p108_rg);

        p109_ck1 = (CheckBox) view.findViewById(R.id.sec100_p109_ck1);
        p109_ck2 = (CheckBox) view.findViewById(R.id.sec100_p109_ck2);
        p109_ck3 = (CheckBox) view.findViewById(R.id.sec100_p109_ck3);
        p109_ck4 = (CheckBox) view.findViewById(R.id.sec100_p109_ck4);
        p109_ck5 = (CheckBox) view.findViewById(R.id.sec100_p109_ck5);
        p109_ck6 = (CheckBox) view.findViewById(R.id.sec100_p109_ck6);
        p109_edt = (EditText) view.findViewById(R.id.txtEspecifique_p109);

        p110_ck1 = (CheckBox) view.findViewById(R.id.sec100_p110_ck1);
        p110_ck2 = (CheckBox) view.findViewById(R.id.sec100_p110_ck2);
        p110_ck3 = (CheckBox) view.findViewById(R.id.sec100_p110_ck3);
        p110_ck4 = (CheckBox) view.findViewById(R.id.sec100_p110_ck4);
        p110_ck5 = (CheckBox) view.findViewById(R.id.sec100_p110_ck5);
        p110_ck6 = (CheckBox) view.findViewById(R.id.sec100_p110_ck6);
        p110_ck7 = (CheckBox) view.findViewById(R.id.sec100_p110_ck7);
        p110_edt = (EditText) view.findViewById(R.id.txtEspecifique_p110);


        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        //---pregunta108
        p108_rg1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

                switch (i) {
                    case R.id.sec100_p108_rb1:   break;
                    case R.id.sec100_p108_rb2:   break;
                }
            }
        });

        //---pregunta109

        p109_ck6.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b){
                    p109_edt.setVisibility(View.VISIBLE);
                }
                else p109_edt.setVisibility(View.GONE);
            }
        });
        //---pregunta110
        p110_ck7.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b){
                    p110_edt.setVisibility(View.VISIBLE);
                }
                else p110_edt.setVisibility(View.GONE);
            }
        });


    }
}
