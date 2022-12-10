package com.example.radiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {
RadioGroup radio1,radio2;
RadioButton a,b,c,d,e,f;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radio1=findViewById(R.id.Radio1);
        radio2=findViewById(R.id.radio2);
        a=findViewById(R.id.a);
        b=findViewById(R.id.b);
        c=findViewById(R.id.c);
        d=findViewById(R.id.d);
        e=findViewById(R.id.e);
        f=findViewById(R.id.f);



        radio1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
              if (a.isChecked()){
                  b.setChecked(false);
                  c.setChecked(false);
                  d.setChecked(false);
                  e.setChecked(false);
                  f.setChecked(false);
              }
                if (b.isChecked()){
                    a.setChecked(false);
                    c.setChecked(false);
                    d.setChecked(false);
                    e.setChecked(false);
                    f.setChecked(false);
                }
                if (c.isChecked()){
                    a.setChecked(false);
                    b.setChecked(false);
                    d.setChecked(false);
                    e.setChecked(false);
                    f.setChecked(false);
                }

            }
        });


        radio2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (d.isChecked()){
                    b.setChecked(false);
                    c.setChecked(false);
                    a.setChecked(false);
                    e.setChecked(false);
                    f.setChecked(false);
                }
                if (e.isChecked()){
                    a.setChecked(false);
                    c.setChecked(false);
                    d.setChecked(false);
                    d.setChecked(false);
                    f.setChecked(false);
                }
                if (f.isChecked()){
                    a.setChecked(false);
                    b.setChecked(false);
                    d.setChecked(false);
                    e.setChecked(false);
                    c.setChecked(false);
                }

            }
        });


    }
}